package fr.formation.students.dtos;

import javax.validation.Valid;

public class UserCreateDto extends UserDto {

    @Valid
    private UserAccountDto userAccount;

    public UserAccountDto getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccountDto userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return "UserCreateDto{" +
                "userAccount=" + userAccount +
                '}';
    }
}
