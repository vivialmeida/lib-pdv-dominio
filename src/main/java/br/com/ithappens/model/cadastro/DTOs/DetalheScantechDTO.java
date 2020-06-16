package br.com.ithappens.model.cadastro.DTOs;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DetalheScantechDTO {

    private Integer codigoArticulo;
    private String codigoBarras;
    private String descripcionArticulo;
    private Integer cantidad;
    private BigDecimal importeUnitario;
    private BigDecimal importe;
    private BigDecimal descuento;
    private BigDecimal recargo;

}
