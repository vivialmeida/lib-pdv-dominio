package br.com.ithappens.model.financeiro;

import br.com.ithappens.model.cadastro.*;
import br.com.ithappens.model.cadastro.enums.Rotina;
import br.com.ithappens.model.financeiro.enums.StatusTitulo;
import br.com.ithappens.model.financeiro.enums.TipoLancamento;
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
      private Long            sequ;
      private Filial          filial;
      private AgenteCobrador  agenteCobrador;
      private TipoCobranca    tipoCobranca;
      private Comprador       comprador;
      private Vendedor        vendedor;
      private Fornecedor      fornecedor;
      private LocalDate       dtEmissao;
      private LocalDateTime   dtLancamento;
      private LocalDate       dtVencOriginal;
      private LocalDate       dtVencAtual;
      private LocalDate       dtBaixa;
      private LocalDate       dtPagamento;
      private Long            numeDocumento;
      private String          numeTitulo;
      private BigDecimal      parcialTitulo;
      private BigDecimal      valorTitulo;
      private BigDecimal      valorJuros;
      private BigDecimal      valorExtra;
      private BigDecimal      valorDescontoNegociado;
      private BigDecimal      valorDescontoGerencial;
      private BigDecimal      valorDescontoVerba;
      private BigDecimal      valorDescontoRetencao;
      private BigDecimal      valorDocuCheque;
      private BigDecimal      valorParciais;
      private LocalDate       dtUltimaParcial;
      private BigDecimal      valorDevedor;
      private String          idBancaria;
      private Usuario         usurLancouTitulo;
      private Rotina          rotinaUsurLancouTitulo;
      private Integer         idRevenda;
      private StatusTitulo    status;
      private String          controleAcesso;
      private LocalDate       dtAgendamento;
      private LocalDateTime   dtAlteracao;
      private String          obse;
      private Integer         idImposto;
      private Integer         idRenavam;
      private String          placa;
      private Integer         opcaoPagamento;
      private Integer         idReceita;
      private Long            usuarioAutorEletronica;
      private LocalDateTime   dtAutorEletronica;
      private Long            usuarioAceiteEletronico;
      private LocalDateTime   dtAceiteEletronico;
      private String          conciliadoFornecedor;
      private String          linhaDigitavel;
      private Long            idNotaFiscal;
      private Long            idTrasacaoDda;
      private TipoLancamento  tipoLancamento;
      private BigDecimal      percIcms;
      private BigDecimal      percPis;
      private BigDecimal      percCofins;
      private Long            idServico;
      private Integer         anoReferencia;
      private Integer         mesReferencia;
      private String          idBancariaDda;
      private Long            idContratoBancario;
      private BigDecimal      valorCapital;
      private String          curtoPrazo;
      private BigDecimal      valorMaterial;
      private String          cnpjFornecedor;
      private Cliente         cliente;
      private Long            idProposta;
      private Long            idDespesaProvisao;
      private BigDecimal      valorJurosContrato;
      private Long            idSocio;
      private Long            idLancamentoVmix;
      private Integer         parcela;
      private Integer         qtdeParcela;

      //NÃO PERSISTIDO
      private List<MovimentoPagar> movimentacoes = new ArrayList<>();
      private MovimentoPagar movimentoPagar = new MovimentoPagar();
}
