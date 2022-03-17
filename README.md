# apistarwars
api project to santander coders and letscode

### CADASTRAR REBELDES
Para listar os rebeldes já cadastrados no Repository utilizar a URL http://localhost:8080/rebeldes, que podem ser obtidos por meio do método GET, que foi inserido na classe RebeldeController.
Dessa forma, para cadastrar novos rebeldes utiliza-se o método POST, também inserido na classe RebeldeController, mas com suas funcionalidades (regras de negócio) feitas na classe RebeldeService. Caso seja inserido de forma correta, haverá uma resposta 201, que indica que a requisição foi bem sucedida e um novo rebelde foi criado.
Como exemplo: 

{
    "nome": "Fulana",
    "idade": 30,
    "acusacoes": 0,
    "genero": "FEMININO",
    "localizacao": {
      "latitude": "45°92'3",
      "longitude": "90º87'6",
      "nomeBase": "TESTE"
    },
    "inventario": {
      "itensInventario": [
          {
              "id": 2,
              "nome":"COMIDA",
              "pontos": 1,
              "quantidade": 6
          },
          {
              "id": 2,
              "nome":"AGUA",
              "pontos": 2,
              "quantidade": 6
          }
        ]
    },
    "traidor": false
}

### REPORTAR REBELDE

Para denunciar um rebelde, use a URL http://localhost:8080/rebeldes/reportar/{id}, onde {id} deve ser substituído pelo id do rebelde a ser denunciado.

Isso usará um método get, em rebeldeController @GetMapping("/reportar/{id}"), este método irá modificar os atributos “acusacoes” e o atributo “traidor” que é um booleano, o método aumenta a quantidade de "acusacoes" e se for maior ou igual a 3 ou o atributo do traidor muda para verdadeiro. A API sempre retorna o objeto Rebelde completo onde você pode ver os atributos e ver como eles mudam.

{
   "id":1,
    "nome": "Fulana",
    "idade": 30,
    "acusacoes": 3,
    "genero": "FEMININO",
    "localizacao": {
      "latitude": "45°92'3",
      "longitude": "90º87'6",
      "nomeBase": "TESTE"
    },
    "inventario": {
      "itensInventario": [
          {
              "id": 2,
              "nome":"COMIDA",
              "pontos": 1,
              "quantidade": 6
          },
          {
              "id": 2,
              "nome":"AGUA",
              "pontos": 2,
              "quantidade": 6
          }
        ]
    },
    "traidor": true
}


### Atualizar localização do rebelde

Um rebelde possuir a capacidade de reportar sua última localização, armazenando a nova latitude, longitude, Base.
Na URL é passado o id do rebelde como seu identificador, usa o Método PUT  http://localhost:8080/rebeldes/{id}/localizacao 


### RELATORIOS
Relatórios
São quatro endpoints:
1. http://localhost:8080/relatorios/porcentagem-traidores: Porcentagem de traidores
2. http://localhost:8080/relatorios/porcentagem-rebeldes: Porcentagem de rebeldes
3. http://localhost:8080/relatorios/qtde-media-itens: Quantidade média de cada tipo de recurso por rebelde
4. http://localhost:8080/relatorios/pontos-perdidos-traidores: Pontos perdidos devido a traidores.

Todos os endpoints respondem pelo verb GET.

