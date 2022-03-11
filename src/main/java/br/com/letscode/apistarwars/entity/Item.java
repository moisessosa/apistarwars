package br.com.letscode.apistarwars.entity;

import lombok.Data;

@Data
public class Item {

    private String id;
    private String nome;
    private String pontos;
    private Integer quantidade;

}
