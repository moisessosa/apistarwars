package br.com.letscode.apistarwars.service;

import br.com.letscode.apistarwars.dto.RebeldeDTO;
import br.com.letscode.apistarwars.dto.RetornoRebeldeDTO;
import br.com.letscode.apistarwars.entity.Rebelde;
import br.com.letscode.apistarwars.repository.RebeldeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
        rebeldeEntidade.setLocalizacao(rebeldeDTO.getLocalizacao());
        rebeldeEntidade.setInventario(rebeldeDTO.getInventario());

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

}