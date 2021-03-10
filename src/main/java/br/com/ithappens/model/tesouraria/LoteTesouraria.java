package br.com.ithappens.model.tesouraria;

import br.com.ithappens.model.tesouraria.enums.LoteStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoteTesouraria {

    public static final Integer RECEBER        = 1;
    public static final Integer PAGAR          = 2;
    public static final Integer RECEBER_PAGAR  = 3;

    private Long id;
    private FechamentoLoja fechamentoLoja;
    private Finalizadora   finalizadora;
    private LoteStatus     statusReceber;
    private LoteStatus     statusPagar;
    private Long           qtdRegistros;
}
