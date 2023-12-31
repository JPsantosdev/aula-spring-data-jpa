package dio.aulaspringdatajpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Não chamaremos o campo de Id. nós vamos chamar ele de user_id.
    @Column(name = "user_id")
    private Integer id;
    // Definimos então o tamanho máximo da coluna.
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private String username;
    @Column(length = 10, nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
