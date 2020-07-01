package br.com.ithappens.model.cadastro;

import lombok.Data;

@Data
public class Fornecedor {

    public static long CARTAO_MATEUS = 22026;
    public static long FGV = 25114;
    public static long BRADESCARD =16807;

    private Long id;

    public Fornecedor(){

    }

    public Fornecedor(Long id){
       this.id = id;
    }
}
