package br.com.letscode.apistarwars.dto;

import br.com.letscode.apistarwars.Utils.Genero;
import br.com.letscode.apistarwars.entity.Inventario;
import br.com.letscode.apistarwars.entity.Localizacao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RebeldeDTO {

    private Long id;
    private String nome;
    private Integer idade;
    private Integer acusacoes = 0;
    private Genero genero;
    private Localizacao localizacao;
    private Inventario inventario;
    private boolean traidor = false;

//    public void setLocalizacao(String latitude, String longitude, String nomeBase) {
//        this.localizacao.setLatitude(latitude);
//        this.localizacao.setLongitude(longitude);
//        this.localizacao.setLongitude(nomeBase);
 //   }
}
