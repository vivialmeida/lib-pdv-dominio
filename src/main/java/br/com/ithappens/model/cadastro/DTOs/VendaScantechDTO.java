package br.com.ithappens.model.cadastro.DTOs;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
public class VendaScantechDTO {

    private String fecha;
    private Integer numero;
    private BigDecimal descuentoTotal;
    private BigDecimal recargoTotal;
    private Integer codigoMoneda = 986;
    private BigDecimal cotizacion = BigDecimal.valueOf(1);
    private BigDecimal total;
    private Boolean cancelacion = false;
    private String documentoCliente;
    private List<DetalheScantechDTO> detalles = new ArrayList<>();
    private List<PagosScantechDTO> pagos = new ArrayList<>();

    public String getFecha() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(fecha, formatter);

        OffsetDateTime odt = dateTime.atOffset(ZoneOffset.ofHoursMinutes(1, 0));
        String s = odt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        return s;

    }
}
