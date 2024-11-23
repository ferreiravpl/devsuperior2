package com.javaspringprofessional.desafio2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Entity
@Getter
@NoArgsConstructor
@ToString
@Table(name = "tb_blocks")
public class Bloco {

    public Bloco(Integer id, Instant fim, Instant inicio) {
        this.id = id;
        this.fim = fim;
        this.inicio = inicio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Integer id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    @Setter
    private Instant inicio;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    @Setter
    private Instant fim;

    //mesma obs da classe "Categoria".
    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Atividade atividade;

}
