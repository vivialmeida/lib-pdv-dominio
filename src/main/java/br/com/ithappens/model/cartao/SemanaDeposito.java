package br.com.ithappens.model.cartao;

import lombok.Getter;

public enum SemanaDeposito {

    NAO_DEFINIDO(0,"Não definido"),
    SEMANA_IMPAR(1,"Semana impar"),
    SEMANA_PAR(2,"Semana par");

    SemanaDeposito(Integer id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public static SemanaDeposito valueOf(Integer value){
        SemanaDeposito result = null;

        for (SemanaDeposito semanaDeposito: SemanaDeposito.values()) {
            if(semanaDeposito.getId()==value){
                result = semanaDeposito;
                break;
            }
        }

        return result;
    }

    @Getter
    private Integer id;
    @Getter
    private String desc;
}
