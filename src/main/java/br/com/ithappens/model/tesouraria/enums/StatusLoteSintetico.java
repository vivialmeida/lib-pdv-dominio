package br.com.ithappens.model.tesouraria.enums;

public enum StatusLoteSintetico {

    PENDENTE                    (0),
    ERRO                        (1),
    PENDENTE_DEVOLUCAO          (2),
    PROCESSADO                  (3);

    private Integer valor;

    StatusLoteSintetico(Integer valor){
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public static StatusLoteSintetico get(Integer valor){

        StatusLoteSintetico status =  null;

        for (StatusLoteSintetico st : StatusLoteSintetico.values()){

            if(st.getValor() == valor) {
                status = st;
                break;
            }
        }
        return status;
    }
}
