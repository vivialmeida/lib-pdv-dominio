package br.com.ithappens.model.cupom;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CupomProduto {

      private Long idCupomProduto;
      private Long idCupomCapa;
      private Integer sequencia;
      private Long codigoInterno;
      private Long codigoAutomacao;
      private BigDecimal quantidade;
      private BigDecimal quantidadeEmbalagem;
      private BigDecimal quantidadeVendida;
      private BigDecimal precoAtacado;
      private BigDecimal precoUnitario;
      private BigDecimal precoTotal;
      private BigDecimal precoDesconto;
      private BigDecimal precoAcrescimo;
      private BigDecimal percIcms;
      private Boolean cancelado;
      private BigDecimal precoDescontoCrm;
      private  BigDecimal precoDescontoCrmBonificacao;

}
