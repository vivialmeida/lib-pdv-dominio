package br.com.ithappens.sitef.enuns;

public enum ParametroMontagem {

    NSU                	( 0),
    COD_AUTORIZACAO     ( 1);

    private Integer parametro;

    ParametroMontagem(Integer valor){
        this.parametro = valor;
    }

    public Integer getValor() {
        return parametro;
    }

    public static ParametroMontagem get(Integer valor){
        ParametroMontagem parametroMontagem =  null;
        for (ParametroMontagem pm : ParametroMontagem.values()){

            if(pm.getValor().equals(valor)) {
                parametroMontagem = pm;
                break;
            }
        }
        return parametroMontagem;
    }
}
