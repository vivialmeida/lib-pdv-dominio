package br.com.ithappens.model.cupom;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class DescontoCupomCapa {

    private Long        id;
    private Long        idCupomCapa;
    private Long        idFilial;
    private LocalDate   dataVenda;
    private Integer     cupom;
    private Integer     pdv;
    private Integer     motivo;
    private Integer     codTipo;
    private Long        codProduto;
    private Long        codDepartamento;
    private Double      vlrDescontoItem;
    private Double      vlrDescontoTotal;
    private Double      vlrVendaLiquida;
    private Double      vlrVendaBruta;
    private Integer     codOperador;
    private String      nomeOperador;
    private Integer     codUserDesconto;
    private String      nomeUserDesconto;
    private Integer     quantidade;
    private LocalDateTime   dataItem;

}
