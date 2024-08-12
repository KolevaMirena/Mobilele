package org.softuin.mobilele.service.impl;
import org.softuin.mobilele.model.dto.UserRegistrationDTO;
import org.softuin.mobilele.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {

        System.out.println("user service registration");

    }
}
