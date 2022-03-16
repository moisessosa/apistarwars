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


    public Rebelde(){

    }

    public void setAcusacoes() {
        this.acusacoes++;
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
