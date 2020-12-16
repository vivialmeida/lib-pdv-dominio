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
      private Integer    tipo;
      private Integer    idFilial;
      private Integer    agenteCobrador;
      private Integer    tipoCobranca;
      private Integer    idComprador;
      private Integer    idVendedor;
      private Integer   idFornecedor;
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
      private Integer    idUsurLancouTitulo;
      private Integer    idRotinaUsurLancouTitulo;
      private String     idAcesso;
      private String     obse;
      private BigDecimal valorPago;
      private Integer    idMotivoDesconto;
      private Integer    idCaixa;
      private String     numeroFatura;
      private Long       idBancoMovimento;

      //NÃO PERSISTIDO
      private List<MovimentoPagar> movimentacoes = new ArrayList<>();

}
