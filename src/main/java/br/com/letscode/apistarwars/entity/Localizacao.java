package br.com.letscode.apistarwars.entity;

import lombok.Data;

@Data
public class Localizacao {

    private String idLoc;
    private String latitude;
    private String longitude;
    private String nomeBase;

}
