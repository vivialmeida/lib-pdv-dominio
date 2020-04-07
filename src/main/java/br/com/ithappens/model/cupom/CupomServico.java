package br.com.ithappens.model.cupom;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CupomServico {
      private Long      idCupomServico;
      private Long      idCupomCapa;
      private Integer   sequencia;
      private Integer   tipoUso;
      private Long      referencia;
      private BigDecimal valor;
      private Long      documento;
      private String    nsuhost;
      private String    autorizacao;

}
