package br.com.ithappens.model.scantech;

import br.com.ithappens.model.cadastro.DTOs.PdvDTO;
import br.com.ithappens.model.cadastro.FornecedorContratoScantech;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ScantechDTO {

    private LocalDate data;
    private List<FornecedorContratoScantech> fornecedor;
    private FechamentoDiarioScantechDTO fechamento;
    private Long idFilial;
    private Long idLoteSintetico;
    private List<PdvDTO> pdvs;
}
