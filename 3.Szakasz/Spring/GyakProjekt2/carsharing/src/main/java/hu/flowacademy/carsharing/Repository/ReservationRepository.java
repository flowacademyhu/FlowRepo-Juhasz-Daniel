package hu.flowacademy.carsharing.Repository;

import hu.flowacademy.carsharing.Domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {

    public void deleteById(String reserveId);

    public List<Reservation> findByReserveStartBetween(LocalDate start, LocalDate end);
}
