package br.com.ithappens.model.cadastro;

import lombok.Data;

@Data
public class TipoCobranca {

    public static long CARTAO_CREDITO       = 5;
    public static long DINHEIRO             = 10;
    public static long TICKET_ELETRON       = 13;
    public static long DESPESA_CARTOES      = 1004;
    public static long PAGT_CARTAO_MATEUS   = 1421;
    public static long RECARGA_CELULAR      = 1420;
    public static long GARANTIA_ESTENDIDA   = 1902;
    public static long CARGA_CREDNOSSO      = 2003;

    public Long id;

    public TipoCobranca(){

    }

    public TipoCobranca(Long id){
        this.id = id;
    }
}
