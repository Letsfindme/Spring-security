package fr.formation.students.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.time.LocalDate;


public class UserDto {


     @NotBlank
     @Size(max = 100)
     private String firstName;

     @NotBlank
     private String lastName;

     @NotNull
     private LocalDate birthDate;



     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public LocalDate getBirthDate() {
          return birthDate;
     }

     public void setBirthDate(LocalDate birthDate) {
          this.birthDate = birthDate;
     }



     @Override
     public String toString() {
          return "UserDto{" +
                  "firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", birthDate=" + birthDate +
                  '}';
     }
}
