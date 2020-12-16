package br.com.ithappens.model.financeiro.enums;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum StatusCartaCreditoPedido {

    NAO_PROCESSADO(0),
    PROCESSANDO(1),
    CONCLUIDO(2),
    ERRO_PROCESSAMENTO(3);

    private Integer valor;

    StatusCartaCreditoPedido(Integer valor) {
        this.valor = valor;
    }

    public static StatusCartaCreditoPedido get(Integer valor) {

        return Stream.of(StatusCartaCreditoPedido.values())
                .filter(f -> f.valor.equals(valor))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Tipo enumerado nao mapeado"));

    }

}
