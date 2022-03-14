package br.com.letscode.apistarwars.dto;

import br.com.letscode.apistarwars.Utils.TypeItem;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDTO {

    private Long id;
    private TypeItem nome;
    private Integer pontos;
    private Integer quantidade;

}
