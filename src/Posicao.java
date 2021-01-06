/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Posicao {
    private int linha;
    private char coluna;
    private boolean status;                                                 //posição ocupada = false, posição livre = true
    private String cor;
    private Peca peca;                                                      //atributo para armezar a peça que ocupa a posição

    //construtor da classe Posição:
    public Posicao(int linha, char coluna, boolean novaPartida) {
        if (coluna >= 'a' && coluna <= 'h' && linha >= 0 && linha < 8) {    //caso os parâmetros estejam adequados
            this.linha = linha;
            this.coluna = coluna;
            this.setCor(linha, coluna);

            if (novaPartida) {                                              //caso de partida inciada do zero
                this.setStatus(true);                                       //definindo posição como livre
                this.setPeca(null);                                         //definindo peça ocupante como nulo                        
            }
        }      
    }

    //método privado e interno para cálculo/definição da cor da posição a partir de suas coordenadas:
    private void setCor(int linha, char coluna) {
        int variacaoColuna = (((int)(coluna)) - ((int)('h')));              //calculando a distância entre a coluna da posição e a última coluna do tabuleiro
        if (linha % 2 == 0) {                                               //linhas pares
            if (variacaoColuna % 2 == 0) {                                  //posição de cor branca
                this.cor = "branco";
            } else {                                                        //posição de cor preta
                this.cor = "preto";
            }
        } else {                                                            //linhas ímpares
            if (variacaoColuna % 2 == 0) {                                  //posição de cor preta
                this.cor = "preto";
            } else {                                                        //posição preta
                this.cor = "branco";
            }
        }
    }

    public String getCor() {
        return this.cor;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getLinha() {
        return this.linha;
    }

    public char getColuna() {
        return this.coluna;
    }

    //método público que retorna a peça ocupante da posição, permite ao tabuleiro acesso às peças:
    public Peca getPeca() {
        return peca;
    }

    //método público que define uma peça ocupante da posição, permite ao tabuleiro acesso às peças (na troca de peças, por exemplo):
    public void setPeca(Peca peca) {
        this.peca = peca;
    }
}
