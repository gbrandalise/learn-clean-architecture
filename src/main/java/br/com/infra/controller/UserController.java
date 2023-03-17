package br.com.infra.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infra.dto.UserDto;
import br.com.infra.service.UserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    @NonNull private UserService userService;
    
    @PostMapping
    public void insert(@RequestBody UserDto user) {
        userService.insert(user);
    }
    
}
