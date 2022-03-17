package br.com.letscode.apistarwars.controller;

import br.com.letscode.apistarwars.Utils.TypeItem;
import br.com.letscode.apistarwars.dto.RetornoRebeldeDTO;
import br.com.letscode.apistarwars.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {
    @Autowired
    private RelatorioService relatorioService;

    @GetMapping("/porcentagem-traidores")
    public Double porcentagemTraidores() {
        return relatorioService.porcentagemTraidores();
    }

    @GetMapping("/porcentagem-rebeldes")
    public Double porcentagemRebeldes() {
        return relatorioService.porcentagemRebeldes();
    }

    @GetMapping("/qtde-media-itens")
    public Map<TypeItem, Double> quantidadeMediaPorRebelde() {
        return relatorioService.quantidadeMediaPorRebelde();
    }

    @GetMapping("/pontos-perdidos-traidores")
    public Long pontosPerdidosTraidores() {
        return relatorioService.pontosPerdidosTraidores();
    }
}
