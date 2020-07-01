package br.com.ithappens.model.cartao;
public enum TipoSegmento {

    VAREJO(0),
    ATACADO(1);

    private Integer valor;

    TipoSegmento(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public static TipoSegmento get(Integer valor) {

        TipoSegmento status = null;

        for (TipoSegmento st : TipoSegmento.values()) {

            if (st.getValor() == valor) {
                status = st;
                break;
            }

        }

        return status;
    }
}
