package br.com.letscode.apistarwars.service;

import br.com.letscode.apistarwars.dto.*;
import br.com.letscode.apistarwars.entity.Inventario;
import br.com.letscode.apistarwars.entity.Item;
import br.com.letscode.apistarwars.entity.Localizacao;
import br.com.letscode.apistarwars.entity.Rebelde;
import br.com.letscode.apistarwars.repository.RebeldeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RebeldeService {

    private final RebeldeRepository rebeldeRepository;

    public RetornoRebeldeDTO cadastrarRebeldeService(RebeldeDTO rebeldeDTO) {

        Rebelde rebeldeEntidade = new Rebelde();

        rebeldeEntidade.setNome(rebeldeDTO.getNome());
        rebeldeEntidade.setIdade(rebeldeDTO.getIdade());
        rebeldeEntidade.setGenero(rebeldeDTO.getGenero());


        rebeldeEntidade.setLocalizacao(new Localizacao(Double.valueOf((Math.random()*1000)).longValue(),
                rebeldeDTO.getLocalizacao().getLatitude(),
                rebeldeDTO.getLocalizacao().getLongitude(),
                rebeldeDTO.getLocalizacao().getNomeBase()));
        rebeldeEntidade.setInventario(rebeldeDTO.getInventario());


//        List<Item> lista = new ArrayList<>();
//        lista.addAll(rebeldeDTO.getInventario().getItensInventario().stream().collect());
//        rebeldeEntidade.setInventario();

        Rebelde rebeldeSalvo = rebeldeRepository.salvar(rebeldeEntidade);

        RetornoRebeldeDTO dto = deEntidadeParaDTO(rebeldeSalvo);

        return dto;
    }

    public List<RetornoRebeldeDTO> todosRebeldes() {
        List<Rebelde> rebeldeEntidade = rebeldeRepository.getAll();

        List<RetornoRebeldeDTO> listaRetorno = rebeldeEntidade.stream()
                .map(entidade -> deEntidadeParaDTO(entidade))
                .collect(Collectors.toList());

        return listaRetorno;
    }

    public RetornoRebeldeDTO deEntidadeParaDTO(Rebelde rebelde) {
        RetornoRebeldeDTO retornoRebeldeDTO = new RetornoRebeldeDTO();
        retornoRebeldeDTO.setId(rebelde.getId());
        retornoRebeldeDTO.setNome(rebelde.getNome());
        retornoRebeldeDTO.setIdade(rebelde.getIdade());
        retornoRebeldeDTO.setGenero(rebelde.getGenero());
        retornoRebeldeDTO.setLocalizacao(rebelde.getLocalizacao());
        retornoRebeldeDTO.setInventario(rebelde.getInventario());

        return retornoRebeldeDTO;
    }

    public RetornaLocalizacaoRebeldeDTO atualizarLocalizacao(Long id, LocalizacaoDTO localizacao) throws Exception {
        Localizacao novaLocalizacao = new Localizacao(Double.valueOf((Math.random() * 1000)).longValue(), localizacao.getLatitude(), localizacao.getLongitude(), localizacao.getNomeBase());
        try {
            Rebelde rebelde = rebeldeRepository.getById(id);
            RetornoRebeldeDTO rebeldeAtualizado = deEntidadeParaDTO(rebelde);
            rebeldeAtualizado.setLocalizacao(novaLocalizacao);
            return new RetornaLocalizacaoRebeldeDTO(rebeldeAtualizado.getId(), novaLocalizacao.getLatitude(), novaLocalizacao.getLongitude(), novaLocalizacao.getNomeBase());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }

    }

}