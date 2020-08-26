package br.com.ithappens.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CupomProdutoDto {
    private Long id;
    private CupomCapaDto cupomCapa;
    private Integer sequencia;
    private Long codigoInterno;
    private Long codigoAutomacao;
    private Long codigoAliquota = 0L;
    private BigDecimal quantidade;
    private BigDecimal qtdeEmbalagem;
    private BigDecimal qtdeVendida;
    private BigDecimal precoAtacado;
    private BigDecimal precoUnitario;
    private BigDecimal precoTotal;
    private BigDecimal desconto;
    private BigDecimal acrescimo;
    private Boolean cancelado;
    private BigDecimal percIcms;
    private BigDecimal descontoCrm;
    private BigDecimal descontoBonificacao;
    private BigDecimal descontoSuperApp;

}
