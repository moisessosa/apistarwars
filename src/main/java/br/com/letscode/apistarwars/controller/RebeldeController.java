package br.com.letscode.apistarwars.controller;

import br.com.letscode.apistarwars.dto.RebeldeDTO;
import br.com.letscode.apistarwars.dto.RetornoRebeldeDTO;
import br.com.letscode.apistarwars.service.RebeldeService;
import br.com.letscode.apistarwars.service.ReportarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rebeldes")//troque de rebeldes para starwars
public class RebeldeController {
    private final ReportarService reportar;
    private final RebeldeService rebeldeService;

    public RebeldeController(final RebeldeService rebeldeService, ReportarService reportar ) {
        this.rebeldeService = rebeldeService;
        this.reportar = reportar;
    }

    @GetMapping
    public List<RetornoRebeldeDTO> obterListaRebeldes() {
        return rebeldeService.todosRebeldes();
    }

    @GetMapping("/reportar/{id}")
    public RebeldeDTO reportarRebelde(@PathVariable("id") Long id){
        System.out.println("buscando pedido de id: " + id);
        RebeldeDTO rebelde = reportar.reportar(id);
        return rebelde;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RetornoRebeldeDTO cadastrarRebeldes(@RequestBody RebeldeDTO rebeldeDTO) {
        RetornoRebeldeDTO retornoRebeldeDTO = this.rebeldeService.cadastrarRebeldeService(rebeldeDTO);

        return retornoRebeldeDTO;
    }

}
