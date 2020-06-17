package br.com.ithappens.model.cadastro.DTOs;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class VendaScantechDTO {

    @JsonSerialize(using = LocalDateSerializer.class)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "UTC")
    private LocalDateTime fecha;
    private Integer       numero;
    private BigDecimal    descuentoTotal;
    private BigDecimal    recargoTotal;
    private Integer       codigoMoneda = 986;
    private BigDecimal    cotizacion = BigDecimal.valueOf(1);
    private BigDecimal    total;
    private Boolean       cancelacion = false;
    private String        documentoCliente;
    private List<DetalheScantechDTO> detalles = new ArrayList<>();
    private List<PagosScantechDTO> pagos = new ArrayList<>();

}
