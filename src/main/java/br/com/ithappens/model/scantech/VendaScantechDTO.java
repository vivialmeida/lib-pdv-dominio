package br.com.ithappens.model.scantech;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
public class VendaScantechDTO {

    @JsonIgnore
    private Long idFilial;
    @JsonIgnore
    private Integer pdv;
    private String fecha;
    @JsonIgnore
    private Long idCupomFinalizadora;
    @JsonIgnore
    private Long idCupom;
    @JsonIgnore
    private Long idCupomProduto;
    @JsonIgnore
    private Long idLoteSintetico;
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

    @JsonIgnore
    private Long idProduto;
    @JsonIgnore
    private String descProd;

    public String getFecha() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(fecha, formatter);

        OffsetDateTime odt = dateTime.atOffset(ZoneOffset.ofHoursMinutes(1, 0));
        String s = odt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        return s;

    }

    public BigDecimal getTotal(){
        BigDecimal valor =  BigDecimal.ZERO;
        for (DetalheScantechDTO dto: this.getDetalles()) {
            valor = valor.add(dto.getImporte());
        }
        return  valor;
    }

    public BigDecimal getDescuentoTotal(){
        BigDecimal valor =  BigDecimal.ZERO;
        for (DetalheScantechDTO dto: this.getDetalles()) {
            valor = valor.add(dto.getDescuento());
        }
        return  valor;
    }

    public BigDecimal getRecargoTotal(){
        BigDecimal valor =  BigDecimal.ZERO;
        for (DetalheScantechDTO dto: this.getDetalles()) {
            valor = valor.add(dto.getRecargo());
        }
        return  valor;
    }

    public void adicionarValorPago(BigDecimal valor){
        if(this.getPagos() != null && !this.getPagos().isEmpty())
            this.getPagos().get(0).setImporte(this.getPagos().get(0).getImporte().add(valor));
    }

}
