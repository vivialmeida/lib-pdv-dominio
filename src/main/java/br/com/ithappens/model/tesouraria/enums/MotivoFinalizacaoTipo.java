package br.com.ithappens.model.tesouraria.enums;

public enum MotivoFinalizacaoTipo {
    NAO_IDENTIFICADO         (12L, "NÃO IDENTIFICADO"          , 9999L, 9999L   ),
    VENDA_CONSUMO            (1L, "VENDA CONSUMO"              , 0L   , 0L      ),
    GARANTIA_ESTENDIDA_JGV   (2L, "GARANTIA ESTENDIDA JGV"     , 1002L, 800001L ),
    PAGAMENTO_FATURA_OBOE    (3L, "PAGAMENTO DE FATURA OBOE"   , 1003L, 118L    ),
    RECARGA_CELULAR_VIVO     (4L, "PRECARGA DE CELULAR - VIVO" , 1001L, 1L      ),
    RECARGA_CELULAR_CLARO    (5L, "RECARGA DE CELULAR CLARO"   , 1001L, 2L      ),
    RECARGA_CELULAR_OI       (6L, "RECARGA DE CELULAR OI"      , 1001L, 3L      ),
    RECARGA_CELULAR_TIM      (7L, "RECARGA DE CELULAR TIM"     , 1001L, 4L      ),
    PAGAMENTO_FATURA_IBI     (8L, "PAGAMENTO DE FATURA IBI"    , 1003L, 115L    ),
    PAGAMENTO_FATURA_RAP     (9L, "PAGAMENTO DE FATURA - RAP"  , 1003L, 246L    ),
    RECARGA_NAO_IDENTIFICADA (10L, "RECARGA NÃO IDENTIFICADA"  , 1001L, 106L    ),
    PAGAMENTO_FATUAR_CREDSHOP(11L, "PAGAMENTO FATURA CREDSHOP" , 1002L, 800005L ),
    BAIXA_FATUARA_PDV        (13L, "BAIXA DE FATURA PDV"       , 1004L, 0L      ),
    CARTAO_PRESENTE          (14L, "CARTAO PRESENTE"           , 1002L, 800003L ),
    SUPER_APP                (15L, "SUPER APP"                 , 1L   , 0L      ),
    SUPER_TROCO              (16L, "SUPER TROCO"               , 1002L, 800002L ),
    MATEUS_ONLINE            (17L, "MATEUS ONLINE"             , 2L   , 0L      );

    private Long id;
    private String descricao;
    private Long codigoOperacao;
    private Long referencia;

    private MotivoFinalizacaoTipo(Long id, String descricao, Long codigoOperacao, Long referencia){
        this.id = id;
        this.descricao = descricao;
        this.codigoOperacao = codigoOperacao;
        this.referencia = referencia;
    }

    public Long getId(){
        return id;
    }

    public Long getReferencia(){
        return referencia;
    }

    public Long getCodigoOperacao(){
        return codigoOperacao;
    }

    public static MotivoFinalizacaoTipo toEnum(Long codigoOperacao, Long referencia){
        if(codigoOperacao == null)
            return  null;

        if(referencia == null)
            return  null;

        for(MotivoFinalizacaoTipo status : MotivoFinalizacaoTipo.values()){
            if(status.getCodigoOperacao().equals(codigoOperacao) && status.getReferencia().equals(referencia))
                return status;
        }

        return  MotivoFinalizacaoTipo.NAO_IDENTIFICADO;
    }

    public static boolean isPagamentoIBI(Long codigoOperacao, Long referencia){
        return toEnum(codigoOperacao, referencia).equals(MotivoFinalizacaoTipo.PAGAMENTO_FATURA_IBI);
    }
}
