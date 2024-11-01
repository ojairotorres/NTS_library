package org.acme.nts;

import jakarta.persistence.*;


@Entity
@Table(name = "Livros")
public class livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titulo;

    @JoinColumn(name = "id_autorname", nullable = false)
    @ManyToOne
    private Autor_ autor;


    public livro(){}


    public livro(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }
    public String setTitulo() {
        return titulo;
    }


}
