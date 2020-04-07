package br.com.ithappens.model.cupom;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CupomFinalizadora {
      private Long            idCupomFinalizadora;
      private Long            idCupomCapa;
      private Integer         sequencia;
      private Long            finalizadora;
      private Long            bandeira;
      private BigDecimal      valor;
      private LocalDateTime   dataVencimento;
      private Integer         parcelas;
      private Integer         dominio;
      private Long            comp;
      private Long            codigoBanco;
      private Long            agencia;
      private Long            conta;
      private Long            numeroCheque;
      private String          cartao;
      private Long            nsusitef;
      private Long            nsuhost;
      private String          produtoTef;
      private String          codigoAutorizacao;
      private String          nossoNumero;
      private String          cpfCnpj;
      private Long            cpfProcurador;


}
