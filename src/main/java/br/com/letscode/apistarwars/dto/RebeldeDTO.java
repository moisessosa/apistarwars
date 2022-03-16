package br.com.letscode.apistarwars.dto;

import br.com.letscode.apistarwars.Utils.Genero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class RebeldeDTO {
    public RebeldeDTO() {

    }

    private Long id;
    private String nome;
    private Integer idade;
    private Integer acusacoes = 0;
    private Genero genero;
    private LocalizacaoDTO localizacao;
    private InventarioDTO inventario;
    private boolean traidor = false;

//    public void setLocalizacao(String latitude, String longitude, String nomeBase) {
//        this.localizacao.setLatitude(latitude);
//        this.localizacao.setLongitude(longitude);
//        this.localizacao.setLongitude(nomeBase);
 //   }
}
