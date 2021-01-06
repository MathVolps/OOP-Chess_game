/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Jogador {
    private String nome;
    private Peca pecas[];

    //construtor da classe Jogador (utilizado apenas em casos de partidas iniciadas do zero):
    public Jogador(String nome, Peca equipe[]) {
        this.nome = nome;
        this.pecas = equipe;
    }

    //sobrecarga do construtor, utilizada em casos de partidas carregadas a partir de arquivo:
    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    //método invocado pela classe Jogo, para atribuir ao jogador suas peças após análise do tabuleiro carregado em arquivo:
    public void setPecas(Peca equipe[]) {
        this.pecas = equipe;
    }
}