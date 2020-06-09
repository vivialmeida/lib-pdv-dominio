package br.com.ithappens.model.cupom;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AuditoriaDescontoCupom {

    private Long        id;
    private Long        idFilial;
    private LocalDate   dataVenda;
    private Integer     cupom;
    private Integer     pdv;
    private Integer     motivo;
    private Integer     codTipo;
    private Long        codProduto;
    private Long        codDepartamento;
    private Double      vlrDescontoItem;
    private Double      vlrVendaLiquida;
    private Double      vlrVendaBruta;
    private Integer     codOperador;
    private Integer     codUserDesconto;
    private Integer     quantidade;
    private Integer     sequencia;

}
