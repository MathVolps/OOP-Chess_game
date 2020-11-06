public class Tabuleiro {
    private Posicao[][] tabuleiro = new Posicao[8][8];

    public Tabuleiro() {
        for (int i = 0; i <= 7; i++) {                              //percorre as linhas
            char coluna = 'a';                                      //variável auxiliar, usada no construtor da classe Posicao. É resetada ao fim de cada linha
            for (int j = 0; j <= 7; j++) {                          //percorre as colunas
                this.tabuleiro[i][j] = new Posicao(i, coluna);      //instanciamento do objeto Posicao
                if (i == 8 || i == 7 || i == 1 || i == 2) {         //definindo linhas iniciais (2 primeiras e 2 últimas) como ocupadas - situação incial
                    this.tabuleiro[i][j].setStatus(false);
                }
                coluna++;                                           //caractere da coluna é atualizado
            }
        }
    }

    //método que imprime o tabuleiro. Por enquanto, apenas imprime as coordenadas e cores de cada posição:
    public void imprimeTabuleiro() {
        System.out.println("\n              a        b        c        d        e        f        g        h");         //barra superior
        System.out.println("");

        for (int i = 7; i >= 0; i--) {                                                                                  //percorre as linhas
            System.out.print("     " + (i+1) + "  ");                                                                   //barra lateral esquerda (números)
            for (int j = 0; j < 8; j++) {                                                                               //percorre as colunas
                //imprime no formato (linha, coluna)cor
                System.out.print("   " + "(" + (tabuleiro[i][j].getLinha()+1) + "," + tabuleiro[i][j].getColuna() + ")" + tabuleiro[i][j].getCor().charAt(0));
            }
            System.out.println();
        }
        System.out.println("\n              a        b        c        d        e        f        g        h");         //barra inferior
    }

    //método que verifica as posições de um determinado movimento estão dentro do tabuleiro:
    public boolean limitesTabuleiro(Posicao pInicial, Posicao pFinal) {
        if (pInicial.getLinha() >= 1 && pInicial.getLinha() <= 8 && pInicial.getColuna() >= 'a' && pInicial.getColuna() <= 'h' && pFinal.getLinha() >= 1 && pFinal.getLinha() <= 8 && pFinal.getColuna() >= 'a' && pFinal.getColuna() <= 'h') {
            return true;
        } else {
            return false;
        }
    }
}