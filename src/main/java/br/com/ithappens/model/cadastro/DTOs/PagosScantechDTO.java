package br.com.ithappens.model.cadastro.DTOs;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PagosScantechDTO {

    private Integer recargo;
    private Integer codigoMoneda = 986;
    private BigDecimal importe;
    private BigDecimal cotizacion = BigDecimal.valueOf(1);
    private String documentoCliente = "null";
    private String bin = "null";
    private String codigoTarjeta = "null";
}
