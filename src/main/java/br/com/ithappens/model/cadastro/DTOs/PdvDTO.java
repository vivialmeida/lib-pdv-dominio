package br.com.ithappens.model.cadastro.DTOs;

import br.com.ithappens.model.cupom.CupomCapa;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PdvDTO {

    private LocalDate fechamento;
    private Integer pdv;
    private Integer qtdMovimentos;
    private List<CupomCapa> cupomCapaList;
    private Integer movimento;
}
