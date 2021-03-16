package br.com.ithappens.sitef;

import br.com.ithappens.model.cadastro.Filial;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LoteCartao {
    public static final int PENDENTE      = 1;
    public static final int CONCLUIDO     = 2;
    public static final int ERRO          = 3;

    private Long        id;
    private Filial      filial;
    private LocalDate   data;
    private Integer     status;
}
