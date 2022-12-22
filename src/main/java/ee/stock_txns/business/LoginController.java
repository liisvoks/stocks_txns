package ee.stock_txns.business;

import ee.stock_txns.business.dto.LoginResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class LoginController {

    @Resource
    UserService userService;

    @GetMapping("/login")
    @Operation(summary = "Logib teenusesse sisse, tagastab userId")
    public LoginResponse login(@RequestParam String username, @RequestParam String password) {
        LoginResponse loginResponse = userService.login (username, password);
        return loginResponse;
    }
}
