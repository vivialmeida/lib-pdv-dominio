package br.com.ithappens.model.scantech;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class FechamentoDiarioScantechDTO {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaVentas;
    @JsonIgnore
    private Long idFilial;
    @JsonIgnore
    private Integer pdv;
    private BigDecimal montoVentaLiquida;
    private BigDecimal montoCancelaciones;
    private Integer cantidadMovimientos;
    private Integer cantidadCancelaciones;

}
