package br.com.ithappens.model.pedido;

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
public class ItemPedido {
      private Long      idItemPedido;
      private Long      idPedido;
      private Long      idProduto;
      private BigDecimal quantidade;
      private char       status;
      private BigDecimal valorTabela;
      private BigDecimal valorUnitario;
      private BigDecimal valorAcrescimo;
      private BigDecimal valorDesconto;
      private BigDecimal valorCustoMedio;
      private Long       idFornecedor;
      private Long       idDepartamento;
      private Long       idSecao;
      private BigDecimal valorCustoNota;
      private BigDecimal valorCustoFinal;
      private BigDecimal valorCustoMedioContabil;
      private BigDecimal valorCustoContabil;
      private BigDecimal valorCustoCompra;
      private Long       idCstIcms;
      private Long       idCstPIS;
      private Long       idCstCofins;
      private Long       idCstIPI;
      private BigDecimal mva;
      private BigDecimal reducaoCredito;
      private BigDecimal reducaoDebito;
      private Long       idCFOP;
      private BigDecimal valorIPI;
      private BigDecimal aliquotaIPI;
      private BigDecimal impostoImportacao;
      private BigDecimal outrasDespesas;
      private BigDecimal valorFrete;
      private BigDecimal valorSeguro;
      private BigDecimal percentualComissao;
      private char       bonificacao;
      private String     numeroLote;
      private BigDecimal quantidadeLote;
      private LocalDate  dataFabricacao;
      private LocalDate  dataValidade;
      private BigDecimal valorJuros;
      private BigDecimal valorDescontoFiscal;
      private Integer    squencia;
      private BigDecimal valorTotalItem;
      private String     numeroSerie;
      private Integer    multiploEmbalagem;

}
