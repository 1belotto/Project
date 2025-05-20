package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private int id;
    private String name;
    private String email;
    private String senha;


    public Usuario(int id, String name, String email, String senha) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.senha = senha;
    }
}