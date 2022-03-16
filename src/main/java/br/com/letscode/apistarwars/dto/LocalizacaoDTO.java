package br.com.letscode.apistarwars.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class LocalizacaoDTO {

    private String latitude;
    private String longitude;
    private String nomeBase;

}
