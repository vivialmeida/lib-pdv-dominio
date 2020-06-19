package br.com.ithappens.model.cadastro.DTOs;

import br.com.ithappens.model.cadastro.Filial;
import br.com.ithappens.model.cadastro.FornecedorContratoScantech;
import br.com.ithappens.model.cadastro.Produto;
import br.com.ithappens.model.cupom.CupomCapa;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ScantechDTO {

    private Filial filial;
    private List<Integer> pdv;
    private List<Integer> movimentos;
    private LocalDate data;
    private List<FornecedorContratoScantech> fornecedor;
    private List<Produto> produtoList;
    private List<CupomCapa> cupomCapaList;

}
