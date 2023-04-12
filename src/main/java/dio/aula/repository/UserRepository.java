package dio.aula.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio.aula.model.User;

//jpaRepository <User, Integer> User é oq armazena e Integer o tipo do id
public interface UserRepository extends JpaRepository<User, Integer> {
    // List<User> findByNameContaining(String name);

    // // User findByUsername(String username);

    // @Query("SELECT u FROM tab_user u WHERE u.name %:nome%")
    // List<User> filtrarPorNome(@Param("nome") String name);
}
