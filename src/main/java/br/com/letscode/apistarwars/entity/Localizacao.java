package br.com.letscode.apistarwars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
@Setter
@Getter
public class Localizacao {

    private Long idLoc;
    private String latitude;
    private String longitude;
    private String nomeBase;

}
