# Trabalho Avaliativo I: Locadora de Veículos

Estruturas de dados

Prof. Dr. Fábio Paulo Basso

19/04/2023

Este é o trabalho avaliativo I (T1) que compõe de 20% da nota final da disciplina
e tem por objetivo aprofundar os conceitos sobre Listas. A seguir, seguem algumas
observações que os discentes devem seguir a fim garantirem o melhor resultado
avaliativo.

# 1. Definição

A empresa PampaLoca & Cia LTDA contratou uma equipe de programadores para
criar um programa, na linguagem Java, e com interface de terminal, para o controle da
locação de carros que atenda aos seguintes requisitos:

 Clientes:

o Operações: incluir um cliente, excluir um cliente, editar dados de um
cliente e listar todos os clientes;

o Dados: nome, CNH, telefone e CPF;

o Exemplo:

 Nome: João da Silva Tedesco;

 CNH: 5482156;

 Telefone: (55)3325-2525;

 CPF: 02408925469.

o Restrições:

 Não deve ser possível excluir um cliente atrelado à uma locação,
ou seja, se a um cliente estiver atrelado a um veículo locado;

 A chave para buscar um cliente deve ser o seu CPF;

 A listagem deve ser possível em ambos os sentidos, isto é, do
início para o final da lista e vice-versa.

o Observações

 Não é necessário implementar validações nos dados, por
exemplo, se um CPF é válido ou não.

 Veículos:

o Operações: incluir um veículo, excluir um veículo, editar dados de um
veículo e listar todos os veículos;

o Dados: placa, modelo, marca, ano, potencia, número de lugares,
categoria

o Exemplo 1:

 Placa: IVI-5T72;

 Modelo: Camaro;

 Ano: 2012;

 Potência: 450;

 Lugares: 4;

 Marca: Chevrolet;

 Categoria: esportivo;

o Exemplo 2:

 Placa: IVJ-5B65;

 Modelo: Civic;

 Ano: 2020;

 Potência: 155;

 Lugares: 5;

 Marca: Honda

 Categoria: sedan médio;

o Restrições:

 Não deve ser possível excluir um veículo atrelado à uma locação;

 A chave para buscar um veículo deve ser a sua placa;

 A listagem deve ser possível em ambos os sentidos, isto é, do
início para o final da lista e vice-versa;

 A categoria deve ser definida a partir de uma lista de categorias
previamente cadastradas no sistema (veja exemplos logo abaixo).

 Categorias:

o Operações: incluir categoria, editar categoria, excluir categoria, listar
categorias;

o Dados: nome, identificador;

o Exemplo 1:

 Nome: esportivo;

 Identificador: 1010;

o Exemplo 2:

 Nome: sedan compacto;

 Identificador: 1011;

o Exemplo 3:

 Nome: sedan médio;

 Identificador: 1012;

o Restrições:

 Não deve ser possível excluir categorias às quais existam veículos
atrelados;

 A chave para buscar uma categoria deve ser o seu identificador;

 Locações:

o Operações: locar veículo (incluir locação), devolver veículo (excluir
locação), listar todas as locações ativas;

o Dados: CNH do cliente locador, a placa do veículo disponível para locação,
data da retirada, data de devolução, valor a ser pago;

o Restrições:

 Para devolver um veículo (excluir locação), informar a placa de
veículo;

 Deve ser possível consultar os veículos não locados (disponíveis)
antes de iniciar a locação, ou seja, todos aqueles que não constam
na lista de locações. Ainda, o programa deve possibilitar um filtro
por potência, número de lugares e/ou categoria desses veículos
disponíveis e esses veículos devem ser exibidos em ordem
decrescente ou crescente de acordo com a escolha do usuário;

# 2. Outros requisitos obrigatórios

 O programa deve conter um menu de opções no qual seja possível testar todos
os requisitos acima exigidos;

 O programa deve permitir o carregamento dos dados a partir de arquivos CSV
fornecidos a fim de popular e inicializar as estruturas de dados do trabalho. Para
tanto, faça primeiro a leitura do arquivo Categorias.csv e, a seguir, Veiculos.csv.
Afinal, é preciso criar as categorias antes para atrelá-las aos veículos.

 Os dados devem ser armazenados em listas implementadas pela equipe, isto é,
não é permitido o uso de ArrayList, List, etc já existentes na linguagem Java;

 Este trabalho é uma ótima oportunidade de trabalhar no PIA. Dúvidas,
problemas, etc. devem ser relatados lá assim como as soluções encontradas,
links, vídeos, tutoriais e outros materiais que vcs utilizaram de apoio.
