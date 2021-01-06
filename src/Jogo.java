import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Jogo {
    private Tabuleiro tabuleiro;                    //atributo da classe Tabuleiro (composição)
    private int situacao;                           //1 = início de jogo, 2 = insuficiência material, 3 = xeque, 4 = xeque-mate
    private int jogada;                             //0 = jogador peças brancas e 1 = jogador peças pretas
    private Jogador jogadores[];                    //vetor de jogadores
    private Peca pecas[] = new Peca[32];            //vetor de peças
    
    //construtor 1 (situação de nova partida):
    public Jogo(String str1, String str2) {
        this.inicializaAtributos();
        this.inicializaPecas();
        this.inicializaJogadores(str1, str2);
        this.comecaJogo();
    }

    //construtor 2 (situação de partida carregada):
    public Jogo() {
        this.jogadores = new Jogador[2];                //inicializa vetor de jogadores
        this.tabuleiro = new Tabuleiro(false, null);    //inicializa tabuleiro, mas sem o vetor de peças, visto que, no caso de partida carregada, é o tabuleiro que preenche o vetor de peças
    }

    //método privado e interno para inicialização dos atributos do Jogo:
    private void inicializaAtributos() {
        this.setSituacao(1);                            //define a situação do jogo como "início"
        this.setJogada(0);                              //define a "vez" como do jogador 1
        this.jogadores = new Jogador[2];                //inicializa o vetor de jogadores
    }

    //método interno e privado para inicialização das peças do jogo:
    private void inicializaPecas() {
        //definindo as peças brancas no vetor:
        this.pecas[0] = new Bispo("branco");
        this.pecas[1] = new Bispo("branco");
        this.pecas[2] = new Cavalo("branco");
        this.pecas[3] = new Cavalo("branco");
        this.pecas[4] = new Torre("branco");
        this.pecas[5] = new Torre("branco");
        this.pecas[6] = new Rainha("branco");
        this.pecas[7] = new Rei("branco");
        for (int i = 8; i < 16; i++) {
            this.pecas[i] = new Peao("branco");
        }

        //definindo as peças pretas no veotr (na mesma ordem utilizada acima):
        this.pecas[16] = new Bispo("preto");
        this.pecas[17] = new Bispo("preto");
        this.pecas[18] = new Cavalo("preto");
        this.pecas[19] = new Cavalo("preto");
        this.pecas[20] = new Torre("preto");
        this.pecas[21] = new Torre("preto");
        this.pecas[22] = new Rainha("preto");
        this.pecas[23] = new Rei("preto");
        for (int i = 24; i < 32; i++) {
            this.pecas[i] = new Peao("preto");
        }

        tabuleiro = new Tabuleiro(true, pecas);                     //inicializa o tabuleiro, passando o vetor de peças do jogo
    }

    //método privado e interno para inicialização dos jogadores:
    private void inicializaJogadores(String str1, String str2) {
        Peca pecasIndividuais[] = new Peca[16];                     //vetor auxiliar de peças, também com 16 elementos
        for (int i = 0; i < 16; i++) {
            pecasIndividuais[i] = pecas[i];                         //atribuindo no vetor auxiliar as 16 primeiras peças do vetor de 32 elementos
        } 
        this.jogadores[0] = new Jogador(str1, pecasIndividuais);    //instanciando o jogador 1, atribuindo nome e vetor de peças do mesmo

        for (int i = 0; i < 16; i++) {
            pecasIndividuais[i] = pecas[i+16];                      //atribuindo no vetor auxiliar as 16 últimas peças do vetor de 32 elementos
        }
        this.jogadores[1] = new Jogador(str2, pecasIndividuais);    //instanciando o jogador 2, atribuindo nome e vetor de peças do mesmo
    }

    //método privado e interno para início do jogo:
    private void comecaJogo() {
        System.out.println();
        System.out.println("Jogo inciado com sucesso!");
        System.out.println("Tabuleiro atual:");
        tabuleiro.imprimeTabuleiro();

        while (true) {                                              //loop infinito, visto que o jogo só deve ser finalizado em caso de empate, derrota ou interrupção pelo usuário
            boolean aux = true;

            //verificando a situação de Insuficiência Material (empate);
            if (verificaInsuficiencia()) {
                setSituacao(2);
                System.out.println("Insuficiência material, com as peças atuais é impossível finalizar a partida.");
                System.out.println("Empate! Obrigado por jogarem.\n");
                System.exit(0);                
            }

            if (getJogada() == 0) {                                                                             //se a vez for do jogador 1
                System.out.println("Jogador(a) " + jogadores[0].getNome() + ", é a sua vez.");
                while (aux) {
                    if (this.fazerJogada()) {                                                                   //invoca método de jogada
                        System.out.println();
                        System.out.println("A jogada foi realizada com sucesso!\n");                            //caso tenha sucesso, informa ao jogador
                        aux = false;
                    } else {
                        System.out.println("Tente novamente.");                                                 //caso não tenha sucesso, informa ao jogador e uma nova jogada poderá ser feita
                    }
                }
            } else if (getJogada() == 1) {                                                                      //se a vez for do jogador 1
                System.out.println("Jogador(a) " + jogadores[1].getNome() + ", é a sua vez.");
                while (aux) {
                    if (this.fazerJogada()) {                                                                   //invoca método de jogada
                        System.out.println();
                        System.out.println("A jogada foi realizada com sucesso!\n");                            //caso tenha sucesso, informa ao jogador
                        aux = false;
                    } else {
                        System.out.println("Tente novamente.");                                                 //caso não tenha sucesso, informa ao jogador e uma nova jogada poderá ser feita
                    }
                }
            }

            //verificando a situação de xeque-mate branco (vitória do jogador 2);
            if (xequeMate("branco")) {
                setSituacao(4);
                tabuleiro.imprimeTabuleiro();
                System.out.println("\nJogador(a) " + jogadores[1].getNome() + ", você perdeu.");
                System.out.println("Jogador(a) " + jogadores[0].getNome() + " é o(a) vencedor(a)!");
                System.out.println("Fim de jogo, obrigado por jogarem.\n");
                System.exit(0);
            }
            
            //verificando a situação de xeque-mate preto (vitória do jogador 1);
            if (xequeMate("preto")) {
                tabuleiro.imprimeTabuleiro();
                setSituacao(4);
                System.out.println("\nJogador(a) " + jogadores[0].getNome() + ", você perdeu.");
                System.out.println("Jogador(a) " + jogadores[1].getNome() + " é o(a) vencedor(a)!");
                System.out.println("Fim do jogo, obrigado por jogarem.\n");
                System.exit(0);
            }

            
            //verifica se o rei preto está em xeque:
            if (this.tabuleiro.xeque("preto")) {
                if (getSituacao() == 3) {                                                                                   //caso o jogo já estivesse em xeque
                    System.out.println("\nO jogo continua em xeque!");
                } else {                                                                                                    //caso ocorra um novo xeque
                    System.out.println("\nO jogo está em xeque!");
                }
                if (getJogada() == 0) {
                    System.out.println("Jogador(a) " + jogadores[1].getNome() + ", salve seu Rei caso seja possível!\n");   //o jogador 2 é avisado
                }
                setSituacao(3);                                                                                             //a situação é definida para xeque
            }

            //verifica se o rei branco está em xeque:
            if (this.tabuleiro.xeque("branco")) {
                if (getSituacao() == 3) {                                                                                   //caso o jogo já estivesse em xeque
                    System.out.println("\nO jogo continua em xeque!");
                } else {                                                                                                    //caso ocorra um novo xeque
                    System.out.println("\nO jogo está em xeque!");
                }
                if (getJogada() == 1) {
                    System.out.println("Jogador(a) " + jogadores[0].getNome() + ", salve seu Rei caso seja possível!\n");   //o jogador 1 é avisado
                }
                setSituacao(3);                                                                                             //a situação é definida para xeque
            }
                       

            if (this.getJogada() == 0) {
                this.setJogada(1);                                                                                          //alteração de jogada
            } else {
                this.setJogada(0);                                                                                          //alteração de jogada
            }
            tabuleiro.imprimeTabuleiro();                                                                                   //impressão do novo tabuleiro
        }
    }

    private int getSituacao() {
        return this.situacao;
    }

    private void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    private int getJogada() {
        return this.jogada;
    }

    private void setJogada(int jogada) {
        this.jogada = jogada;
    }

    //método privado e interno para recebimento de jogada:
    private boolean fazerJogada() {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Insira o movimento que deseja realizar ou digite '0' para interromper a partida.\n");
        int l1, l2;
        char c1, c2;
        String l1String = "";
        String l2String = "";

        System.out.println("[Coordenadas de origem]");
        while(true) {
            System.out.println("Insira a coluna origem:");
            c1 = entrada.next().charAt(0);                                                                  //lendo o primeiro caractere da entrada
                
            if (c1 >= 'a' && c1 <= 'h') {                                                                   //verificação de intervalo válido
                break;                                                                                      //caso seja, o loop é finalizado
            } else if (c1 == '0') {                                                                         //caso a entrada seja zero (opção de interrupção)
                salvarPartida();                                                                            //o método para salvar a partida (arquivo) é invocado
            } else {
                System.out.println("Entrada inválida! A coluna deve estar entre 'a' e 'h'.");               //mensagem de aviso de entrada inválida
                System.out.println("");
            }
        }

        while(true) {
            try {
                System.out.println("Insira a linha origem:");
                l1String = entrada.next();                                                                  //recebimento da entrada como string
                
                if (l1String != null && l1String.matches("[1-8]")) {                                        //verificação de entrada válida (uso de expressão regular)
                    l1 = Integer.parseInt(l1String);                                                        //conversão para inteiro
                    break;                                                                                  //quebra do loop, pois o valor é válido
                } else if (l1String.matches("[0]")) {
                    salvarPartida();
                } else {
                    System.out.println("Entrada inválida! A linha deve ser um inteiro entre 1 e 8.");       //mensagem de aviso de entrada inválida
                    System.out.println("");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de entrada inválida, tente novamente.\n");
            }
        }

        System.out.println("\n[Coordenadas de destino]");
        while(true) {
            System.out.println("Insira a coluna destino:");
            c2 = entrada.next().charAt(0);                                                                  //lendo o primeiro caractere da entrada
                
            if (c2 >= 'a' && c2 <= 'h') {                                                                   //verificação de intervalo válido
                break;                                                                                      //caso seja, o loop é finalizado
            } else if (c2 == '0') {
                salvarPartida();
            } else {
                System.out.println("Entrada inválida! A coluna deve estar entre 'a' e 'h'.");               //mensagem de aviso de entrada inválida
                System.out.println("");
            }
        }

        while(true) {
            try {
                System.out.println("Insira a linha destino:");
                l2String = entrada.next();                                                                  //recebimento da entrada como string

                if (l2String != null && l2String.matches("[1-8]")) {                                        //verificação de entrada válida (uso de expressão regular)                                     
                    l2 = Integer.parseInt(l2String);                                                        //conversão para inteiro
                    break;                                                                                  //quebra do loop, pois o valor é válido
                } else if (l2String.matches("[0]")) {
                    salvarPartida();
                } else {
                    System.out.println("Entrada inválida! A linha deve ser inteiro entre 1 e 8.");          //mensagem de aviso de entrada inválida
                    System.out.println("");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de entrada inválida, tente novamente.\n");
            }
        }
        
        if (getJogada() == 0) {                                                                             //vez do jogador de peças brancas
            if (this.tabuleiro.movimentaPeca(l1-1, c1, l2-1, c2, "branco", true)) {                         //tentiva de movimentação (com entradas válidas) de peças brancas
                return true;
            }
        } else {                                                                                            //vez do jogador de peças pretas
            if (this.tabuleiro.movimentaPeca(l1-1, c1, l2-1, c2, "preto", true)) {                          //tentiva de movimentação (com entradas válidas) de peças pretas
                return true;
            }
        }
        return false;                                                                                       //caso o movimento não seja possível, o retorno é falso
    }

    //método privado e interno para verificação de Insuficiência Material:
    private boolean verificaInsuficiencia() {
        int contador = 0;                                                                                   //contador para as peças presentes no jogo
        //caso 1: Rei vs Rei 
        for (int i = 0; i < 32; i++) {
            if (pecas[i].getStatus()) {                                                                     //contando quantas peças estão ativas no jogo
                contador++;
            }

            if (contador > 2) {                                                                             //se haver mais peças que as descritas no caso
                break;
            }
        }

        if (contador == 2 && pecas[7].getStatus() && pecas[23].getStatus()) {                               //apenas duas peças ativas e ambas são os Reis
            return true;
        } 

        //caso 2 e 3: Rei vs Rei e Bispo OU Rei vs Rei e Cavalo
        contador = 0;
        for (int i = 0; i < 32; i++) {
            if (pecas[i].getStatus()) {                                                                     //contando quantas peças estão ativas no jogo
                contador++;
            }

            if (contador > 3) {                                                                             //se haver mais peças que as descritas no caso
                return false;
            }
        }

        //caso as peças ativas sejam aquelas na primeira opção do caso:
        if (contador == 3 && ((pecas[7].getStatus() && pecas[23].getStatus() && (pecas[16].getStatus() && !pecas[17].getStatus() || !pecas[16].getStatus() && pecas[17].getStatus())) || (pecas[23].getStatus() && pecas[7].getStatus() && (pecas[0].getStatus() && !pecas[1].getStatus() || !pecas[0].getStatus() && pecas[1].getStatus())))) {   
            return true;
        }

        //caso as peças ativas sejam aquelas na segunda opção do caso:
        if (contador == 3 && ((pecas[7].getStatus() && pecas[23].getStatus() && (!pecas[18].getStatus() && pecas[19].getStatus() || pecas[18].getStatus() && !pecas[19].getStatus())) || (pecas[23].getStatus() && pecas[7].getStatus() && (!pecas[2].getStatus() && pecas[3].getStatus() || pecas[2].getStatus() && !pecas[3].getStatus())))) {
            return true;
        }
        return false;
    }

    //método privado e interno para salvar partida em arquivo:
    private void salvarPartida() {
        System.out.println("\nUm arquivo de texto com as configurações da partida atual será criado.");
        Scanner entrada = new Scanner(System.in);
        while(true) {                                                                           //loop infinito
            System.out.println("");
            System.out.println("Como deseja nomear o arquivo?");      
            String nome = entrada.next();                                                       //recebimento do nome desejado para o arquivo

            try {
                File obj = new File(nome+".txt");                                               //tentativa de criar um arquivo .txt com o nome informado
                if (obj.createNewFile()) {                                                      //caso haja sucesso na criação
                    String text = tabuleiro.textoArquivo();                                     //o conteúdo do tabuleiro (de todas as suas posições) é armazenado em uma string
                    System.out.println("\nArquivo criado com sucesso.");
                    FileWriter myWriter = new FileWriter(nome+".txt");                          //um objeto para escrita no arquivo é criado
                    myWriter.write(jogadores[0].getNome() + "\n");                              //escrevendo no arquivo o nome do jogador 1
                    myWriter.write(jogadores[1].getNome() + "\n");                              //escrevendo no arquivo o nome do jogador 2
                    myWriter.write(getSituacao()+ "\n");                                        //escrevendo no arquivo a situação do jogo
                    myWriter.write(getJogada() + "\n");                                         //escrevendo no arquivo a jogada (de quem é a vez)
                    myWriter.write(text);                                                       //a string do tabuleiro é escrita no arquivo
                    myWriter.close();                                                           //ao fim da escrita, o objeto de escrita é encerrado
                    System.out.println("Partida salva com sucesso.\n");
                    entrada.close();
                    System.out.println("Obrigado por jogarem, espero que esta partida seja retomada em breve!\n");
                    System.exit(0);                                                             //finalização do programa
                } else {                                                                        //caso não haja sucesso na criação do arquivo
                    System.out.println("Nome indisponível, aquivo já existente.");              //uma mensagem de aviso é impressa
                }
            } catch (IOException e) {                                                           //caso seja capturada uma exceção durante a criação do arquivo
                System.out.println("Ocorreu um erro.");                                         //uma mensagem de aviso é impressa
            }
        }
    }

    //método para carregamento de partida a partir de arquivo:
    public void carregarPartida() {
        System.out.println("A partida será carregada a partir de um arquivo de texto.");
        System.out.println("Atente-se ao padrão obrigatório do arquivo.\n");
        Scanner entrada = new Scanner(System.in);

        while(true) {                                                                       //loop infinito
            System.out.println("Qual é o nome do arquivo?");                                //pergunta-se o nome desejado para o arquivo
            String nome = entrada.nextLine();

            try {
                File myObj = new File(nome+".txt");                                         //verifica se há arquivo com o nome inserido
                Scanner myReader = new Scanner(myObj);                                      //um objeto para leitura de arquivo é criado
                int aux = 1;                                                                //variável auxiliar, indica qual é a linha que será lida
                while (myReader.hasNextLine()) {                                            //percorrendo cada linha do arquivo
                    String data = myReader.nextLine();                                      //lendo a linha
                    configuraPartidaRetomada(data, aux);                                    //invocando método para extração de infrmações presentes na linha
                    aux++;
                }
                myReader.close();                                                           //após leitura de todo o arquivo, fechamento do leitor
                break;                                                                      //quebra do loop
            } catch (FileNotFoundException e) {                                             //exceção para arquivo não encontrado
                System.out.println("Arquivo não encontrado.\n");
            }
        }
        
        //criação de vetores auxiliares para recebimento das peças ativas atualmente no jogo (a partir do tabuleiro, que foi preenchido de acordo com o arquivo):
        Peca[] vetorJogador0 = tabuleiro.pecasJogadoresPartidaRetomada("branco");           //vetor de peças brancas
        Peca[] vetorJogador1 = tabuleiro.pecasJogadoresPartidaRetomada("preto");            //vetor de peças pretas

        //concatenação dos dois vetores anteriores em um único vetor de 32 peças (atributo da classe Jogo):
        System.arraycopy(vetorJogador0, 0, this.pecas, 0, vetorJogador0.length);                    //concatenação da 1° metade
        System.arraycopy(vetorJogador1, 0, this.pecas, vetorJogador0.length, vetorJogador1.length); //concatenação da 2° metade

        //atribuindo os vetores individuais a cada um dos joagdores:
        jogadores[0].setPecas(vetorJogador0);
        jogadores[1].setPecas(vetorJogador1);
        comecaJogo();                                                                       //invocação do método para início do jogo (agora, todos os preparativos já foram feitos)
    }

    //método privado e interno para extração de informações do arquivo:
    private void configuraPartidaRetomada(String frase, int linha) {
        int tam = frase.length();                                                           //armazenando o tamanho da linha (para diferenciação entre posições ocupadas ou não) 
        if (linha <= 4) {                                                                   //casos especiais: quatro primeiras linhas do arquivo
            switch(linha) {
                case 1:                                                                     //linha 1
                    jogadores[0] = new Jogador(frase.substring(0, tam));                    //extraindo nome do jogador 1
                    break;
                case 2:                                                                     //linha 1
                    jogadores[1] = new Jogador(frase.substring(0, tam));                    //extraindo nome do jogador 2
                    break;
                case 3:                                                                     //linha 3
                    setSituacao(frase.charAt(0)-48);                                        //extraindo situação do jogo
                    break;
                case 4:                                                                     //linha 4
                    setJogada(frase.charAt(0)-48);                                          //extraindo jogada (de quem é a vez) do jogo
                    break;
            }
        } else {                                                                            //demais linhas do arquivo
            int l = frase.charAt(0)-48;                                                     //extraindo coordenada da linha da posição
            char c = frase.charAt(2);                                                       //extraindo coordenada da coluna da posição

            if (tam == 6) {                                                                 //linhas que representam posições ocupadas (apresentam o desenho da peça):
                String peca = frase.substring(4, 6);                                        //extraindo o desenho da peça
                tabuleiro.distribuicaoAtual(l, c, peca);                                    //criando a posição no tabuleiro e inserindo a peça
            } else if (tam == 3) {                                                          //linhas que representam posições livres (não apresentam o desenho da peça):
                tabuleiro.distribuicaoAtual(l, c);                                          //apenas criando a posição no tabuleiro (não há peça)
            }
        }
    }

    //método privado e interno para verificação de xeque-mate (verifica se o rei foi capturado):
    private boolean xequeMate(String corDoRei) {
        if (corDoRei == "preto") {                  //caso a cor do rei seja preta
            if (!pecas[7].getStatus()) {            //verifica-se o status do 7° elemento do vetor de peças
                return true;
            } else {
                return false;
            }
        } else if (corDoRei == "branco") {          //caso a cor do rei seja branca
            if (!pecas[23].getStatus()) {           //verifica-se o status do 23° elemento do vetor de peças
                return true;
            } else {
                return false;
            }
        }
        return false;                               //caso a cor passada não seja "preto" ou "branco", retorna nulo
    }
}
