package hu.flowacademy.Badge.service;

import hu.flowacademy.Badge.domain.Badge;
import hu.flowacademy.Badge.exception.BadgeNotFoundException;
import hu.flowacademy.Badge.repository.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    public List<Badge> getAll() {
        return badgeRepository.findAll();
    }

    public Badge findById(String id) {
        if(badgeRepository.findById(id).isPresent()){
            return badgeRepository.findById(id).get();
        }
        throw new BadgeNotFoundException(id);
    }

    public Badge post(Badge badge) {
        return badgeRepository.save(badge);
    }

    public Badge update(Badge badge) {
        if(badgeRepository.findById(badge.getId()).isPresent()){
            return badgeRepository.save(badge);
        }
        throw new BadgeNotFoundException(badge.getId());

    }

    public void deleteUser(String id) {
        badgeRepository.deleteById(id);
    }

}
