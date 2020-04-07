package br.com.ithappens.model.pedido;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
     private Long    idPedido;
      private Long   idUsur;
      private String obse;
      private Long   filial;
      private Long   tipoMovimento;
      private Long   idFornecedor;
      private Long   idCliente;
      private Long   idStatus;
      private Long   idPlanoConta;
      private Long   idCentroCusto;
      private LocalDateTime dataDigitacao;
      private Long   idEntradaMercadoria;
      private Long   idRota;
      private String numeroDI;
      private LocalDate dataRegistroDI;
      private String  localDesembaraco;
      private Integer idUFDesembaraco;
      private LocalDate dataDesembaraco;
      private String  numeracao;
      private String  marca;
      private String  especie;
      private char    liberadoCarregar;
      private Long    idVendedor;
      private Long    idAgenteCobrador;
      private Long    idCarregamento;
      private Long    idPrazo;
      private String  obsCancelamento;
      private Long    idUsurCancelamento;
      private LocalDateTime dataCancelamento;
      private BigDecimal valorTotal;
      private BigDecimal valorAcrescimo;
      private BigDecimal valorDesconto;
      private BigDecimal custoMedio;
      private BigDecimal custoMedioContabil;
      private BigDecimal descontoFiscal;
      private BigDecimal jurosFiscal;
      private BigDecimal pesoLiquido;
      private BigDecimal pesoBruto;
      private Long    idSW;
      private Long    idCupom;
      private Long    idPedidoPai;
      private Long    idStatusEntrega;
      private LocalDateTime dataContabil;
      private LocalDateTime dataMovimentacao;
      private BigDecimal quantidadeTotalItens;
      private Long     idPrazoVD06;
      private Long     idLinha;
      private Long     idRegiao;
      private Long     idOrigemPedido;
      private Long     filialNF;
      private Long     idTabelaVenda;
      private Long     idRegional;
      private String   naturezaAvulso;

}
