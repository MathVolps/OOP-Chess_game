/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Tabuleiro {
    private Posicao[][] tabuleiro = new Posicao[8][8];

    //construtor do tabuleiro:
    public Tabuleiro(boolean novaPartida, Peca[] todasAsPecas) {     
        if (novaPartida) {
            distribuicaoInicial(todasAsPecas);
        }
    }

    //método privado e interno para distribuição das peças do tabuleiro, em uma situação de nova partida:
    private void distribuicaoInicial(Peca[] todasAsPecas) {
        //percorredno o tabuleiro e instanciando cada posição (ainda vazias):
        for (int i = 0; i < 8; i++) {
            char coluna = 'a';
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = new Posicao(i, coluna, true);
                coluna++;
            }
        }        

        //percorrendo o vetor de peças - parâmetro - e colocoando-as em suas respectivas posições no tabuleiro:
        for (int i = 0; i < 32; i++) {
            switch(i) {
                case 0:
                tabuleiro[0][2].setPeca(todasAsPecas[i]);
                tabuleiro[0][2].setStatus(false);
                break;
                
                case 1:
                tabuleiro[0][5].setPeca(todasAsPecas[i]);
                tabuleiro[0][5].setStatus(false);
                break;
                
                case 2:
                tabuleiro[0][1].setPeca(todasAsPecas[i]);
                tabuleiro[0][1].setStatus(false);
                break;

                case 3:
                tabuleiro[0][6].setPeca(todasAsPecas[i]);
                tabuleiro[0][6].setStatus(false);
                break;

                case 4:
                tabuleiro[0][0].setPeca(todasAsPecas[i]);
                tabuleiro[0][0].setStatus(false);
                break;

                case 5:
                tabuleiro[0][7].setPeca(todasAsPecas[i]);
                tabuleiro[0][7].setStatus(false);
                break;

                case 6:
                tabuleiro[0][3].setPeca(todasAsPecas[i]);
                tabuleiro[0][3].setStatus(false);
                break;
                
                case 7:
                tabuleiro[0][4].setPeca(todasAsPecas[i]);
                tabuleiro[0][4].setStatus(false);
                break;
                
                case 8:
                tabuleiro[1][0].setPeca(todasAsPecas[i]);
                tabuleiro[1][0].setStatus(false);
                break;

                case 9:
                tabuleiro[1][1].setPeca(todasAsPecas[i]);
                tabuleiro[1][1].setStatus(false);
                break;

                case 10:
                tabuleiro[1][2].setPeca(todasAsPecas[i]);
                tabuleiro[1][2].setStatus(false);
                break;

                case 11:
                tabuleiro[1][3].setPeca(todasAsPecas[i]);
                tabuleiro[1][3].setStatus(false);
                break;

                case 12:
                tabuleiro[1][4].setPeca(todasAsPecas[i]);
                tabuleiro[1][4].setStatus(false);
                break;

                case 13:
                tabuleiro[1][5].setPeca(todasAsPecas[i]);
                tabuleiro[1][5].setStatus(false);
                break;

                case 14:
                tabuleiro[1][6].setPeca(todasAsPecas[i]);
                tabuleiro[1][6].setStatus(false);
                break;

                case 15:
                tabuleiro[1][7].setPeca(todasAsPecas[i]);
                tabuleiro[1][7].setStatus(false);
                break;

                case 16:
                tabuleiro[7][2].setPeca(todasAsPecas[i]);
                tabuleiro[7][2].setStatus(false);
                break;

                case 17:
                tabuleiro[7][5].setPeca(todasAsPecas[i]);
                tabuleiro[7][5].setStatus(false);
                break;

                case 18:
                tabuleiro[7][1].setPeca(todasAsPecas[i]);
                tabuleiro[7][1].setStatus(false);
                break;

                case 19:
                tabuleiro[7][6].setPeca(todasAsPecas[i]);
                tabuleiro[7][6].setStatus(false);
                break;

                case 20:
                tabuleiro[7][0].setPeca(todasAsPecas[i]);
                tabuleiro[7][0].setStatus(false);
                break;

                case 21:
                tabuleiro[7][7].setPeca(todasAsPecas[i]);
                tabuleiro[7][7].setStatus(false);
                break;

                case 22:
                tabuleiro[7][3].setPeca(todasAsPecas[i]);
                tabuleiro[7][3].setStatus(false);
                break;

                case 23:
                tabuleiro[7][4].setPeca(todasAsPecas[i]);
                tabuleiro[7][4].setStatus(false);
                break;
                
                case 24:
                tabuleiro[6][0].setPeca(todasAsPecas[i]);
                tabuleiro[6][0].setStatus(false);
                break;
                
                case 25:
                tabuleiro[6][1].setPeca(todasAsPecas[i]);
                tabuleiro[6][1].setStatus(false);
                break;

                case 26:
                tabuleiro[6][2].setPeca(todasAsPecas[i]);
                tabuleiro[6][2].setStatus(false);
                break;

                case 27:
                tabuleiro[6][3].setPeca(todasAsPecas[i]);
                tabuleiro[6][3].setStatus(false);
                break;

                case 28:
                tabuleiro[6][4].setPeca(todasAsPecas[i]);
                tabuleiro[6][4].setStatus(false);
                break;

                case 29:
                tabuleiro[6][5].setPeca(todasAsPecas[i]);
                tabuleiro[6][5].setStatus(false);
                break;

                case 30:
                tabuleiro[6][6].setPeca(todasAsPecas[i]);
                tabuleiro[6][6].setStatus(false);
                break;

                case 31:
                tabuleiro[6][7].setPeca(todasAsPecas[i]);
                tabuleiro[6][7].setStatus(false);
                break;
            }
        }
    }

    //método invocado pela classe Jogo, para instanciar as peças no tabuleiro em uma partida carregada a partir de arquivo:
    public void distribuicaoAtual(int linha, char coluna, String peca) {
        tabuleiro[linha][coluna-97] = new Posicao(linha, coluna, false);            //instanciando a posição (parâmetro novaPartida = false)
        tabuleiro[linha][coluna-97].setStatus(false);                               //definindo o status da posição como false (ocupada)
        switch(peca) {                                                              //instanciando as peças, de acordo com o desenho recebido
            case "Rw":
            tabuleiro[linha][coluna-97].setPeca(new Torre("branco"));
            break;

            case "Nw":
            tabuleiro[linha][coluna-97].setPeca(new Cavalo("branco"));
            break;

            case "Bw":
            tabuleiro[linha][coluna-97].setPeca(new Bispo("branco"));
            break;

            case "Qw":
            tabuleiro[linha][coluna-97].setPeca(new Rainha("branco"));
            break;

            case "Kw":
            tabuleiro[linha][coluna-97].setPeca(new Rei("branco"));
            break;

            case "Pw":
            tabuleiro[linha][coluna-97].setPeca(new Peao("branco"));
            break;

            case "Rb":
            tabuleiro[linha][coluna-97].setPeca(new Torre("preto"));
            break;

            case "Nb":
            tabuleiro[linha][coluna-97].setPeca(new Cavalo("preto"));
            break;

            case "Bb":
            tabuleiro[linha][coluna-97].setPeca(new Bispo("preto"));
            break;

            case "Qb":
            tabuleiro[linha][coluna-97].setPeca(new Rainha("preto"));
            break;

            case "Kb":
            tabuleiro[linha][coluna-97].setPeca(new Rei("preto"));
            break;

            case "Pb":
            tabuleiro[linha][coluna-97].setPeca(new Peao("preto"));
            break;

        }
    }

    //sobrecarga do método acima, utilizada para instanciar posições livres (sem peça) no tabuleiro, a partir de arquivo:
    public void distribuicaoAtual(int linha, char coluna) {
        tabuleiro[linha][coluna-97] = new Posicao(linha, coluna, false);            //instanciando a posição (parâmetro novaPartida = false)
        tabuleiro[linha][coluna-97].setStatus(true);                                //definindo o status da posição como true (livre)
        tabuleiro[linha][coluna-97].setPeca(null);                                  //definindo o campo peca da posição como nulo
    }

    //método que percorre o tabuleiro e o imprime:
    public void imprimeTabuleiro() {
        System.out.println("\n        a     b     c     d     e     f     g     h");    //barra superior
        System.out.println("");

        for (int i = 7; i >= 0; i--) {                                                  //percorre as linhas
            System.out.print("     " + (i+1) + "  ");                                   //barra lateral esquerda (números)
            for (int j = 0; j < 8; j++) {                                               //percorre as colunas
                //imprime no formato (linha, coluna)cor
                if (!tabuleiro[i][j].getStatus() && tabuleiro[i][j].getPeca() != null) {                                     //caso a posição esteja ocupada
                    System.out.print(tabuleiro[i][j].getPeca().desenho() + "    ");     //o desenho da peça é impresso
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println("\n"); 
        }
        System.out.println("        a     b     c     d     e     f     g     h");      //barra inferior
        System.out.println("");
    }

    //método que verifica as posições de um determinado movimento estão dentro do tabuleiro:
    private boolean limitesTabuleiro(Posicao pInicial, Posicao pFinal) {
        //verificando se a linha e coluna de ambas as posições estão dentro do tabuleiro:
        if (pInicial.getLinha() >= 0 && pInicial.getLinha() < 8 && pInicial.getColuna() >= 'a' && pInicial.getColuna() <= 'h' && pFinal.getLinha() >= 0 && pFinal.getLinha() < 8 && pFinal.getColuna() >= 'a' && pFinal.getColuna() <= 'h') {
            return true;
        } else {
            return false;
        }
    }

    //método público, invocado pela classe Jogo, que verifica a possível movimentação de uma peça:
    public boolean movimentaPeca(int linhaOrigem, char colunaOrigem, int linhaDestino, char colunaDestino, String cor, boolean troca) {
        int c1 = (int) (colunaOrigem - 97);         //cast da coluna origem para int
        int c2 = (int) (colunaDestino - 97);        //cast da coluna destino para int
        //verificação inicial: se ambas as posições (origem e destino) estão dentro do tabuleiro
        if (limitesTabuleiro(this.tabuleiro[linhaOrigem][c1], this.tabuleiro[linhaDestino][c2])) {
            //verificação se a posição de origem está ocupada:
            if (!this.tabuleiro[linhaOrigem][c1].getStatus()) {
                //verificação se a peça presente na posição de origem pertence ao jogador:
                if (this.tabuleiro[linhaOrigem][c1].getPeca().getCor() == cor) {
                    //verificação de qual o tipo de peça presente na posição origem:
                    if (this.tabuleiro[linhaOrigem][c1].getPeca() instanceof Cavalo) {             //caso a peça a ser movimentada seja um cavalo (não é necessário verificar caminho)
                        //movimento "de comer" ou "de andar":
                        if (this.tabuleiro[linhaDestino][c2].getStatus() || (!this.tabuleiro[linhaDestino][c2].getStatus() && this.tabuleiro[linhaDestino][c2].getPeca().getCor() != cor)) {
                            //caso o método checaMovimento da peça retorne verdadeiro, a troca é possível (mas depende do parâmetro troca):
                            if (troca) {
                                if (this.tabuleiro[linhaOrigem][c1].getPeca().checaMovimento(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {
                                    this.trocaPecas(this.tabuleiro[linhaOrigem][c1], this.tabuleiro[linhaDestino][c2]);     //invocando método de troca de peças
                                    return true;
                                } else {
                                    //mensagem de erro, caso o jogador tente mover uma peça que não pertença a sua equipe:
                                    System.out.println("Movimento inválido: movimentação não respeita os padrões da peça em questão.");
                                    return false;
                                }
                            } else {
                                return this.tabuleiro[linhaOrigem][c1].getPeca().checaMovimento(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
                            }
                        }
                    } else if (this.tabuleiro[linhaOrigem][c1].getPeca() instanceof Peao) {         //caso a peça a ser movimentada seja um peão
                        //movimento "de comer" ou "de andar" - com características do peão:
                        if ((c2 - c1 == 0 && this.tabuleiro[linhaDestino][c2].getStatus()) || ((c2 - c1 == 1 || c2 - c1 == -1) && !this.tabuleiro[linhaDestino][c2].getStatus() && this.tabuleiro[linhaDestino][c2].getPeca().getCor() != cor)) {                                  //movimento vertical
                            //caso o método checaMovimento da peça retorne verdadeiro, a troca é possível (mas depende do parâmetro troca):
                            if (troca) {
                                if (this.tabuleiro[linhaOrigem][c1].getPeca().checaMovimento(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {
                                    this.trocaPecas(this.tabuleiro[linhaOrigem][c1], this.tabuleiro[linhaDestino][c2]);     //invocando método de troca de peças
                                    return true;
                                } else {
                                    //mensagem de erro, caso o jogador tente mover uma peça que não pertença a sua equipe:
                                    System.out.println("Movimento inválido: movimentação não respeita os padrões da peça em questão.");
                                    return false;
                                }
                            } else {
                                return this.tabuleiro[linhaOrigem][c1].getPeca().checaMovimento(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
                            }
                        } else {
                            if (troca) {
                                System.out.println("Movimento inválido: movimentação não respeita os padrões da peça em questão.");
                            }
                            return false;
                        }
                    } else {        //demais peças (Rei, Rainha, Bispo e Torre), é preciso verificar se o caminho está livre:
                        //movimento "de comer" ou "de andar":
                        if (this.tabuleiro[linhaDestino][c2].getStatus() || (!this.tabuleiro[linhaDestino][c2].getStatus() && this.tabuleiro[linhaDestino][c2].getPeca().getCor() != cor)) {
                            //percorredno o caminho do movimento, caso haja uma peça presente, o movimento não pode ocorrer (retorno é falso):
                            if (c2 - c1 == 0 && linhaDestino - linhaOrigem != 0) {          //movimento vertical
                                if (linhaOrigem > linhaDestino) {                           //movimento vertical para baixo
                                    for (int i = linhaOrigem-1; i > linhaDestino; i--) {
                                        if (!this.tabuleiro[i][c1].getStatus()) {
                                            if (troca) {
                                                System.out.println("Movimento inválido: o caminho para a movimentação está bloqueado."); 
                                            }
                                            return false;
                                        }
                                    }
                                } else {                                                    //movimento vertical para cima
                                    for (int i = linhaOrigem+1; i < linhaDestino; i++) {
                                        if (!this.tabuleiro[i][c1].getStatus()) {
                                            if (troca) {
                                                System.out.println("Movimento inválido: o caminho para a movimentação está bloqueado."); 
                                            }
                                            return false;
                                        }
                                    }
                                }
                            } else if (c2 - c1 != 0 && linhaDestino - linhaOrigem == 0) {   //movimento horizontal
                                if (c1 > c2) {                                              //movimento horizontal para a esquerda
                                    for (int i = c1-1; i > c2; i--) {
                                        if (!this.tabuleiro[linhaOrigem][i].getStatus()) {
                                            if (troca) {
                                                System.out.println("Movimento inválido: o caminho para a movimentação está bloqueado."); 
                                            }
                                            return false;
                                        }
                                    }
                                } else {                                                    //movimento horizontal para a direita
                                    for (int i = c1+1; i < c2; i++) {
                                        if (!this.tabuleiro[linhaOrigem][i].getStatus()) {
                                            if (troca) {
                                                System.out.println("Movimento inválido: o caminho para a movimentação está bloqueado."); 
                                            }
                                            return false;
                                        }
                                    }
                                }
                            } else if ((c2 - c1 == linhaDestino - linhaOrigem) || (c2 - c1 == -(linhaDestino - linhaOrigem))) {   //movimento diagonal
                                if (linhaDestino - linhaOrigem > 0) {                       //movimento diagonal para cima
                                    if (c2 - c1 > 0) {                                      //movimento diagonal para cima e para a direita
                                        for (int i = linhaOrigem+1, j = c1+1; i < linhaDestino; i++, j++) {
                                            if (!this.tabuleiro[i][j].getStatus()) {
                                                if (troca) {
                                                    System.out.println("Movimento inválido: o caminho para a movimentação está bloqueado."); 
                                                }
                                                return false;
                                            }
                                        }
                                    } else {                                                //movimento diagonal para cima e para esquerda
                                        for (int i = linhaOrigem+1, j = c1-1; i < linhaDestino; i++, j--) {
                                            if (!this.tabuleiro[i][j].getStatus()) {
                                                if (troca) {
                                                    System.out.println("Movimento inválido: o caminho para a movimentação está bloqueado."); 
                                                }
                                                return false;
                                            }
                                        }
                                    }
                                } else {                                                    //movimento diagonal para baixo
                                    if (c2 - c1 > 0) {                                      //movimento diagonal para baixo e para a direita
                                        for (int i = linhaOrigem-1, j = c1+1; i > linhaDestino; i--, j++) {
                                            if (!this.tabuleiro[i][j].getStatus()) {
                                                if (troca) {
                                                    System.out.println("Movimento inválido: o caminho para a movimentação está bloqueado."); 
                                                }
                                                return false;
                                            }
                                        }
                                    } else {                                                //movimento diagonal para baixo e para a esquerda
                                        for (int i = linhaOrigem-1, j = c1-1; i > linhaDestino; i--, j--) {
                                            if (!this.tabuleiro[i][j].getStatus()) {
                                                if (troca) {
                                                    System.out.println("Movimento inválido: o caminho para a movimentação está bloqueado."); 
                                                }
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            //caso o caminho esteja livre (não houve retorno false em nenhum dos casos anteriores):
                            //apenas verifica-se a possiblidade do movimento da peça e a possível troca de peças
                            if (troca) {
                                if (this.tabuleiro[linhaOrigem][c1].getPeca().checaMovimento(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {
                                    this.trocaPecas(this.tabuleiro[linhaOrigem][c1], this.tabuleiro[linhaDestino][c2]);     //invocando método de troca de peças
                                    return true;
                                } else {
                                    //mensagem de erro, caso o jogador tente mover uma peça que não pertença a sua equipe:
                                    System.out.println("Movimento inválido: movimentação não respeita os padrões da peça em questão.");
                                    return false;
                                }
                            } else {
                                return this.tabuleiro[linhaOrigem][c1].getPeca().checaMovimento(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
                            }
                        }          
                    }
                } else {
                    //mensagem de erro, caso o jogador tente mover uma peça que não pertença a sua equipe:
                    System.out.println("Movimento inválido: a peça desejada não faz parte da sua equipe.");
                    return false;
                }
            } else {
                //mensagem de erro, caso a posição origem do movimento esteja vazia:
                System.out.println("Movimento inválido: posição origem vazia.");
                return false;  
            } 
        }
        return false;
    }

    //método privado e interno para troca de peças, caso o movimento seja válido:
    private void trocaPecas(Posicao inicio, Posicao fim) {
        if (!fim.getStatus()) {                             //se a posição destino estiver ocupada (movimento "de comer")
            fim.getPeca().setStatus(false);                 //a peça "comida" é retirada do jogo
        }                                                   //se a posição destino estiver livre (movimento simples - "só andou")
        fim.setPeca(inicio.getPeca());                      //a peça presente na posição final passa a ser a peça que estava na posição inicial
        inicio.setStatus(true);                             //a posição inicial se torna livre (desocupada)
        inicio.setPeca(null);                               //o objeto Peca que ocupava a posição início passa a ser nulo
        fim.setStatus(false);                               //a posição final se torna ocupada (status = false)
    }

    //método público, invocado pela classe Jogo, para verificação de xeque de um determinado jogador:
    public boolean xeque(String corDoRei) {
        Posicao posicaoDoRei = this.acheORei(corDoRei);             //procura pela posição do Rei da cor passada como parâmetro
        int linhaRei = posicaoDoRei.getLinha();                     //armazenamento de sua linha
        int colunaRei = (int) (posicaoDoRei.getColuna() - 97);      //armazenamento de sua coluna (como inteiro, para que seja possível utilizá-la na matriz)

        //percorrendo todo o tabuleiro:
        for (int i = 0; i < 8; i++) {
            char aux = 'a';
            for (int j = 0; j < 8; j++) {
                //para cada posição que esteja ocupada por uma peça adversária, se tal peça puder chegar até o Rei, o jogo está em xeque:
                if (!this.tabuleiro[i][j].getStatus() && (this.tabuleiro[i][j].getPeca().getCor() != corDoRei) && this.movimentaPeca(i, aux, linhaRei, this.tabuleiro[linhaRei][colunaRei].getColuna(), this.tabuleiro[i][j].getPeca().getCor(), false)) {
                    return true;
                }
                //observação: o parâmetro "troca" foi definido como false no loop acima, para que não haja troca efetiva de peças durante a verificação de xeque
                aux++;
            }
        }
        return false;
    }

    //método privado e interno para procurar o Rei de uma determinada cor e retornar sua posição:
    private Posicao acheORei(String corDoRei) { 
        //percorrendo todo o tabuleiro:
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //para cada posição ocupada, verifica-se se ela está ocupada por um objeto da classe Rei e sua cor é a cor desejada:
                if (!this.tabuleiro[i][j].getStatus() && this.tabuleiro[i][j].getPeca() instanceof Rei && this.tabuleiro[i][j].getPeca().getCor() == corDoRei) {
                    return this.tabuleiro[i][j];                               //sua posição é retornada
                }
            }
        }
        return null;
    }

    //método invocado pela classe Jogo, para percorrer o tabuleiro e armazenar em uma String as principais informaçõesde todas as suas posições:
    public String textoArquivo() {
        String text = "";                                                                   //string, inicializada vazia
        //perccorendo cada posição do tabuleiro:
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                text += tabuleiro[i][j].getLinha() + " " + tabuleiro[i][j].getColuna();     //adicionando à string a linha e coluna da posição

                if (!tabuleiro[i][j].getStatus()) {                                         //caso a posição esteja ocupada
                    text += " " + tabuleiro[i][j].getPeca().desenho() + "\n";               //o desenho da peça também é adicionado à string (o \n servirá para escrita em linhas no arquivo, posteriormente)
                } else {
                    text += "\n";                                                           //caso a posição esteja livre, apenas o '\n' é adicionado à string
                }
            }
        }
        return text;                                                                        //a string, após percorrer todo o tabuleiro, é retornada
    }

    //método invocado pela classe Jogo para, a partir do tabuleiro carregado do arquivo, identificar as peças de cada jogador e retorná-las ao Jogo:
    public Peca[] pecasJogadoresPartidaRetomada(String corDoJogador) {
        Peca[] pecasIndividuais = new Peca[16];                                     //vetor auxiliar de Pecas, com 16 posições

        //contadores auxiliares serão criados, para que seja possível identificar quantas peças duplicadas há na partida carregada:
        int contadorTorres = 1;                                                     //contador auxiliar exclusivo para Torre
        int contadorCavalos = 1;                                                    //contador auxiliar exclusivo para Cavalo
        int contadorBispos = 1;                                                     //contador auxiliar exclusivo para Bispo
        int indicePeoes = 8;                                                        //contador auxiliar exclusivo para os peões
        //percorrendo o tabuleiro:
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //para cada posição ocupada por uma peça de mesma cor que o jogador:
                if (!tabuleiro[i][j].getStatus() && tabuleiro[i][j].getPeca() != null && tabuleiro[i][j].getPeca().getCor() == corDoJogador) {
                    //analisando o tipo de peça e atribuindo em sua respectiva posição no vetor:
                    switch(tabuleiro[i][j].getPeca().desenho().charAt(0)) {         //apenas análise do primeiro caractere do desenho é o suficiente, visto que todos são, com certeza, de cor preta
                        case 'R':
                            if (contadorTorres == 1) {                              //primeira torre encontrada
                                pecasIndividuais[4] = tabuleiro[i][j].getPeca();
                            } else {                                                //segunda torre encontrada
                                    pecasIndividuais[5] = tabuleiro[i][j].getPeca();    
                            }
                            contadorTorres++;
                            break;
    
                        case 'N':
                            if (contadorCavalos == 1) {                             //primeiro cavalo encontrado
                                pecasIndividuais[2] = tabuleiro[i][j].getPeca();    
                            } else {                                                //segundo cavalo encontrado
                                pecasIndividuais[3] = tabuleiro[i][j].getPeca();    
                            }
                            contadorCavalos++;
                            break;
                            
                        case 'B':
                            if (contadorBispos == 1) {                              //primeiro bispo encontrado
                                pecasIndividuais[0] = tabuleiro[i][j].getPeca();
                            } else {                                                //segundo bispo encontrado
                                pecasIndividuais[1] = tabuleiro[i][j].getPeca();    
                            }
                            contadorBispos++;
                            break;
    
                        case 'Q':
                            pecasIndividuais[6] = tabuleiro[i][j].getPeca();
                            break;
    
                        case 'K':
                            pecasIndividuais[7] = tabuleiro[i][j].getPeca();
                            break;
    
                        case 'P':
                            pecasIndividuais[indicePeoes] = tabuleiro[i][j].getPeca();  //embora há vários peões, todos ficam lado a lado no vetor
                            indicePeoes++;                                              //logo, é apenas preciso incrementar o índice previamente definido
                            break;
                    }
                }
            }
        }
        return pecasIndividuais;                                                        //o vetor de peças do jogador é retornado
    }
 }