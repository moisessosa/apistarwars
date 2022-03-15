package br.com.letscode.apistarwars.entity;

import br.com.letscode.apistarwars.Utils.Genero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    public Rebelde(Long id, String nome, Integer idade, Genero genero, Localizacao localizacao, Inventario inventario, boolean traidor) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.localizacao = localizacao;
        this.inventario = inventario;
        this.traidor = traidor;
    }

    public Rebelde(){

    }

    @Override
    public String toString() {
        return "Rebelde{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero=" + genero +
                ", localizacao=" + localizacao +
                ", inventario=" + inventario +
                ", traidor=" + traidor +
                ", acusacoes=" + acusacoes +
                '}';
    }
}
