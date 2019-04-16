package fr.formation.students.services;

import fr.formation.students.dtos.UserCreateDto;


public interface UserService {
    void createUser(UserCreateDto user);
    void delete(Long id);
}
