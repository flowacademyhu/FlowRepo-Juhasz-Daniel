package hu.flowacademy.carsharing.Service;

import hu.flowacademy.carsharing.Domain.Reservation;
import hu.flowacademy.carsharing.Exception.ReservationNotFoundException;
import hu.flowacademy.carsharing.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation findByReserveId(String reserveId){
        if (reservationRepository.findById(reserveId).isPresent()) {
            return reservationRepository.findById(reserveId).get();
        }
        throw new ReservationNotFoundException(reserveId);
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public void deleteReservation(String reserveId) {
        if(reservationRepository.findById(reserveId).isPresent()) {
            reservationRepository.deleteById(reserveId);
        } else {
            throw new ReservationNotFoundException(reserveId);
        }
    }

    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

}
