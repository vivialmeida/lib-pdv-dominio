package br.com.ithappens.model.scantech;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class FechamentoDiarioScantechDTO {

    private LocalDate fechaVentas;
    private BigDecimal montoVentaLiquida;
    private Integer montoCancelaciones;
    private Integer cantidadMovimientos;
    private Integer cantidadCancelaciones;

}
