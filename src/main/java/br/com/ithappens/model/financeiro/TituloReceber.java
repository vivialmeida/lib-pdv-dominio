package br.com.ithappens.model.financeiro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TituloReceber {
      private Long            sequ;
      private Integer         idFilial;
      private Integer         idAgenteCobrador;
      private Integer         idTipoCobranca;
      private Integer         idComprador;
      private Integer         idVendedor;
      private Integer         idCliente;
      private LocalDate       dataEmissao;
      private LocalDateTime   dataLancamento;
      private LocalDate       dataVencOriginal;
      private LocalDate       dataVencAtual;
      private LocalDate       dataBaixa;
      private LocalDate       dataPagamento;
      private Long            numeDocumento;
      private String          numeroTitulo;
      private BigDecimal      parcialTitulo;
      private BigDecimal      valorTitulo;
      private BigDecimal      valorJuros;
      private BigDecimal      valorExtra;
      private BigDecimal      valorDesconto;
      private BigDecimal      valorDescontoGerencial;
      private BigDecimal      valorDescontoVerba;
      private BigDecimal      valorDescontoRetencao;
      private BigDecimal      valorDocumento;
      private BigDecimal      valorParciais;
      private LocalDate       dataUltimaParcial;
      private BigDecimal      valorDevedor;
      private String          idBancaria;
      private Integer         idUsurLancouTitulo;
      private Integer         idRotinaUsurLancouTitulo;
      private Integer         idRevenda;
      private Integer         status;
      private String          controleAcesso;
      private LocalDate       dataValidacao;
      private LocalDateTime   dataAlteracao;
      private LocalDateTime   dataMovimento;
      private String          motivoDevolucao;
      private String          agConta;
      private Long            boleto;
      private Long            numeroCons;
      private String          numeroFatura;
      private String          obse;
      private LocalDate       dataAgendamento;
      private char            conciliadoCliente;
      private Long            idNotaFiscal;
      private Integer         idTipoLancamento;
      private Integer         anoReferencia;
      private Integer          mesReferencia;
      private Long            nossoNumero;
      private String          motivoOcorrenciaCNAB400;
      private String          motivoRejeicaoCNAB400;
      private LocalDateTime   dataEnvioCNAB400;
      private LocalDateTime   dataRegistroCNAB400;
      private Long            bancoCheque;
      private Long            agenciaCheque;
      private String          contaCheque;
      private String          numeroCheque;
      private Long            numeroReprogramacao;
      private Long            idChequeDevolucao;
      private String          cnpjCliente;
      private Long            idProposta;
      private Long            numeroPdv;
      private Long            numeroCupom;
      private Long            numeroNsuSitef;
      private Long            numeroNsuHost;
      private Long            numeroCartao;
      private Long            idCartaoTransacao;
      private Long            idLancamentoVMix;
      private char            acerto;
      private Integer         parcela;
      private Long            idSW;
      private Integer         quantidadeParcela;
      private LocalDate       dataTransacao;
      private Long            idContaCobranca;


}
