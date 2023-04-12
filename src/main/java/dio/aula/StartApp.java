package dio.aula;

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
        user.setName("01");
        user.setUsername("00111");
        user.setPassword("123");
        
        //save é um metodo que veio atraves da interface jparepository
        repository.save(user);

        for (User usuario: repository.findAll()) {
            System.out.println(usuario.getName());
        }
    }
    
}
