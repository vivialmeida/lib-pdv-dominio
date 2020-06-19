package br.com.ithappens.model.scantech;

import br.com.ithappens.model.cadastro.DTOs.PdvDTO;
import lombok.Data;

import java.util.List;

@Data
public class FilialScantech {

    private Long id;
    private List<PdvDTO> listPdv;
}
