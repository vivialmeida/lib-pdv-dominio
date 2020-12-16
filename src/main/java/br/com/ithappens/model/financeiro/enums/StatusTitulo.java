package br.com.ithappens.model.financeiro.enums;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum StatusTitulo {

    ABERTO(0),
    CANCELADO(98),
    QUITADO(99);

    private Integer valor;

    StatusTitulo(Integer valor) {
        this.valor = valor;
    }

    public static StatusTitulo get(Integer valor) {

        return Stream.of(StatusTitulo.values())
                .filter(f -> f.valor.equals(valor))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Tipo enumerado nao mapeado"));

    }
}
