package br.com.letscode.apistarwars.service;

import br.com.letscode.apistarwars.dto.InventarioDTO;
import br.com.letscode.apistarwars.dto.ItemDTO;
import br.com.letscode.apistarwars.dto.LocalizacaoDTO;
import br.com.letscode.apistarwars.dto.RebeldeDTO;
import br.com.letscode.apistarwars.entity.Item;
import br.com.letscode.apistarwars.entity.Rebelde;
import br.com.letscode.apistarwars.repository.RebeldeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class ReportarService {
    private final RebeldeRepository repository;

    public List<RebeldeDTO> listarTodosOsRebeldes(){
        List<Rebelde>rebeldes =repository.getAll();

        List<RebeldeDTO> listaRebeldesDTO = rebeldes.stream()
                .map(entidade-> fromEntidadeRetornoRebeldeDTO(entidade))
                .collect(Collectors.toList());
        return listaRebeldesDTO;

    }

    private RebeldeDTO fromEntidadeRetornoRebeldeDTO(Rebelde entidade) {
        RebeldeDTO rebeldeDTO = new RebeldeDTO();
        InventarioDTO inventarioDTO = new InventarioDTO();

        ItemDTO itemDTO = new ItemDTO();

        List<ItemDTO> listaItems = new ArrayList<>();
        rebeldeDTO.setId(entidade.getId());
        rebeldeDTO.setAcusacoes(entidade.getAcusacoes());
        rebeldeDTO.setGenero(entidade.getGenero());
        rebeldeDTO.setIdade(entidade.getIdade());
        rebeldeDTO.setNome(entidade.getNome());
        rebeldeDTO.setTraidor(entidade.isTraidor());


//       //rebeldeDTO.setInventario((InventarioDTO) entidade.getInventario().getItensInventario());
//       rebeldeDTO.setLocalizacao(entidade.getLocalizacao().getLatitude(),entidade.getLocalizacao().getLongitude(),
//               entidade.getLocalizacao().getNomeBase());
        return rebeldeDTO;
    }
//    public static boolean reportarRebelde(Long id){
//        return reportar();
//    }
public RebeldeDTO reportar(Long id){

        //tem que devolver é um Rebelde DTO
    List<Rebelde>rebeldes =repository.getAll();
    System.out.println(rebeldes);
    for (int i = 0; i < rebeldes.size() ; i++) {
        System.out.println("entro no for");
        Rebelde rebelde = rebeldes.get(i);

        RebeldeDTO rebeldeDTO = new RebeldeDTO();
        rebeldeDTO.setId(rebelde.getId());
        rebeldeDTO.setNome(rebelde.getNome());
        rebeldeDTO.setIdade(rebelde.getIdade());
        rebeldeDTO.setAcusacoes(rebelde.getAcusacoes());
        rebeldeDTO.setGenero(rebelde.getGenero());

        //rebeldeDTO.setInventario(new InventarioDTO((List<ItemDTO>) rebelde.getInventario()));
        rebeldeDTO.setLocalizacao( new LocalizacaoDTO(rebelde.getLocalizacao().getLatitude(),
                rebelde.getLocalizacao().getLongitude(),
                rebelde.getLocalizacao().getNomeBase()));

        if(rebelde.getId().equals(id)){

            rebelde.setAcusacoes();
            rebeldeDTO.setAcusacoes(rebelde.getAcusacoes());

            if(rebelde.getAcusacoes()>=3){
                rebelde.setTraidor(true);
                rebeldeDTO.setTraidor(rebelde.isTraidor());

                return rebeldeDTO;
            }
            return rebeldeDTO;
        }

    }
        return null;

}
}
