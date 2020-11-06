public class Peao {
    private boolean status;                                 //true = ativa no jogo, false = não ativa no jogo
    private String cor;
    
    public Peao(String cor) {
        this.setCor(cor);                                   //invoca o método para atribuição da cor
        if (this.getCor() != null) {                        //caso a cor seja válida, o retorno de getCor não será nulo, então o status da peça deve ser true
            this.setStatus(true);
        } else {
            this.setStatus(false);                          //caso contrário, ou seja, cor incorreta, o status da peça é false - isso evita problemas ao tentar movimentá-la
        }
    }
    
    //método que retorna o código/representação da peça:
    public String desenho() {
        if (this.getStatus()) {                             //primeiramente, a peça deve estar ativa no jogo
            if (this.getCor().equals("preto")) {            //caso sua cor seja preta
                return "Pp";
            } else {                                        //caso sua cor seja branco
                return "Pb";
            }
        } else {                                            //se não estiver ativa, uma mensagem é impressa na tela
            System.out.println("Erro, esta peça não está ativa no jogo.");
            return "";
        }
    }
    
    //método que checa um determinado movimento de uma peça:
    public boolean checaMovimento(int linhaOrigem, char colunaOrigem, int linhaDestino, char colunaDestino) {
        if (this.getStatus()) {                                                                         //se a peça estiver ativa
            //Math.abs não é usado nesse caso, pois o sinal da variação é importante para o peão
            int variacaoLinha = (linhaDestino - linhaOrigem);                                           //calculando a variação de linha
            int variacaoColuna = (((int)(colunaDestino - 96) - (int)(colunaOrigem - 96)));              //calculando a variação de coluna
            if (this.getCor().equals("preto")) {                                                        //se a peça for preta
                if (linhaOrigem == 7) {                                                                 //posição original preta, pode mover 2 casas
                    if (variacaoColuna == 0 && (variacaoLinha == -1 || variacaoLinha == -2)) {          //movimento incial
                        return true;
                    } else {                                                                            //movimento inválido
                        System.out.println("Erro, este movimento não é válido.");
                        return false;
                    }                 
                } else { 
                    if (variacaoColuna == 0 && variacaoLinha == -1) {                                   //movimento comum, apenas uma casa
                        return true;
                    } else if (variacaoLinha == -1 && (variacaoColuna == 1 || variacaoColuna == -1)) {  //movimento de "comer"
                        return true;
                    } else {                                                                            //qualquer outro movimento comum e inválido
                        System.out.println("Erro, este movimento não é válido.");
                        return false;
                    }                        
                } 
            } else {                                                                                    //se a peça for branca
                if (linhaOrigem == 2) {                                                                 //posição original branca, pode mover 2 casas
                    if (variacaoColuna == 0 && (variacaoLinha == 1 || variacaoLinha == 2)) {            //movimento inicial
                        return true;
                    } else {                                                                            //movimento inválido
                        System.out.println("Erro, este movimento não é válido.");
                        return false;
                    }  
                } else { 
                    if (variacaoColuna == 0 && variacaoLinha == 1) {                                    //movimento comum, apenas uma casa
                        return true;
                    } else if (variacaoLinha == 1 && (variacaoColuna == 1 || variacaoColuna == -1)) {   //movimento de "comer"
                        return true;
                    } else {                                                                            //qualquer outro movimento comum e inválido
                        System.out.println("Erro, este movimento não é válido.");
                        return false;
                    }   
                }
            }                   
        } else {                                                                                        //caso a peça não esteja ativa no jogo
            System.out.println("Erro, esta peça não está ativa no jogo.");
            return false;
        }        
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCor() {
        return this.cor;
    }

    private void setCor(String cor) {
        if (cor.equals("preto") || cor.equals("branco")) {
            this.cor = cor;
        } else {
            System.out.println("Erro, esta cor não existe no jogo.");
        } 
    }

}