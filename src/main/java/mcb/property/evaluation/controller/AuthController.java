package mcb.property.evaluation.controller;

import mcb.property.evaluation.entity.User;
import mcb.property.evaluation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        // Implement authentication logic
        return ResponseEntity.ok("Login successful");
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }
}
