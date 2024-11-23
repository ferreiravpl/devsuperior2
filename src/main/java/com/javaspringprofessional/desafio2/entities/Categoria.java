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
@Table(name = "tb_category")
public class Categoria {

    public Categoria(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Integer id;

    @Setter
    private String descricao;

    //relações oneToMany, apenas realizamos o mapeamento da FK
    @OneToMany(mappedBy = "categoria")
    private List<Atividade> atividades = new ArrayList<>();

}
