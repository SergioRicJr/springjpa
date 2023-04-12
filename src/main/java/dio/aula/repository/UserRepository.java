package dio.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dio.aula.model.User;

//jpaRepository <User, Integer> User é oq armazena e Integer o tipo do id
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
