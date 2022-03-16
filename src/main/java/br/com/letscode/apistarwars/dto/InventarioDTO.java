package br.com.letscode.apistarwars.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
public class InventarioDTO {
    public InventarioDTO() {

    }

    private List<ItemDTO> itensInventario;

}
