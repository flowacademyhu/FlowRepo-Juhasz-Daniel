package hu.flowacademy.bider.Repository;

import hu.flowacademy.bider.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
