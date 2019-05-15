package fr.formation.students.repository;

import fr.formation.students.dtos.UserViewDto;
import fr.formation.students.entities.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByUserAccountUsername(String userName);

    @Query("select new fr.formation.students.dtos.UserViewDto(p.firstName,p.lastName) "
            + "from Person p order by p.firstName, p.lastName desc")
    Page<UserViewDto> findAllAsDto(Pageable pageable);
}
