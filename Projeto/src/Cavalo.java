import java.lang.Math;

public class Cavalo {
    private boolean status;                                 //true = ativa no jogo, false = não ativa no jogo
    private String cor;
    
    public Cavalo(String cor) {
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
                return "Cp";
            } else {                                        //caso sua cor seja branco
                return "Cb";
            }
        } else {                                            //se não estiver ativa, uma mensagem é impressa na tela
            System.out.println("Erro, esta peça não está ativa no jogo.");
            return "";
        }
    }
    
    //método que checa um determinado movimento de uma peça:
    public boolean checaMovimento(int linhaOrigem, char colunaOrigem, int linhaDestino, char colunaDestino) {
        if (this.getStatus()) {                                                                         // se a peça estiver ativa
            int variacaoLinha = Math.abs(linhaDestino - linhaOrigem);                                   //calculando a variação de linha
            int variacaoColuna = Math.abs(((int)(colunaDestino - 96) - (int)(colunaOrigem - 96)));      //calculando a variação de coluna
            //lógica da movimentação do cavalo:
            if (variacaoLinha == 1) {
                if (variacaoColuna == 2) {
                    return true;
                } else {
                    System.out.println("Erro, este movimento não é válido");
                    return false;
                }
            } else if (variacaoColuna == 1) {
                if (variacaoLinha == 2) {
                    return true;
                } else {
                    System.out.println("Erro, este movimento não é válido");
                    return false;
                }
            } else {                                                                                   //caso inválido, uma mensagem de erro é impressa na tela
                System.out.println("Erro, este movimento não é válido");
                return false;
            }
        } else {                                                                                         //caso a peça não esteja ativa, uma mensagem de erro é impressa na tela
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
