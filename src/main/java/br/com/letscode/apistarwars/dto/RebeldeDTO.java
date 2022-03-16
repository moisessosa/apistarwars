package br.com.letscode.apistarwars.dto;

import br.com.letscode.apistarwars.Utils.Genero;
import br.com.letscode.apistarwars.entity.Inventario;/**/
import br.com.letscode.apistarwars.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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

//    public Inventario getInventario() {
//        List<Item> lista = new ArrayList<>();
//        lista.addAll((Collection) inventario.getItensInventario());
//        Inventario inventarioEntity = new Inventario(Double.valueOf((Math.random()*1000)).longValue(),lista);
//        return inventarioEntity;
//    }
//    public void setLocalizacao(String latitude, String longitude, String nomeBase) {
//        this.localizacao.setLatitude(latitude);
//        this.localizacao.setLongitude(longitude);
//        this.localizacao.setLongitude(nomeBase);
 //   }
}
