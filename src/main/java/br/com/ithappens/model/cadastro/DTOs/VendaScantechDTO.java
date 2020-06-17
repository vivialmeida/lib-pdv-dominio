package br.com.ithappens.model.cadastro.DTOs;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class VendaScantechDTO {

    @JsonSerialize(using = LocalDateSerializer.class)
    private String        fecha;
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
