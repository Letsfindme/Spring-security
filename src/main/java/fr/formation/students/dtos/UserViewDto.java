package fr.formation.students.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserViewDto {

    private String firstName;
    private String lastName;

    public UserViewDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
