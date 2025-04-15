Soma de Caminhos em Árvore Binária
Este programa tem como objetivo calcular a soma dos números formados pelos caminhos da raiz até as folhas de uma árvore binária. Cada nó da árvore contém um dígito de 0 a 9, e cada caminho da raiz até uma folha representa um número.

Como funciona
Entrada do usuário:

O programa começa pedindo o valor da raiz da árvore.

Em seguida, ele solicita os valores dos filhos da raiz (esquerdo e direito).

Depois, ele pede os filhos dos filhos da raiz (formando a árvore com três níveis, no exemplo atual).

Construção da árvore:

A árvore binária é construída dinamicamente com os valores inseridos pelo usuário. O programa cria cada nó com o valor inserido, e os filhos são definidos conforme as entradas.

Cálculo da soma:

A função de Busca em Profundidade (DFS) percorre a árvore e calcula a soma dos números formados pelos caminhos da raiz até as folhas. Cada nó forma um número ao ser combinado com os valores dos nós acima dele.

Resultado:

O programa calcula e exibe a soma total dos números gerados pelos caminhos da raiz até as folhas.

Exemplo de execução
Quando o programa é executado, ele solicita ao usuário os valores para a árvore. Por exemplo:

java
Copy
Edit
Digite o valor da raiz (dígito entre 0 e 9): 4
Digite o valor do filho esquerdo da raiz: 9
Digite o valor do filho direito da raiz: 0

Agora, digite os filhos dos nós abaixo:
Digite o valor do filho esquerdo do nó 9: 5
Digite o valor do filho direito do nó 9: 1
Digite o valor do filho esquerdo do nó 0: 6
Digite o valor do filho direito do nó 0: 3

==== CÁLCULO DA SOMA ====
Resultado final: 1350
=========================
Fim da execução.
Como rodar o código
Pré-requisitos:

Certifique-se de que você tenha o Java instalado em sua máquina. Você pode verificar isso executando java -version no terminal. Se o Java não estiver instalado, siga as instruções no site oficial do Java para instalar.

Passos:

Abra o Eclipse ou qualquer outro ambiente de desenvolvimento Java.

Crie um novo projeto Java.

Adicione uma nova classe Java (por exemplo, SomaCaminhos.java) e cole o código fornecido acima.

Execute o código no Eclipse.

Saída: O programa exibirá a soma dos números formados pelos caminhos da raiz até as folhas, e a execução será concluída com a mensagem "Fim da execução".

Explicação do Código
Classe SomaCaminhos:

Esta classe contém o método main que inicializa o programa, pedindo entradas do usuário e processando o cálculo da soma dos caminhos.

Métodos:

somarNumeros(No no): Este método calcula a soma dos números formados pelos caminhos da raiz até as folhas. Ele chama o método de busca em profundidade (dfs).

dfs(No no, int somaAtual): Este método é responsável pela busca em profundidade (DFS) na árvore. Ele percorre a árvore, calculando os números formados pelos caminhos da raiz até as folhas e retorna a soma total.

inserirFilho(Scanner scanner, String lado, int valorPai): Este método é responsável por pedir ao usuário o valor de um nó filho, validando a entrada para garantir que o valor seja um dígito entre 0 e 9.

Classe No:

A classe No é usada para representar os nós da árvore binária. Cada nó tem um valor (dígito de 0 a 9), e os nós podem ter filhos esquerdo e direito.

Validação de Entrada:

O código garante que os valores inseridos pelo usuário estejam entre 0 e 9. Caso contrário, o programa exibirá uma mensagem de erro e terminará a execução.

Dependências
Java (qualquer versão a partir do Java 8 deve funcionar)

Licença
Este projeto está sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.
