package br.com.ithappens.model.financeiro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovimentoReceber {
      private Long      sequ;
      private Long      sequMovContasReceber;
      private Long      sequLancamento;
      private Integer   tipo;
      private Integer   idFilial;
      private Integer   idAgenteCobrador;
      private Integer   idTipoCobranca;
      private Integer   idComprador;
      private Integer   idVendedor;
      private Integer   idCliente;
      private LocalDate dataMovimento;
      private LocalDate dataVencAtual;
      private LocalDate dataBaixa;
      private LocalDate dataPagamento;
      private BigDecimal valorLancamento;
      private BigDecimal valorJuros;
      private BigDecimal valorExtra;
      private BigDecimal valorDesconto;
      private BigDecimal valorDescontoGerencial;
      private BigDecimal valorDescontoVerba;
      private BigDecimal valorDescontoRetencao;
      private BigDecimal valorDocumento;
      private BigDecimal valorDevedor;
      private String     idBancaria;
      private Integer    idUsurLancouTitulo;
      private Integer    idRotinaUsurLancouTitulo;
      private String     idAcesso;
      private String     numeroFatura;
      private String     obse;
      private Integer    idCaixa;
      private BigDecimal valorPago;
      private Integer    idMotivoDesconto;
      private Long       sequConta;
      private Long       idBancoMovimento;
}
