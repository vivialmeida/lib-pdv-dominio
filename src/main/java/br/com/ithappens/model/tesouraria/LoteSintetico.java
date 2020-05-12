package br.com.ithappens.model.tesouraria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoteSintetico {

    private Long id;
    private Long idFilial;
    private Long idLote;
    private LocalDate data;
//    private StatusLoteSinteticoCartaoOff status;
    private String hash;
}
