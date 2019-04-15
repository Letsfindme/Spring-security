package fr.formation.students.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;


public class UserDto {


     @NotBlank
     @Size(max = 100)
     private String firstName;

     @NotBlank
     private String lastName;

     @NotNull
     private LocalDate birthDate;

     @NotNull
     private boolean active;

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

     public boolean isActive() {
          return active;
     }

     public void setActive(boolean active) {
          this.active = active;
     }

     @Override
    public String toString() {
        return "UserDto{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", active=" + active +
                '}';
    }

}
