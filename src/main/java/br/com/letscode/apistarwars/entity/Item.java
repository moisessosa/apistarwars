package br.com.letscode.apistarwars.entity;

import br.com.letscode.apistarwars.Utils.TypeItem;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

    private Long id;
    private TypeItem nome;
    private Integer pontos;
    private Integer quantidade;

}
