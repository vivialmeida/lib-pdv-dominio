package br.com.ithappens.model.scantech;

import br.com.ithappens.model.cadastro.Produto;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ObejtoScantechDTO {

    private Long idFilial;
    private Integer pdv;
    private List<Produto> prodList;
    private LocalDate data;
    private List<VendaScantechDTO> cupons;
    private Long idLoteSintetico;
}
