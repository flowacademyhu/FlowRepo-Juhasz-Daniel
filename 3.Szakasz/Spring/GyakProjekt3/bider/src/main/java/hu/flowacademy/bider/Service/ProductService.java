package hu.flowacademy.bider.Service;

import hu.flowacademy.bider.Domain.Product;
import hu.flowacademy.bider.Exception.ProductException;
import hu.flowacademy.bider.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product getProduct(Long id){
        if(productRepository.findById(id).isPresent()) {
            return productRepository.findById(id).get();
        } else {
            throw new ProductException(id);
        }
    }

    public void delete(Long id) {
        if(productRepository.findById(id).isPresent()) {
            productRepository.deleteById(id);
        } else {
            throw new ProductException(id);
        }
    }

    public Product post(Product product) {
        if (productRepository.findById(product.getId()).isPresent()) {
            return productRepository.save(product);
        } else {
            throw new ProductException(product.getId());
        }
    }

    public Product put(Product product) {
        if (productRepository.findById(product.getId()).isEmpty()) {
            return post(product);
        }
        return productRepository.save(product);
    }

}
