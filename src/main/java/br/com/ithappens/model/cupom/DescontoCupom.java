package br.com.ithappens.model.cupom;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DescontoCupom {

    private Long        id;
    private Long        idCupomCapa;
    private Long        idFilial;
    private Long        idProduto;
    private Integer     cupom;
    private Integer     pdv;
    private LocalDate   data;
    private Integer     motivo;
    private Double      preco;
    private Long        codProduto;
    private Long        codBarras;
    private Double      vlrDescontoTotal;
    private Double      vlrDescontoItem;
    private Integer     operador;
    private Integer     userDesconto;

}
