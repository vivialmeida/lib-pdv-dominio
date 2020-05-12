package br.com.ithappens.model.tesouraria.enums;

public enum LoteStatus {
    PENDENTE                        (0),
    CONCLUIDO                       (1),
    ERRO_CONCLUSAO                  (2),
    RESULTADO_NAO_ECONTRADO         (3),
    TESOURARIA_ABERTA               (4),
    LOTE_VMIX_NAO_VALIDADOS         (5),
    LOTE_PDV_NAO_VALIDADOS          (6),
    CONCLUIDO_MANUAL                (7);

    private Integer id;

    private LoteStatus(Integer id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static LoteStatus toEnum(Integer id){
        if(id == null)
            return  null;
        for(LoteStatus status : LoteStatus.values()){
            if(id.equals(status.getId()))
                return status;
        }
        throw new IllegalArgumentException("Status Lote inválido!");
    }
}
