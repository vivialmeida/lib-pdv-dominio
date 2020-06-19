package br.com.ithappens.model.cadastro;

import lombok.Data;

import java.util.List;

@Data
public class FornecedorContratoScantech {

    private Long id;
    private Long idFornecedor;
    private Integer ativo;

    private List<Produto> produtoList;
}
