package hu.flowacademy.carsharing.Service;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Domain.Reservation;
import hu.flowacademy.carsharing.Exception.CannotDeleteException;
import hu.flowacademy.carsharing.Exception.CarNotFoundException;
import hu.flowacademy.carsharing.Exception.ReservationNotFoundException;
import hu.flowacademy.carsharing.Repository.CarRepository;
import hu.flowacademy.carsharing.Repository.DriverRepository;
import hu.flowacademy.carsharing.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
        List<Reservation> list = reservationRepository.findByReserveStartBetween(reservation.getReserveStart(), reservation.getReserveEnding());
        if( list != null && !list.isEmpty()) {
            for (Reservation reserve:list) {
                if(reserve.getReserveStart().equals(reservation.getReserveStart()) && reserve.getReserveEnding().equals(reservation.getReserveEnding())) {
                    throw new CarNotFoundException(" az autó már foglalt ");
                } else if (reservation.getCar().getExpireDate().isAfter(reserve.getReserveStart()) && reservation.getCar().getExpireDate().isBefore(reserve.getReserveEnding())) {
                    throw new CarNotFoundException(" lejárt műszaki ");
                } else if (reservation.getDriver().getExpireDate().isAfter(reserve.getReserveStart()) && reservation.getDriver().getExpireDate().isBefore(reserve.getReserveEnding())){
                    throw new CarNotFoundException(" lejárt jogsi ");
                }
            }
        }
        return reservationRepository.save(reservation);

    }

}
