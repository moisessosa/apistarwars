package br.com.letscode.apistarwars.entity;

import br.com.letscode.apistarwars.Utils.Genero;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rebelde {

    private Long id;
    private String nome;
    private Integer idade;

    private Genero genero;
    private Localizacao localizacao;
    private Inventario inventario;
    private boolean traidor = false;
    private Integer acusacoes = 0;

    public Rebelde(long id, String moises, int idade, Genero masculino, Localizacao alfa, Inventario inventario, boolean traidor) {
    }
}
