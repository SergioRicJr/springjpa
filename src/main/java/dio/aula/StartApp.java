package dio.aula;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;


@Component
public class StartApp implements CommandLineRunner{
    
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("0232");
        user.setUsername("0444");
        user.setPassword("11233");
        
        //save é um metodo que veio atraves da interface jparepository
        repository.save(user);

        for (User usuario: repository.findAll()) {
            System.out.println(usuario);
        }

        // List<User> users = repository.filtrarPorNome("01");

        // for (User usuerio: users) {
        //     System.out.println(usuerio);
        // }
    }
    
}
