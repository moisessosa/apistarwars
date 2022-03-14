package br.com.letscode.apistarwars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Inventario {

   private Long idInventario;
    private List<Item> itensInventario;

}
