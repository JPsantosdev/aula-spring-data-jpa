package dio.aulaspringdatajpa;

import dio.aulaspringdatajpa.model.User;
import dio.aulaspringdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Implementamos o CLI que necessita da implementação do método Run.

// Portanto dizemos que a classe passa a ser um componente.
// Um objeto gerenciado pelo spring framework.

@Component
public class StartApp implements CommandLineRunner {

    /*
    E agora utilizando o recurso de injeção de controle e dependencia, injetamos o nosso
    repository
    Usamos @autowired para injetar dependencia.
     */
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        // Criamos um objeto user.
        User user = new User();

        // Definimos as caracteristicas.

        user.setName("Kisa Santos");
        user.setUsername("Tigerkoffee");
        user.setPassword("DIO123");

        // Então dizemos que o repositório realiza o save de nossa aplicação.
        repository.save(user);

        // Agora para termos certeza que foi salvo, iremos iterar por dentro do repositório.
        for(User u: repository.findAll()) {
            System.out.println(u);
        }

    }


}
