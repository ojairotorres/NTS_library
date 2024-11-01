package org.acme.nts;

import jakarta.persistence.*;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;

import java.util.List;


/**
 * Example JPA entity defined as a Panache Entity.
 * An ID field of Long type is provided, if you want to define your own ID field extends <code>PanacheEntityBase</code> instead.
 *
 * This uses the active record pattern, you can also use the repository pattern instead:
 * .
 *
 * Usage (more example on the documentation)
 *
 * {@code
 *     public void doSomething() {
 *         MyEntity entity1 = new MyEntity();
 *         entity1.field = "field-1";
 *         entity1.persist();
 *
 *         List<MyEntity> entities = MyEntity.listAll();
 *     }
 * }
 */

/* TESTES DE RELACIONAR TABELAS NO BD*/



@Entity
@Table(name = "table_2")

public class MyEntity extends PanacheEntity {

    @Column(name = "book", nullable = false, length = 40)
    private String bookname;

}








/*
@Entity
@Table(name = "autorname")
public class MyEntity extends PanacheEntity {
    private String id_autorname;

    @OneToMany(mappedBy = id_autorname)
    private List<Livro> livros;


}
*/