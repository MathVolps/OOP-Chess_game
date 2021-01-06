import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Gerenciador {
    private Jogo jogo;

    public static void main(String[] args) {
        Gerenciador g = new Gerenciador();
    }

    public Gerenciador() {
        System.out.println("\nVocê está iniciando o gerenciador do jogo...");
        Scanner entrada = new Scanner(System.in);

        while(true) {                                                       //loop infinito, finalizado apenas quando o gerenciador é encerrado ou a partida é finalizada/interrompida.
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Novo jogo");
            System.out.println("2 - Continuar partida");
            System.out.println("3 - Encerrar gerenciador");

            String linha = entrada.nextLine();                              //leitura da opção escolhida pelo usuário
                                                                            //análise do valor inserido (ele deve ser um inteiro e existente entre as opções disponíveis)
            try {
                int inteiro = Integer.parseInt(linha);                      //tentativa de conversão do texto inserido em inteiro
                if (inteiro == 1) {                                         //opção 1: nova partida
                    this.recebeJogadores();                                 //método para recebimento dos jogadores (e início da partida)
                } else if (inteiro == 2) {                                  //opção 2: carregar uma partida pré-existente a partir de arquivo
                    this.jogo = new Jogo();                                 //instaciamento de objeto da classe Jogo
                    jogo.carregarPartida();                                 //invocação do método que carrega a partida pré-existente (método esse da classe Jogo)
                } else if (inteiro == 3) {                                  //opção 3: encerramento do Gerenciador e do programa
                    System.out.println("Até breve!");
                    entrada.close();                                        //fechamento do scanner (entrada de dados)
                    System.exit(0);                                         //encerramento do programa
                } else {                                                    //caso o valor inserido não exista nas opções disponíveis
                    System.out.println("Valor não existente no menu de opções, tente novamente.");      //mensagem específica de aviso
                    System.out.println("\n");
                }
            } catch (InputMismatchException | NumberFormatException e) {    //caso haja exceção de entrada (valor inserido não é um inteiro - char, string ou double)
                System.out.println("Entrada inválida, tente novamente.");   //mensagem específica de aviso
                System.out.println("\n");
            }
        }
    }

    //método privado e interno para recebimento dos nomes dos jogadores e instanciamento do jogo (situação inicial):
    private void recebeJogadores() {
        System.out.println("Por favor, informe os nomes do jogadores da partida.");
        Scanner scanner = new Scanner(System.in);                       
        System.out.println("Jogador(a) de peças brancas:");
        String nome1 = scanner.nextLine();                                          //lendo o primeiro nome
        System.out.println("Jogador(a) de peças pretas:");
        String nome2 = scanner.nextLine();                                          //lendo o segundo nome
        this.jogo = new Jogo(nome1, nome2);                                         //instanciando o objeto do jogo
        scanner.close();
    }
}
