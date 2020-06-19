package br.com.ithappens.model.scantech;

import br.com.ithappens.model.cadastro.FornecedorContratoScantech;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ScantechDTO {

    private List<FilialScantech> filialList;
    private LocalDate data;
    private List<FornecedorContratoScantech> fornecedor;
    private FechamentoDiarioScantechDTO fechamento;
}
