package hu.flowacademy.Badge.service;

import hu.flowacademy.Badge.domain.User;
import hu.flowacademy.Badge.exception.UserNotFoundException;
import hu.flowacademy.Badge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User findById(String userName) {
        if(userRepository.findById(userName).isPresent()){
            return userRepository.findById(userName).get();
        }
        throw new UserNotFoundException(userName);
    }

    public User post(User user) {
        if(userRepository.findById(user.getUserName()).isPresent()){
            throw new UserNotFoundException(user.getUserName());
        }
        return userRepository.save(user);
    }

    public User update(User user) {
        if(userRepository.findById(user.getUserName()).isPresent()){
            return userRepository.save(user);
        }
        throw new UserNotFoundException(user.getUserName());

    }

    public void deleteUser(String userName) {
            userRepository.deleteById(userName);

    }

}
