package ee.stock_txns.business;

import ee.stock_txns.business.dto.LoginResponse;
import ee.stock_txns.domain.user.User;
import ee.stock_txns.domain.user.UserMapper;
import ee.stock_txns.domain.user.UserRepository;
import ee.stock_txns.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserMapper userMapper;

    public LoginResponse login(String username, String password) {
        Optional<User> userOptional = userRepository.findBy(username, password);
        Validation.validateUserCredentials(userOptional);
        User user = userOptional.get();
        LoginResponse loginResponse = userMapper.toLoginResponse(user);
        return loginResponse;
    };




}
