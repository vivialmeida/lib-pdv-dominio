package br.com.ithappens.model.cadastro;

import lombok.Data;

@Data
public class Comprador {

      private Long id;

      public Comprador(Long id){
            this.id =  id;
      }
}
