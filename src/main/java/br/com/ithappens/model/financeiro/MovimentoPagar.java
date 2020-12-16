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
@NoArgsConstructor
@AllArgsConstructor
public class MovimentoPagar {
      private Long       sequ;
      private Long       sequLancamento;
      private Long    tipo;
      private Long    idFilial;
      private Long    agenteCobrador;
      private Long    tipoCobranca;
      private Long    idComprador;
      private Long    idVendedor;
      private Long   idFornecedor;
      private LocalDateTime dataMovimento;
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
      private Long       idUsurLancouTitulo;
      private Long       idRotinaUsurLancouTitulo;
      private String     idAcesso;
      private String     obse;
      private BigDecimal valorPago;
      private Long       idMotivoDesconto;
      private Long       idCaixa;
      private String     numeroFatura;
      private Long       idBancoMovimento;

      //NÃO PERSISTIDO
      private List<MovimentoPagar> movimentacoes = new ArrayList<>();

}
