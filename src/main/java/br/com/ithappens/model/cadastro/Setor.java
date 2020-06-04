package br.com.ithappens.model.cadastro;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Setor {

    private Long id;
    private String descricao;
    private Integer ativo;
    private LocalDate data;

}
