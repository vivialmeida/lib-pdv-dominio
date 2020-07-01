package br.com.ithappens.model.cartao;

import lombok.Getter;

public enum TipoCiclo {

    TIPO_NAO_DEFINIDO(0, "Tipo não definido"),
    TIPO_QTDE_DIAS(1,"Qtd dias (N)"),
    TIPO_QTDE_PRIMEIRO_MES_QTDE_DIAS(2,"Primeira parcela (1 mês) qtd de dias (N)"),
    TIPO_QTDE_MES_DIA_DA_SEMADA(3,"Qtd mes (N) dia da semana (D)"),
    TIPO_QTDE_DIAS_SEMADA_INTERCALADA_FILIAL(5,"Qtd dias (N) semana par ou impar"),
    TIPO_QTDE_DIAS_DIA_SEMANA(6,"Qtd dias (N) dia da semana"),
    TIPO_QTDE_DIAS_PERIODO_EMISSAO(7,"Qtd dias (N) período de emissão"),
    TIPO_QTDE_DIAS_A_PARTIR_DIA_REF(8,"Qtd dias (N) a partir dia referencia"),
    TIPO_QTDE_PRIMEIRO_MES31_OUTROS30(9, "Primeira parcela (31 dias) demais (30 dias)"),
    TIPO_QTDE_DIAS_PERIODO_VENCIMENTO(10,"Qtd dias (N) período de vencimento"),
    TIPO_PRIMEIRA_E_ULTIMA_SEMANA(11,"Primeira e última semana");

    /*    Tipos de ciclos de vencimentos para transações de cartão

    1 - Qtd dias (N)
        Data da transação da venda + N dias

    2 - Primeira parcela (1 mês) qtd de dias (N)
        Para a parcela 1, soma 1 mês a data da transação da venda
        Para as demais parcelas soma-se (N) dias a partir da parcela 1

    3 - Qtd mes (N) dia da semana (D)
        Soma-se (N) mês a data da transação da venda
        Adiciona/ subtrai dias até o dia da semana configurado

    4 - ?

    5 - Qtd dias (N) semana par ou impar
        Os pagamentos são realizados intercalados por semana e filial
        Soma-se (N) dias a data da transação da venda e adiciona/ subtrai dias até chegar no dia da semana configurado.
        Configuração a nivel de filial.

    6 - Qtd dias (N) dia da semana
        Soma-se (N) dias
        Verifica o dia da semana de corte (Dia referencia)
        Adiciona/ subtrai dias até dia deposito

    7 - Qtd dias (N) período de emissão
        Verifica o periodo em que a data de emissão se encaixa
        Pega a ultima data valida do periodo (caso o mês tenha 28,30 ou 31 dias, tratar)
        Soma-se os dias a data do ultimo periodo
        Adiciona dias até chegar ao dia de repasse

    8 - Qtd dias (N) a partir dia referencia
        Soma-se 1 dia até encontrar o dia de corte( dia referencia)
        Soma-se o ciclo a data do corte

    9 - Primeira parcela (31 dias) demais (30 dias)
        Para a parcela 1, soma-se 31 dias e para as demais 30 dias
        Sempre considerar o primeiro periodo de 31 dias

    10 - Qtd dias (N) período de vencimento
        Soma-se os dias do ciclo a data de emissão
        Verifica o periodo em que a data de emissão+ciclo se encaixa
        Pega a ultima data valida do periodo (caso o mês tenha 28,30 ou 31 dias, tratar)
        Adiciona dias até chegar ao dia de repasse

    11 - Primeira e última semana
        Soma-se os dias do ciclo a data de emissão
        Verifica se o dia é menor que 8 (primeira semana) ou se o dia + 7 cai no proximo mês (ultima semana)
        adiciona 1 dia até condição anterior ser verdadeira

    */

    TipoCiclo(Integer id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public static TipoCiclo valueOf(Integer value){
        TipoCiclo result = null;

        for (TipoCiclo tipoFeriado: TipoCiclo.values()) {
            if(tipoFeriado.getId()==value){
                result = tipoFeriado;
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
