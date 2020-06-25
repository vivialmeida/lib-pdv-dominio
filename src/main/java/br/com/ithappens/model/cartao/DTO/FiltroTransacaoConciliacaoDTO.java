package br.com.ithappens.model.cartao.DTO;

import br.com.ithappens.model.cadastro.Cliente;
import br.com.ithappens.model.cadastro.Empresa;
import br.com.ithappens.model.financeiro.TituloPagar;
import br.com.ithappens.model.financeiro.TituloReceber;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class FiltroTransacaoConciliacaoDTO {


    private Cliente cliente;
    private Empresa empresa;
    private Long idArquivo;
    private TituloReceber tituloReceber;
    private TituloPagar tituloPagar;
    private LocalDate dtImportacao;
    private LocalDate dtProcessamento;
    private Integer qtdeTransacoes;
    private Integer status;
    private Double valorTransacoes;
    private Double valorComissao;
    private Double valorLiquido;

    List<TituloReceber> listTitulo;


}
