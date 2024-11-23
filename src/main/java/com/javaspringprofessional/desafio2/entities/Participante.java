package com.javaspringprofessional.desafio2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@ToString
@Table(name = "tb_participant")
public class Participante {

    public Participante(Integer id, String email, String nome) {
        this.id = id;
        this.email = email;
        this.nome = nome;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Integer id;

    @Setter
    private String nome;

    @Setter
    private String email;

    //mesma obs da classe "Categoria"
    @ManyToMany(mappedBy = "participantes")
    private List<Atividade> atividades = new ArrayList<>();

}
