package com.parkingmanager.parking_management.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome",nullable = false,unique = true,length = 100)
    private String nome;
    @Column(name = "senha",nullable = false,length = 200)
    private String senha;
    @Enumerated(EnumType.STRING)//Transforma o nome da constante em uma string para salvar no banco de dados
    @Column(name = "perfil",nullable = false,length = 25)
    private Perfil perfil;

    @Column(name = "data_criacao")
    private LocalDateTime dataDeCriacao;
    @Column(name = "data_modificacao")
    private LocalDateTime dataDeModificacao;

    @Column(name = "criado_por")
    private String criadoPor;
    @Column(name = "modificado_por")
    private String modificadoPor;

    public enum Perfil {
        ROLE_ADMIN, ROLE_CLIENTE
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                '}';
    }
}
