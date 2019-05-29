package hu.flowacademy.bider.Repository;

import hu.flowacademy.bider.Domain.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BidRepository extends JpaRepository<Bid, Long> {

   public List<Bid> findByProduct_IdOrderByLicitPriceAsc(Long id);

}
