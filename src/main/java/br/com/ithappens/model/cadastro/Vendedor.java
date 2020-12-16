package br.com.ithappens.model.cadastro;

import lombok.Data;

@Data
public class Vendedor {

      private Long id;

      public Vendedor(Long id) {
            this.id = id;
      }
}

