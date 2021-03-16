package br.com.ithappens.sitef;

import lombok.Data;

@Data
public class TransacaoSitef {
    private Long    id;
    private Integer codSit;
    private String  empresa;
    private String  dataTrn;
    private String  nsuSitef;
    private String  codLojaSitef;
    private String  codLojaTronco;
    private String  horaTrn;
    private String  valor;
    private String  tipo;
    private String  codResp;
    private String  estado;
    private String  codAutorizacao;
    private String  cupomFiscal;
    private String  produto;
    private String  infoTransacao;
    private String  documento;
    private String  numParcelas;
    private String  numPdv;
    private String  nsuHost;
    private String  modoEntrada;
    private String  codEstabelecimento;
    private String  cnpj;
    private String  descrRede;
    private Integer status = 0;
    private Long filaPendencia;
}
