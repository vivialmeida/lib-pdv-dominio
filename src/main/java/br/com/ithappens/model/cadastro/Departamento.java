package br.com.ithappens.model.cadastro;

import lombok.Data;

@Data
public class Departamento {

    private Long id;
    private String descricao;
    private Integer ativo;
    private Long idSetor;
}
