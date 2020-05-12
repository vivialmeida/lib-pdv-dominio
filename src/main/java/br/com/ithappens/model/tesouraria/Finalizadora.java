package br.com.ithappens.model.tesouraria;

import lombok.Data;

@Data
public class Finalizadora {

    public static final int LANCAMENTO             = 1;
    public static final int VINCULO                = 2;
    public static final int BAIXA_ENTRE_TITULOS    = 3;
    public static final int LANCAMENTO_CLIENTE     = 4;
    public static final int LANCAMENTO_SITEF       = 5;
    public static final int INVALIDO               = 99;

    private Long    id;
    private String  descricao;
    private Integer tipo;
    private boolean vinculoEstoque = false;

    public  Finalizadora (){

    }

    public  Finalizadora (Long id){
        this.id = id;
    }
}
