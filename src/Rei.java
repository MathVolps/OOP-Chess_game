import java.lang.Math;

/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Rei extends Peca {
    public Rei(String cor) {
        super(cor);
    }
    
    //método que retorna o código/representação da peça:
    @Override
    public String desenho() {
        if (this.getCor().equals("preto")) {            //caso sua cor seja preta
            return "Kb";
        } else {                                        //caso sua cor seja branco
            return "Kw";
        }
    }
    
    //método que checa um determinado movimento de uma peça:
    @Override
    public boolean checaMovimento(int linhaOrigem, char colunaOrigem, int linhaDestino, char colunaDestino) {
        if (this.getStatus()) {                                                                         //se a peça estiver ativa
            int variacaoLinha = Math.abs(linhaDestino - linhaOrigem);                                   //calculando a variação de linha
            int variacaoColuna = Math.abs(((int)(colunaDestino - 97) - (int)(colunaOrigem - 97)));      //calculando a variação de coluna

          //lógica de movimentação:  
            if (variacaoLinha == 1) {
                if (variacaoColuna == 1 || variacaoColuna == 0) {
                    return true;
                }
            } else if (variacaoColuna == 1) {
                if (variacaoLinha == 1 || variacaoLinha == 0) {
                    return true;
                } 
            }
            //caso o movimento não seja válido:
            return false;
        }
        return false;   
    }
}
