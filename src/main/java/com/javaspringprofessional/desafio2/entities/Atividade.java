package com.javaspringprofessional.desafio2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name ="tb_activity")
public class Atividade {

    public Atividade(Integer id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Integer id;

    @Setter
    private String nome;

    @Setter
    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Setter
    private Double preco;

    //relações manyToOne, realizamos o join com a tabela "dona" da FK
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categoria categoria;

    /* tabela intermediária é necessária para relações manyToMany,
    * no atributo joinColumns colocamos o id da classe que a tabela é criada e no inverse, o id da outra classe relacionada
    */
    @ManyToMany
    @JoinTable(name = "tb_activity_participant",
            joinColumns = @JoinColumn(name = "activity_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id"))
    private List<Participante> participantes = new ArrayList<>();

    @OneToMany(mappedBy = "atividade")
    private List<Bloco> blocos = new ArrayList<>();

}
