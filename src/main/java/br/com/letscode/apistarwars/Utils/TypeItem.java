package br.com.letscode.apistarwars.Utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeItem {
    ARMA(4),
    MUNICAO(3),
    AGUA(2),
    COMIDA(1);

    Integer ponto;
}
