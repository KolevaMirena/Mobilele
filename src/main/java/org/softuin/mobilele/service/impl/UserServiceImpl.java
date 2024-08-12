package org.softuin.mobilele.service.impl;
import org.softuin.mobilele.model.dto.UserRegistrationDTO;
import org.softuin.mobilele.model.entity.UserEntity;
import org.softuin.mobilele.repository.UserRepository;
import org.softuin.mobilele.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,  PasswordEncoder passwordEncoder){

        this.userRepository= userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {

        userRepository.save(map(userRegistrationDTO));


    }

    private  UserEntity map(UserRegistrationDTO userRegistrationDTO){

        UserEntity userEntity = new UserEntity();

        userEntity.setActive(true);
        userEntity.setFirstName(userRegistrationDTO.firstName());
        userEntity.setLastName(userRegistrationDTO.lastName());
        userEntity.setEmail(userRegistrationDTO.email());
        userEntity.setPassword(this.passwordEncoder.encode(userRegistrationDTO.password()));

        return userEntity;

    }
}
