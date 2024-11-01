package org.acme.nts;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "autores_")

public class Autor_ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String sobrenome;

    @OneToMany(mappedBy = "autor")
    private List<livro> livros;

    public Autor_(){}

    public Autor_(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Long getId() {
        return id;
    }


}
