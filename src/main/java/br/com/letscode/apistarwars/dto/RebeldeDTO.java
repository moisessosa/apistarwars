package br.com.letscode.apistarwars.dto;

import br.com.letscode.apistarwars.Utils.Genero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RebeldeDTO {

    private String id;
    private String nome;
    private Integer idade;
    private Integer acusacoes = 0;
    private Genero genero;
    private LocalizacaoDTO localizacao;
    private InventarioDTO inventario;

}
