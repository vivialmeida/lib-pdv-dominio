package br.com.ithappens.model.financeiro.enums;


import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum TipoLancamento {

      VENDA_PARA_COMERCIALIZACAO(66),
      VENDA_CUPOM_ECF(74),
      PAGAMENTO_FATURA(75),
      RECARGA_CELULAR(76),
      GARANTIA_ESTENDIDA(80),
      ANTECIPACAO_CARTAO(99),
      RECARGA_CELULAR_PAGAR(102),
      GARANTIA_ESTENDIDA_PAGAR(110),
      GARANTIA_ESTENDIDA_CARTAO_PAGAR(111),
      PAGAMENTO_FATURA_PAGAR(109),
      SUPER_TROCO_PAGAR(146),


      /*cartao */
      VENDA_CUPOM_ECF_CARTAO(79),
      GARANTIA_ESTENDIDA_CARTAO(82),
      RECARGA_CELULAR_CARTAO(81),
      PAGAMENTO_CARNE(119);

      private int id;


      TipoLancamento(int id) {
            this.id = id;
      }

      public static TipoLancamento get(int id) {
            return Stream.of(TipoLancamento.values())
                    .filter(f-> f.getId() ==  id)
                    .findAny()
                    .orElseThrow(() -> new IllegalArgumentException("Tipo enumerado nao mapeado"));


      }


}
