package br.com.ithappens.model.sintetico.DTOs;

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
public class SinteticoDTO {

    private Long       id;
    private LocalDate  data;
    private Long       idLote;
    private Long       idFilial;
    private Long       idPedido;
    private Long       pdv;
    private Long       cupom;
    private BigDecimal valorCupom      = BigDecimal.ZERO;
    private BigDecimal valorFinanceiro = BigDecimal.ZERO;
    private BigDecimal valorEstoque    = BigDecimal.ZERO;
    private BigDecimal valorIntegracao = BigDecimal.ZERO;
    private BigDecimal valorCartao     = BigDecimal.ZERO;
    private Boolean    devolucao = Boolean.valueOf(false);
    private Integer    tipouso;
    private LoteTesouraria loteTesouraria;
}
