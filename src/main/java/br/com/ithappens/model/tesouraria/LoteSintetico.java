package br.com.ithappens.model.tesouraria;

import br.com.ithappens.model.tesouraria.enums.StatusLoteSintetico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoteSintetico {

    public static final int VENDA    = 1;
    public static final int CARTAO   = 2;
    public static final int DESCONTO = 3;
    public static final int SCANTECH = 4;

    private Long id;
    private Long idLote;
    private LoteTesouraria loteTesouraria;
    private Long idFinalizadora;
    private Integer status = StatusLoteSintetico.PENDENTE.getValor();
    private String hash;
    private LocalDate data;
    private Integer processo;
}
