import java.lang.Math;

/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Cavalo extends Peca {    
    public Cavalo(String cor) {
        super(cor);
    }
    
    //método que retorna o código/representação da peça:

    public String desenho() {
        if (this.getCor().equals("preto")) {            //caso sua cor seja preta
            return "Nb";
        } else {                                        //caso sua cor seja branco
            return "Nw";
        }
    }
    
    //método que checa um determinado movimento de uma peça:
    public boolean checaMovimento(int linhaOrigem, char colunaOrigem, int linhaDestino, char colunaDestino) {
        if (this.getStatus()) {                                                                         // se a peça estiver ativa
            int variacaoLinha = Math.abs(linhaDestino - linhaOrigem);                                   //calculando a variação de linha
            int variacaoColuna = Math.abs(((int)(colunaDestino - 97) - (int)(colunaOrigem - 97)));      //calculando a variação de coluna
            //lógica da movimentação do cavalo:
            if (variacaoLinha == 1) {
                if (variacaoColuna == 2) {
                    return true;
                } else {
                    return false;
                }
            } else if (variacaoColuna == 1) {
                if (variacaoLinha == 2) {
                    return true;
                } else {
                    return false;
                }
            } else {                                                                                   
                return false;
            }
        } 
        return false;   
    }
}
