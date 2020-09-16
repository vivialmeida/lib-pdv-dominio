package br.com.ithappens.model.cupom;

import lombok.Data;

import java.sql.Time;
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
    private Double      vlrDescontoItem;
    private Double      vlrVendaLiquida;
    private Double      vlrVendaBruta;
    private Integer     codOperador;
    private Integer     codUserDesconto;
    private Double      quantidade;
    private Integer     sequencia;
    private Long        idLote;
}
