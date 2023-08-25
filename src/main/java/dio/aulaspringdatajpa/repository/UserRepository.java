package dio.aulaspringdatajpa.repository;


import dio.aulaspringdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Renomeamos de classe para interface.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
