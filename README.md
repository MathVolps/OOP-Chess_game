# Jogo de Xadrez - Java
## Conceito
Este é um projeto desenvolvido durante a disciplina de Programação Orientada à Objetos (POO), cursada durante o 3° semestre da minha graduação de Bacharelado em Ciência da Computação, na Universidade Federal de São Carlos (UFSCar) - campus Sorocaba.</br>
Todo o projeto foi implementado em Java e compreende conceitos clássicos de POO, como encapsulamento, polimorfismo e herança, além do tratamento de exceções, para tornar o jogo mais fluido e constante. O jogo é executado atráves do terminal.</br>

## Pré-requisitos
Para execução deste projeto, é necessária a instalção prévia do JDK, visto que há necessidade de compilação e execução dos arquivos `.java`. Você pode seguir tutoriais de instalação do mesmo através dos links abaixo:</br>
* [Windows](https://giordanolins.com/instalando-o-jdk-java-development-kit-no-windows/).
* [Linux](https://www.devmedia.com.br/instalacao-e-configuracao-do-pacote-java-jdk/23749). 

## Execução:
1. Após instalação correta do JDK, execute o seguinte comando para efetuar download do repositório: `git clone https://github.com/MathVolps/OOP-Chess_game.git`.
2. Execute os comandos abaixo, para acessar a pasta de arquivos `.java`:
```
  cd OOP-Chess_game
  cd src
```
3. Compile e execute o jogo através dos comandos abaixo:
```
  javac *.java
  java Gerenciador
```

## Como jogar:
1. Ao se iniciar o jogo, o mesmo perguntará aos usuários o que se deseja fazer. As opções são:</br>
  * Iniciar uma nova partida;
  * Carregar uma partida pré-existente;
  * Encerrar o jogo.</br>
  *observação: não selecione a segunda opção caso você ainda não tenha iniciado uma partida neste jogo!</br>*
2. Caso a primeira opção seja escolhida, o jogo pedirá os nomes dos jogadores da partida. O primeiro nome solicitado é referente ao(a) jogador(a) de peças brancas, enquanto o segundo, ao(a) jogador(a) de peças pretas. Após a indicação dos nomes, a partida será efetivamente iniciada, o tabuleiro será apresentado e a primeira jogada, solicitada.</br>
O jogo inidicará a vez de cada jogador em cada jogada e mostrará mensagens específicas de erro em casos de jogadas inválidas ou incorretas, acompanhe a comunicação feita pelo jogo, para que a partida se desenvolva corretamente.
3. Caso a segunda opção seja escolhida, o jogo irá se preprarar para retormar uma partida pré-existente a partir de um arquivo `.txt` - arquivo este criado após a interrupção de uma partida feita neste mesmo jogo. O arquivo deve estar localizado no mesmo diretório (pasta) do programa e seu nome deve ser informado corretamente ao jogo. Caso haja erro na leitura do arquivo, o jogo irá avisar.
4. Durante a partida, seja ela uma partida iniciada do zero ou carregada a partir de arquivo, os(as) jogadores(as) podem interromper a partida a durante suas respectivas jogadas, inserindo o valor 0 (zero) no terminal. Ao decidir interromper a partida, você deve informar o nome do arquivo que deseja salvar a partida - atente-se, o nome do arquivo deve ser válido, acompanhe as mensagens específicas do jogo para saber melhor.

## Observações importantes:
* Alguns detalhes complexos ou que não impactam na aprendizagem dos pilares e conceitos de POO não estão presentes no jogo, por exemplo, não há movimentos ou regras específicas, como o *roque*, Afogamento, Xeque Perpétuo, Xeque Descoberto, Regra das Três Posições e Regra dos 50 Movimentos.
* A vítoria em uma partida ocorre após a captura do Rei adversário. Todo xeque-mate é precedido de um aviso de xeque.

## Autor:
* Matheus Vargas Volpon Berto ([MathVolps](https://github.com/MathVolps)).
