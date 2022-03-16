package br.com.letscode.apistarwars.service;

import br.com.letscode.apistarwars.Utils.TypeItem;
import br.com.letscode.apistarwars.entity.Inventario;
import br.com.letscode.apistarwars.entity.Item;
import br.com.letscode.apistarwars.entity.Rebelde;
import br.com.letscode.apistarwars.repository.RebeldeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class RelatorioService {
    @Autowired
    private RebeldeRepository repository;

    public Double porcentagemTraidores() {
        List<Rebelde> todos = repository.getAll();
        Long traidores = todos.stream().filter(r -> r.isTraidor()).count();
        return traidores / Double.valueOf(todos.size());
    }

    public Double porcentagemRebeldes() {
        return 1 - porcentagemTraidores();
    }

    public Map<TypeItem, Double> quantidadeMediaPorRebelde() {
        List<Rebelde> rebeldes = repository.getAll().stream().filter(r -> !r.isTraidor()).collect(Collectors.toList());
        Double numeroRebeldes = Double.valueOf(rebeldes.size());


        List<Item> todosItens = rebeldes.stream()
                                    .map(r -> r.getInventario().getItensInventario())
                                    .flatMap(List::stream)
                                    .collect(Collectors.toList());

        return todosItens.stream()
                .collect(Collectors.groupingBy(Item::getNome, Collectors.summingDouble(i -> i.getQuantidade() / numeroRebeldes)));
    }

    public Long pontosPerdidosTraidores() {
        return repository.getAll().stream()
                         .filter(r -> r.isTraidor())
                         .map(r -> r.getInventario().getItensInventario())
                         .flatMap(List::stream)
                         .mapToLong(Item::getPontos)
                         .sum();
    }
}
