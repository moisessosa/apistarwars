package br.com.letscode.apistarwars.entity;

import lombok.Data;

import java.util.List;

@Data
public class Inventario {

    private String idInventario;
    private List<Item> itensInventario;

}
