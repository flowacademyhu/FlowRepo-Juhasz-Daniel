package hu.flowacademy.bider.Util;

import hu.flowacademy.bider.Domain.Bid;
import hu.flowacademy.bider.Domain.Product;
import hu.flowacademy.bider.Repository.BidRepository;
import hu.flowacademy.bider.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;

@Component
public class BiderStartUpRunner implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BidRepository bidRepository;

    @Override
    public void run(String... args) throws Exception {

        Product product1 = new Product("Szobor", "Kőből van", 10, LocalDate.of(2019, Month.FEBRUARY, 2), LocalDate.of(2019, Month.FEBRUARY, 23));
        Product product2 = new Product("Fog", "Fehér", 5, LocalDate.of(2019, Month.NOVEMBER, 2), LocalDate.of(2019, Month.NOVEMBER, 23));
        Product product3 = new Product("Lego kocka", "Jó", 7, LocalDate.of(2019, Month.JANUARY, 2), LocalDate.of(2019, Month.JANUARY, 23));
        Product product4 = new Product("Fehér konyhafal", "Bestbuy", 1, LocalDate.of(2019, Month.MARCH, 2), LocalDate.of(2019, Month.MARCH, 23));

        Bid bid1 = new Bid(20, "Feri", LocalDate.of(2019, Month.FEBRUARY, 10), product1);
        Bid bid2 = new Bid(30, "Dani", LocalDate.of(2019, Month.FEBRUARY, 10), product1);
        Bid bid3 = new Bid(10, "Zoli", LocalDate.of(2019, Month.NOVEMBER, 3), product2);
        Bid bid4 = new Bid(50, "Andor", LocalDate.of(2019, Month.NOVEMBER, 3), product2);
        Bid bid5 = new Bid(5, "Pecze Úr", LocalDate.of(2019, Month.NOVEMBER, 2), product2);
        Bid bid6 = new Bid(70, "Andris", LocalDate.of(2019, Month.JANUARY, 4), product3);
        Bid bid7 = new Bid(20, "Simon", LocalDate.of(2019, Month.MARCH, 10), product4);

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);

        bidRepository.save(bid1);
        bidRepository.save(bid2);
        bidRepository.save(bid3);
        bidRepository.save(bid4);
        bidRepository.save(bid5);
        bidRepository.save(bid6);
        bidRepository.save(bid7);
    }
}
