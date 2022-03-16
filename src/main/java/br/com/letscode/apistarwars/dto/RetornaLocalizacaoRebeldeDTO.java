package br.com.letscode.apistarwars.dto;

public class RetornaLocalizacaoRebeldeDTO {
    private Long id;
    private String latitude;
    private String longitude;
    private String nomeBase;

    public RetornaLocalizacaoRebeldeDTO(Long id, String latitude, String longitude, String nomeBase) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.nomeBase = nomeBase;
    }
}
