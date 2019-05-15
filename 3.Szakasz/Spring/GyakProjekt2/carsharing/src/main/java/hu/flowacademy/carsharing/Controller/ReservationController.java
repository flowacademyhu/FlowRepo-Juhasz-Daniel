package hu.flowacademy.carsharing.Controller;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Domain.Driver;
import hu.flowacademy.carsharing.Domain.Reservation;
import hu.flowacademy.carsharing.Service.CarService;
import hu.flowacademy.carsharing.Service.DriverService;
import hu.flowacademy.carsharing.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/get/{reserveId}")
    public ResponseEntity<Reservation> findOneReservation(@PathVariable String reserveId) {
        return ResponseEntity.ok(reservationService.findByReserveId(reserveId));
    }

    @GetMapping("/get")
    public ResponseEntity<List<Reservation>> findAll() {
        return ResponseEntity.ok(reservationService.findAll());
    }

    @PutMapping("/update")
    public ResponseEntity<Reservation> update(@RequestBody Reservation reservation) {
        return ResponseEntity.ok(reservationService.save(reservation));
    }

    @PostMapping("/post")
    public ResponseEntity<Reservation> post(@RequestBody Reservation reservation) {
        return ResponseEntity.ok(reservationService.save(reservation));
    }

    @DeleteMapping("/delete/{reserveId}")
    public ResponseEntity<Void> deleteReservation(@PathVariable String reserveId) {
        reservationService.deleteReservation(reserveId);
        return ResponseEntity.noContent().build();
    }

}
