package ips.loginsignup.controller;

import ips.loginsignup.dto.AdminRequestDto;
import ips.loginsignup.dto.AdminResponseDto;
import ips.loginsignup.repository.UserRepository;
import ips.loginsignup.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private  final UserRepository userRepository;
    private  final AuthService authService ;

    @PreAuthorize("hasRole('SUPER_ADMIN')")
    @PostMapping("/createAdmin")
    public ResponseEntity<AdminResponseDto> CreateAdmin(@RequestBody AdminRequestDto dto ){

        return ResponseEntity.ok(authService.CreateAdmin(dto));
    }



}
