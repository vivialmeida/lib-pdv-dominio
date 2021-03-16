package br.com.ithappens.model.tesouraria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoteFinalizadoraNaoProcessado {

    private Finalizadora   finalizadora;
    private Long           qtdRegistros;
    private String         log;
    private LoteTesouraria loteTesouraria;
}
