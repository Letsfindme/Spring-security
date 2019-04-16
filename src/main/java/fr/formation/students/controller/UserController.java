package fr.formation.students.controller;

import fr.formation.students.dtos.UserCreateDto;
import fr.formation.students.dtos.UserUpdateDto;
import fr.formation.students.services.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    protected String helloWorld() {
        return "hello world";
    }


    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    protected void create(@Valid @RequestBody UserCreateDto user) {
        userService.createUser(user);
    }

    @PutMapping("/{id}")
    protected void update(@Valid @RequestBody UserUpdateDto user,
                          @PathVariable("id") Long id) {
        userService.updateUser(user);
    }

    @Secured("ROLE_ADMIN")
    @DeleteMapping("/{id}")
    protected void delete(@PathVariable("id") Long id){
        userService.delete(id);
    }
}
