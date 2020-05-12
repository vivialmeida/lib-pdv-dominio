package br.com.ithappens.model.sintetico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SinteticoCartaoOff {

    private Long       id;
    private LocalDate  data;
    private Long       idCliente;
    private Long       idFilial;
    private Long       idPedido;
    private Long       pdv;
    private Long       cupom;
    private BigDecimal valorCupom      = BigDecimal.ZERO;
    private BigDecimal valorFinanceiro = BigDecimal.ZERO;
    private BigDecimal valorEstoque    = BigDecimal.ZERO;
    private BigDecimal valorIntegracao = BigDecimal.ZERO;
    private Boolean    devolucao = Boolean.valueOf(false);
    private Integer    tipo;
}
