package br.com.ithappens.model.financeiro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TituloPagar {
      private Long      sequ;
      private Integer   idFilial;
      private Integer   idAgenteCobrador;
      private Integer   idTipoCobranca;
      private Integer   idComprador;
      private Integer   idVendedor;
      private Integer   idFornecedor;
      private LocalDate dataEmissao;
      private LocalDateTime dataLancamento;
      private LocalDate dataVencOriginal;
      private LocalDate dataVencAtual;
      private LocalDate dataBaixa;
      private LocalDate dataPagamento;
      private Long      numeDocumento;
      private String    numeTitulo;
      private BigDecimal parcialTitulo;
      private BigDecimal valorTitulo;
      private BigDecimal valorJuros;
      private BigDecimal valorExtra;
      private BigDecimal valorDescontoNegociado;
      private BigDecimal valorDescontoGerencial;
      private BigDecimal valorDescontoVerba;
      private BigDecimal valorDescontoRetencao;
      private BigDecimal valorDocuCheque;
      private BigDecimal valorParciais;
      private LocalDate  dataUltimaParcial;
      private BigDecimal valorDevedor;
      private String     idBancaria;
      private Integer    idUsurLancouTitulo;
      private Integer    idRotinaUsurLancouTitulo;
      private Integer    idRevenda;
      private Integer    status;
      private String     controleAcesso;
      private LocalDate  dataAgendamento;
      private LocalDateTime dataAlteracao;
      private String      obse;
      private Integer     idImposto;
      private Integer     idRenavam;
      private String      placa;
      private Integer     opcaoPagamento;
      private Integer     idReceita;
      private Long        usuarioAutorEletronica;
      private LocalDateTime dataAutorEletronica;
      private Long         usuarioAceiteEletronico;
      private LocalDateTime dataAceiteEletronico;
      private char         conciliacaoFornecedor;
      private String       linhaDigitavel;
      private Long         idNotaFiscal;
      private Long         idTrasacaoDDA;
      private Integer      idTipoLancamento;
      private BigDecimal   percIcms;
      private BigDecimal   percPIS;
      private BigDecimal   percCofins;
      private Long         idServico;
      private Integer      anoReferencia;
      private Integer      mesReferencia;
      private char         idBancariaDDA;
      private Long         idContratoBancario;
      private BigDecimal   valorCapital;
      private char         curtoPrazo;
      private BigDecimal   valorMaterial;
      private String       cnpfFornecedor;
      private Long         idCliente;
      private Long         idProposta;
      private Long         idDespesaProvisao;
      private BigDecimal   valorJurosContrato;
      private Long         idSocio;
      private Long         idLancamentoVMix;
      private Integer      parcela;
      private Integer      quantidadeParcela;

      //NÃO PERSISTIDO
      private List<MovimentoPagar> movimentacoes = new ArrayList<>();
}
