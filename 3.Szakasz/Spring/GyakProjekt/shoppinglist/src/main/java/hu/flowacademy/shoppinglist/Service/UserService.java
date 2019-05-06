package hu.flowacademy.shoppinglist.Service;

import hu.flowacademy.shoppinglist.Exceptions.UserNotFoundException;
import hu.flowacademy.shoppinglist.domain.User;
import hu.flowacademy.shoppinglist.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepo repository;

    public User save(User user) {
        return repository.save(user);
    }

    public void delete(String id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new UserNotFoundException(id);
        }
    }

    public List<User> get() {
        return repository.findAll();
    }

    public User getById(String id) {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        throw new UserNotFoundException(id);
    }
}
