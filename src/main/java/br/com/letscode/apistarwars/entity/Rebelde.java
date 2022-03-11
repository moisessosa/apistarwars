package br.com.letscode.apistarwars.entity;

import br.com.letscode.apistarwars.dto.InventarioDTO;
import br.com.letscode.apistarwars.dto.LocalizacaoDTO;
import br.com.letscode.apistarwars.enums.Genero;
import lombok.Data;

@Data
public class Rebelde {

    private String id;
    private String nome;
    private Integer idade;
    private Integer acusacoes = 0;
    private Genero genero;
    private Localizacao localizacao;
    private Inventario inventario;

}
