# Currency Converter em Java 17
### O Currency Converter é um programa simples em Java que permite aos usuários converter valores monetários entre diferentes moedas usando a ExchangeRate-API.
Documentação do Currency Converter
Visão Geral O Currency Converter é uma aplicação simples desenvolvida em Java 17 que permite aos usuários converter entre diferentes moedas usando taxas de câmbio em tempo real de uma API externa.
Funcionalidades Principais Visualização de Códigos de Moeda: Os usuários podem visualizar uma lista de códigos de moeda disponíveis.
Conversão de Moeda: Os usuários podem converter um valor de uma moeda para outra. Exibição de Resultados: Os resultados da conversão são exibidos junto com a taxa de conversão e o horário da última atualização.
Tecnologias Utilizadas Java 17: Linguagem de programação principal. Gson: Biblioteca para parsing de JSON. ExchangeRate-API: API externa utilizada para obter taxas de câmbio em tempo real.
Estrutura do Projeto O projeto está estruturado em diferentes pacotes: api: Contém classes para interagir com a API externa. classes: Contém as classes principais do aplicativo, como o CurrencyConverter, Reader e Listings.
README.md: Arquivo de README com instruções de uso e informações sobre o projeto. Como Usar Clonar o Repositório: Clone o repositório do Currency Converter para sua máquina local.
Compilar o Projeto: Compile os arquivos Java usando um compilador compatível com Java 17.
Executar o Aplicativo: Execute a classe CurrencyConverter para iniciar o aplicativo. Seguir as Instruções: Siga as instruções exibidas na tela para realizar as conversões de moeda desejadas.
Contribuição Contribuições são bem-vindas! Sinta-se à vontade para enviar problemas (issues) e solicitações de pull (pull requests) para melhorar o projeto.
Licença Este projeto é licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter mais detalhes.
Esta é uma visão geral e estrutura básica da documentação.
Você pode expandi-la com mais detalhes sobre as classes,
métodos, fluxo de trabalho e exemplos de código, conforme necessário.

## Requisitos
* Java 17 ou superior

## Configurações
Antes de executar o programa, você precisará obter uma chave de API gratuita no ExchangeRate-API. (https://www.exchangerate-api.com/)
Após obter a chave, substitua 'YOUR_API_KEY' no código pelo seu próprio.

1. Compilação: Compile o programa usando o comando abaixo:
javac CurrencyConverter.java

2. Execução: Execute o programa usando o comando abaixo:
java CurrencyConverter

3. Interagindo com o Programa:
* O programa exibirá um catálogo de moedas disponíveis
* Solicitará ao usuário para inserir o código da moeda de origem e da moeda de destino.
* Solicitará ao usuário o valor a ser convertido.
* Exibirá o resultado da conversão.
* Perguntará se o usuário deseja continuar convertendo moedas.

## Estrutura do Código

O código está estruturado em várias classes para uma melhor organização e reutilização de código:

* 'ConnectionAPI': Classe responsável por fazer a conexão com a API de taxas de câmbio e obter os dados.
* 'Listings': Classe que contém a lista de moedas disponíveis e métodos para exibi-las.
* 'Reader': Classe responsável por ler entrada do usuário.
* 'Bargain': Classe que manipula os resultados da conversão e os exibe de forma amigável.
* 'isValidCurrencyCode': Método utilizado para validar os códigos de moeda inseridos pelo usuário.

## Loop Principal

* O programa utiliza um loop while para permitir a conversão contínua de moedas até que o usuário opte por sair.
* Em cada iteração do loop, o programa exibe as listagens de moedas disponíveis, solicita a entrada do usuário para a moeda de origem, a moeda de destino e o valor a ser convertido.
* Após obter os valores, o programa faz uma chamada à API de taxa de câmbio e exibe o resultado da conversão.
* O programa pergunta ao usuário se deseja continuar convertendo moedas após cada conversão.

## Tratamento de Erros

* O código inclui tratamento de exceções para lidar com erros comuns, como entrada inválida do usuário ou falha na conexão com a API.
* Mensagens de erro informativas são exibidas para orientar o usuário sobre problemas específicos e como resolvê-los.


Esta documentação detalhada deve fornecer uma compreensão clara do funcionamento do programa para um iniciante, abordando desde a configuração inicial até a interação com o programa e o tratamento de possíveis erros.



