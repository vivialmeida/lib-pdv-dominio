package br.com.ithappens.model.cadastro;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Produto {

    private Long id;
    private Long idFornecedor;
    private Long idGrupo;
    private Long idSubgrupo;
    private Long idDpto;
    private Long idSecao;
    private Long idValidade;
    private Long idCategoria;
    private Long idOrigem;
    private Long idUnidMedidaVar;
    private Long idUnidMedidaAta;
    private String  descricao;
    private String  unidMedida;
    private String  descGondula;
    private String  descPdv;
    private String  codigoBarras;
    private String  embalagemFornecida;
    private String  AtacadoCodigoBarras;
    private String  uniAtacado;
    private String  refeForn;
    private String  excluirSugestaoCompra;
    private String  cest;
    private String  idNCM;
    private Integer pesoBruto;
    private Integer pesoLiqu;
    private Integer ativo;
    private Integer sazonal;
    private Integer idSimilar;
    private Integer grupoSimilar;
    private Integer indiFrac;
    private Integer idPaiRela;
    private Integer multiVendaAtac;
    private Integer idGrupoTrib;
    private Integer ativoPadaria;
    private Integer tipo;
    private Integer ativoPermanente;
    private Integer pdv;
    private Integer indicadorPeso;
    private Integer almoxerifado;
    private Integer especial;
    private Integer multiploEmbalagem;
    private Integer movEstNegativo;
    private Integer tara;
    private Integer bonificacao;
    private Integer bonificacaoVenda;
    private LocalDateTime dtAlteracao;
    private LocalDate dtCada;
    private BigDecimal idLinha;

}
