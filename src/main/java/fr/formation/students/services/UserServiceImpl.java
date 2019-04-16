package fr.formation.students.services;

import fr.formation.students.dtos.UserCreateDto;
import fr.formation.students.dtos.UserUpdateDto;
import fr.formation.students.entities.Person;
import fr.formation.students.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintValidatorContext;

@Service
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;

    private final PersonRepository personRepository;

    public UserServiceImpl(PersonRepository personRepository, PasswordEncoder passwordEncoder) {
        this.personRepository = personRepository;
        this.passwordEncoder = passwordEncoder;
    }

    private static ModelMapper getModelMapperInstance() {
        return new ModelMapper();
    }

    @Override
    public void createUser(UserCreateDto userDto) {
        Person personToSave = getModelMapperInstance().map(userDto, Person.class);
        System.out.println(personToSave.toString());
        String newPass = passwordEncoder.encode(userDto.getUserAccount().getPassword());
        personToSave.getUserAccount().setPassword(newPass);
        //if (isValid(userDto.getUserAccount().getUsername(),))
        personRepository.save(personToSave);
    }

    @Override
    public void delete(Long id) {
        personRepository.deleteById(id);
    }



    public void updateUser(UserUpdateDto userUp) {
        Person person = personRepository.findById(userUp.getId()).get();
        getModelMapperInstance().map(userUp, person);
        personRepository.save(person);
    }

}

