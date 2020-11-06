public class Posicao {
    private int linha;
    private char coluna;
    private boolean status;                                                 //posição ocupada = false, posição livre = true
    private String cor;

    public Posicao(int linha, char coluna) {
        if (coluna >= 'a' && coluna <= 'h' && linha >= 0 && linha < 8) {    //caso os parâmetros estejam adequados
            this.linha = linha;
            this.coluna = coluna;
            this.setStatus(true);
            this.setCor(linha, coluna);
        } else {                                                            //caso contrário, uma mensagem é impressa na tela
            System.out.println("Erro, essa posição não é válida.");
        }       
    }

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
}
