package br.com.letscode.apistarwars.controller;
import br.com.letscode.apistarwars.dto.RebeldeDTO;
import br.com.letscode.apistarwars.service.ReportarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/starwars")
public class ReportarController {
    final ReportarService reportar;

    public ReportarController(final ReportarService reportar) {
        this.reportar = reportar;
    }
    @GetMapping
    public List<RebeldeDTO> getListarTodosOsRebeldes(){
        return reportar.listarTodosOsRebeldes();
    }
}
