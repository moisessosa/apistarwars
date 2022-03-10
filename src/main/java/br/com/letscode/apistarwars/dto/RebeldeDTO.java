package br.com.letscode.apistarwars.dto;

import br.com.letscode.apistarwars.enums.Genero;

public class RebeldeDTO {
    private String id;


    private String nome;


    private Integer idade;


    private Genero genero;

    private Integer acusacoes = 0;


    private LocalizacaoDTO localizacao;

    private InventarioDTO inventario;
}
