package br.com.ithappens.model.cadastro.DTOs;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class VendaScantechDTO {

    private Long          idCupomCapa;
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
