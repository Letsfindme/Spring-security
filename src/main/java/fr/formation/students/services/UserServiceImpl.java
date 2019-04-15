package fr.formation.students.services;

import fr.formation.students.dtos.UserCreateDto;
import fr.formation.students.dtos.UserUpdateDto;
import fr.formation.students.entities.Person;
import fr.formation.students.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private static ModelMapper getModelMapperInstance() {
        return new ModelMapper();
    }

    @Override
    public void createUser(UserCreateDto userDto) {
        System.out.println(userDto.toString());
        Person personToSave = getModelMapperInstance().map(userDto, Person.class);
        System.out.println(personToSave.toString());
        userRepository.save(personToSave);
    }

    public void updateUser(UserUpdateDto userUp) {
        Person person = userRepository.findById(userUp.getId()).get();

        getModelMapperInstance().map(userUp, person);
        userRepository.save(person);
    }


}
