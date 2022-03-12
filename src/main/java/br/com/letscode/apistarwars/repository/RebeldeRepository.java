package br.com.letscode.apistarwars.repository;

import br.com.letscode.apistarwars.Utils.TypeItem;
import br.com.letscode.apistarwars.Utils.ItemsValue;
import br.com.letscode.apistarwars.entity.Inventario;
import br.com.letscode.apistarwars.entity.Item;
import br.com.letscode.apistarwars.entity.Localizacao;
import br.com.letscode.apistarwars.entity.Rebelde;
import br.com.letscode.apistarwars.Utils.Genero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class RebeldeRepository {

    private static List<Rebelde> rebeldes = new ArrayList<>();
    //criamos varios Itens
    private static Item comida = new Item(1l,TypeItem.COMIDA,ItemsValue.COMIDA,3);
    private static Item agua = new Item(2l,TypeItem.AGUA,ItemsValue.AGUA,2);
    private static Item municao = new Item(3l,TypeItem.MUNICAO,ItemsValue.MUNICAO,4);
    private static Item arma =  new Item(4l,TypeItem.ARMA,ItemsValue.ARMA,1);
    //
    private static Item comida2 = new Item(5l,TypeItem.COMIDA,ItemsValue.COMIDA,6);
    private static Item agua2 = new Item(6l,TypeItem.AGUA,ItemsValue.AGUA,4);
    private static Item municao2 = new Item(7l,TypeItem.MUNICAO,ItemsValue.MUNICAO,2);
    private static Item arma2 =  new Item(8l,TypeItem.ARMA,ItemsValue.ARMA,3);

    //criamos 2 Inventarios para provas

    private static Inventario inventario = new Inventario(1L,Arrays.asList(comida, agua,municao,arma));
    private static Inventario inventario2 = new Inventario(2L,Arrays.asList(comida2, agua2,municao2,arma2));
    static{

        rebeldes.addAll(Arrays.asList(
            new Rebelde(1L,"Moises",40, Genero.MASCULINO,
                    new Localizacao("45°92'3","90º87'6","Alfa"),inventario,false),

            new Rebelde(2L,"Patricia",25,Genero.FEMENINO,new Localizacao("4°2'13",
                    "9º7'6","Beta"),inventario2,false),

            new Rebelde(3L,"Lucas",25,Genero.MASCULINO,new Localizacao("88°8'8",
                    "0º77'6","Omega"),inventario,false),

            new Rebelde(4L,"Nattana",26,Genero.FEMENINO,new Localizacao("5°92'3",
                    "90º7'6","Gama"),inventario2,false)
        ));
    }

    public Rebelde salvar(Rebelde entidade) {

        entidade.setId(rebeldes.get(rebeldes.size() - 1).getId()+1);

        rebeldes.add(entidade);

        return entidade;
    }
//precisamos criar um metodo para salvar Localizacao, e inventario?
    public List<Rebelde> getAll() {

        return rebeldes;
    }
}
