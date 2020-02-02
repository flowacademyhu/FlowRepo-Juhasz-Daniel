package hu.flowacademy.bider.Service;

import hu.flowacademy.bider.Domain.Bid;
import hu.flowacademy.bider.Domain.Product;
import hu.flowacademy.bider.Exception.NotFoundedException;
import hu.flowacademy.bider.Repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidService {

    @Autowired
    private BidRepository bidRepository;

    public List<Bid> findAll(){
        return bidRepository.findAll();
    }

    public Bid findById(Long id) {
        if(bidRepository.findById(id).isPresent()){
            return bidRepository.findById(id).get();
        } else {
            throw new NotFoundedException(id);
        }
    }

    public Bid save(Bid bid) {
        if(bidRepository.findById(bid.getId()).isPresent()) {
            return bidRepository.save(bid);
        } else {
            return bidRepository.save(bid);
        }
    }

    public void delete(Long id) {
        if(bidRepository.findById(id).isPresent()){
            bidRepository.deleteById(id);
        } else {
            throw new NotFoundedException(id);
        }
    }

}
