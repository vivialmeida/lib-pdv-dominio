package br.com.ithappens.model.cadastro.enums;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum Rotina {

      NV_VALIDACAO_DINHEIRO (10133),
      NV_LANCAMENTO_DESPESA_CARTAO   (10135);

      private int id;


      Rotina(int idRotina){
            this.id = idRotina;
      }

      public static Rotina get(int id){
            return  Stream.of(Rotina.values()).filter(f-> f.id == id)
                    .findAny()
                    .orElseThrow(()-> new IllegalArgumentException("Tipo enumerado nao mapeado"));
      }

}
