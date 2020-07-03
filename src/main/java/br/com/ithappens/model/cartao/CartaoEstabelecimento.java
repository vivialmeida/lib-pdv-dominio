package br.com.ithappens.model.cartao;

import br.com.ithappens.model.cadastro.Filial;
import lombok.Data;

@Data
public class CartaoEstabelecimento {

    private Long          id;
    private String        estabelecimento;
    private Filial        filial;
    private boolean       ativo;
    private TipoSegmento  tipoSegmento;
}
