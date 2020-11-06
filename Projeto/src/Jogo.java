public class Jogo {
    private Tabuleiro tabuleiro;                //atributo da classe Tabuleiro (composição)
    private int situacao;                       //1 = início de jogo, 2 = xeque, 3 = xeque mate
    private int jogada;                         //1 = jogador 1 e 2 = jogador 2

    public Jogo() {
        this.tabuleiro = new Tabuleiro();       //inicializa o tabuleiro
        this.setSituacao(1);                    //define a situação do jogo como "início"
        this.setJogada(1);                      //define a "vez" como do jogador 1
    }

    //método que imprime a disposição atual do tabuleiro (por enquanto, apenas a de início):
    public void tabuleiroAtual() {
        this.tabuleiro.imprimeTabuleiro();
    }

    public int getSituacao() {
        return this.situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public int getJogada() {
        return this.jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }
}
