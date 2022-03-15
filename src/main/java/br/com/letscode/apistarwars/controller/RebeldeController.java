package br.com.letscode.apistarwars.controller;

import br.com.letscode.apistarwars.dto.RebeldeDTO;
import br.com.letscode.apistarwars.dto.RetornoRebeldeDTO;
import br.com.letscode.apistarwars.service.RebeldeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rebeldes")
public class RebeldeController {

    private final RebeldeService rebeldeService;

    public RebeldeController(final RebeldeService rebeldeService) {
        this.rebeldeService = rebeldeService;
    }

    @GetMapping
    public List<RetornoRebeldeDTO> obterListaRebeldes() {
        return rebeldeService.todosRebeldes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RetornoRebeldeDTO cadastrarRebeldes(@RequestBody RebeldeDTO rebeldeDTO) {
        RetornoRebeldeDTO retornoRebeldeDTO = this.rebeldeService.cadastrarRebeldeService(rebeldeDTO);

        return retornoRebeldeDTO;
    }

}
