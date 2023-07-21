package com.example.Demo_Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amresh Tripathy
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/SayHello")
    public String sayHello() {
        return "Hi User";
    }
}
