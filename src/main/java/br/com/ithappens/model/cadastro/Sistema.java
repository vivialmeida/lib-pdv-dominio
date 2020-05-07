package br.com.ithappens.model.cadastro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sistema {

      public static long GMCORE    = 1;
      public static long SUPORTWARE  = 2;
      public static long CREDNOSSO  = 3;
      public static long RUBI      = 4;
      public static long CAMINO_400   = 5;
      public static long CAMINO_406  = 6;
      public static long APP_SUPER  = 7;

      private Long id;
      private String desc;
      private Integer ativo;
}
