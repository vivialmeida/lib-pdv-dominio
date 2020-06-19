package br.com.ithappens.model.scantech;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class FechamentoDiarioScantechDTO {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaVentas;
    private BigDecimal montoVentaLiquida;
    private Integer montoCancelaciones;
    private Integer cantidadMovimientos;
    private Integer cantidadCancelaciones;

}
