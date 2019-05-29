package hu.flowacademy.bider.Service;

import hu.flowacademy.bider.Domain.Bid;
import hu.flowacademy.bider.Domain.Product;
import hu.flowacademy.bider.Exception.ProductException;
import hu.flowacademy.bider.Repository.BidRepository;
import hu.flowacademy.bider.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BidService {

    @Autowired
    private BidRepository bidRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<Bid> getAll(){

        return bidRepository.findAll();
    }

    public Bid getProduct(Long id){
        if(bidRepository.findById(id).isPresent()) {
            return bidRepository.findById(id).get();
        } else {
            throw new ProductException(id);
        }
    }

    public List<Bid> getInOrder(Long id) {
        if(bidRepository.findById(id).isPresent()) {
            return bidRepository.findByProduct_IdOrderByLicitPriceAsc(id);
        } else {
            throw new ProductException(id);
        }

    }

    public void delete(Long id) {
        if(bidRepository.findById(id).isPresent() && bidRepository.findById(id).get().getProduct() != null) {
            bidRepository.deleteById(id);
        } else {
            throw new ProductException(id);
        }
    }

    public Bid put(Long id, Bid bid) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent() && product.get().getLicitLimitDate().isAfter(LocalDate.now()) && product.get().getPrice() < bid.getLicitPrice()) {
            Product newProduct = product.get();
            bid.setProduct(newProduct);
            return bidRepository.save(bid);
        } else {
            throw new ProductException(id);
        }
    }

}
