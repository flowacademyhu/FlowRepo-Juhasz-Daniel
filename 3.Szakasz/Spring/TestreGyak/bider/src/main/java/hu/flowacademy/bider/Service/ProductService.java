package hu.flowacademy.bider.Service;

import hu.flowacademy.bider.Domain.Product;
import hu.flowacademy.bider.Exception.NotFoundedException;
import hu.flowacademy.bider.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        if(productRepository.findById(id).isPresent()) {
            return productRepository.findById(id).get();
        } else {
            throw new NotFoundedException(id);
        }
    }

    public Product save(Product product) {
        if(productRepository.findById(product.getId()).isPresent()) {
            return productRepository.save(product);
        } else {
            return productRepository.save(product);
        }
    }

    public void delete(Long id) {
        if(productRepository.findById(id).isPresent()){
            productRepository.deleteById(id);
        } else {
            throw new NotFoundedException(id);
        }
    }

}
