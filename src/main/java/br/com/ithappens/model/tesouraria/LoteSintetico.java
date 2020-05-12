package br.com.ithappens.model.tesouraria;

import br.com.ithappens.model.tesouraria.enums.StatusLoteSintetico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoteSintetico {

    private Long id;
    private Long idLote;
    private LoteTesouraria loteTesouraria;
    private Long idFinalizadora;
    private Integer status = StatusLoteSintetico.PENDENTE.getValor();;
    private String hash;
}
