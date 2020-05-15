package br.com.ithappens.model.cadastro;

import br.com.ithappens.model.tesouraria.LoteTesouraria;
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
    private Long       idLoteSintetico;
    private Long       idFilial;
    private Long       idCliente;
    private Long       idPedido;
    private LocalDate  data;
    private Long       pdv;
    private Long       cupom;
    private BigDecimal valorCupom      = BigDecimal.ZERO;
    private BigDecimal valorFinanceiro = BigDecimal.ZERO;
    private BigDecimal valorEstoque    = BigDecimal.ZERO;
    private BigDecimal valorIntegracao = BigDecimal.ZERO;
    private BigDecimal valorCartao     = BigDecimal.ZERO;
    private Long       pedidoDevolucao;
    private Boolean    devolucao = Boolean.valueOf(false);
    private Integer    tipouso;
    private LoteTesouraria loteTesouraria;
}
