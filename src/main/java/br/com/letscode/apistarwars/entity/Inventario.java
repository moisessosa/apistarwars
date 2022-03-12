package br.com.letscode.apistarwars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Inventario {

    private Long idInventario;
    private List<Item> itensInventario;

}
