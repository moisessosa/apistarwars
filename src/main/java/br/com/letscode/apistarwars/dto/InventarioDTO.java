package br.com.letscode.apistarwars.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InventarioDTO {

    private List<ItemDTO> itensInventario;

}
