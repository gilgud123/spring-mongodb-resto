package be.kdv.takeaway.service;

import be.kdv.takeaway.exception.EntityNotFoundException;
import be.kdv.takeaway.exception.UserNotFoundException;
import be.kdv.takeaway.model.User;
import be.kdv.takeaway.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService implements UserDetailsService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws EntityNotFoundException {
        return userRepository.findByUsername(username).orElseThrow(() -> new EntityNotFoundException(username, UserDetails.class));

    }
}

