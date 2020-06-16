package br.com.ithappens.model.cadastro.DTOs;

import br.com.ithappens.model.cadastro.FornecedorContratoScantech;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ScantechDTO {

    private Long id;
    private List<Integer> pdv;
    private LocalDate data;
    private List<FornecedorContratoScantech> fornecedor;

}
