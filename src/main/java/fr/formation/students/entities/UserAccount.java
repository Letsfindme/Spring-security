package fr.formation.students.entities;

import fr.formation.students.enumeration.Role;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class UserAccount {

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String accountNonExpired;

    private String accountNonLocked;

    private String credentialsNonExpired;

    private String enabled;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Role role;
}
