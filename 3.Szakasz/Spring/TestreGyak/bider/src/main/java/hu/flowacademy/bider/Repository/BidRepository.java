package hu.flowacademy.bider.Repository;

import hu.flowacademy.bider.Domain.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepository extends JpaRepository<Bid,Long> {
}
