package dio.aula.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import dio.aula.model.User;

//jpaRepository <User, Integer> User é oq armazena e Integer o tipo do id
@Component
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByNameContaining(String string);
    // List<User> findByNameContaining(String name);

    //erro ao criar query
    // @Query(value="SELECT u FROM tab_user as u WHERE u.password = :x")
    // List<User> buscarPorSenha(@Param("x")  String string);

    // // User findByUsername(String username);

    // @Query("SELECT u FROM tab_user u WHERE u.name %:nome%")
    // List<User> filtrarPorNome(@Param("nome") String name);
}
