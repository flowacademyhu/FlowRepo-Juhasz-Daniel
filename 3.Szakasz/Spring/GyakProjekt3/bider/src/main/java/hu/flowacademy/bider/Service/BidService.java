package hu.flowacademy.bider.Service;

import hu.flowacademy.bider.Domain.Bid;
import hu.flowacademy.bider.Exception.ProductException;
import hu.flowacademy.bider.Repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidService {

    @Autowired
    private BidRepository bidRepository;

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

    public void delete(Long id) {
        if(bidRepository.findById(id).isPresent()) {
            bidRepository.deleteById(id);
        } else {
            throw new ProductException(id);
        }
    }

    public Bid post(Bid bid) {
        if (bidRepository.findById(bid.getId()).isPresent()) {
            return bidRepository.save(bid);
        } else {
            throw new ProductException(bid.getId());
        }
    }

    public Bid put(Bid bid) {
        if (bidRepository.findById(bid.getId()).isEmpty()) {
            return post(bid);
        }
        return bidRepository.save(bid);
    }

}
