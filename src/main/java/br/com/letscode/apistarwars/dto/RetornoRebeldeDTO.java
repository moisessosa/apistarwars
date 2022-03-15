package br.com.letscode.apistarwars.dto;

import br.com.letscode.apistarwars.Utils.Genero;
import br.com.letscode.apistarwars.entity.Inventario;
import br.com.letscode.apistarwars.entity.Localizacao;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RetornoRebeldeDTO {

    private Long id;
    private String nome;
    private Integer idade;
    private Integer acusacoes = 0;
    private Genero genero;
    private Localizacao localizacao;
    private Inventario inventario;
    private boolean traidor = false;

}
