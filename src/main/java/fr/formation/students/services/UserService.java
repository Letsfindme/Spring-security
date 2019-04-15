package fr.formation.students.services;

import fr.formation.students.dtos.UserCreateDto;
import fr.formation.students.dtos.UserDto;

public interface UserService {
    void createUser(UserCreateDto user);
}
