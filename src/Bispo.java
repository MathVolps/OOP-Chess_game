import java.lang.Math;

/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */

public class Bispo extends Peca {                                  
    public Bispo(String cor) {
        super(cor);
    }
    
    //método que retorna o código/representação da peça:
    @Override
    public String desenho() {
        if (this.getCor().equals("preto")) {            //caso sua cor seja preta
            return "Bb";
        } else {                                        //caso sua cor seja branco
            return "Bw";
        }
    }
    
    //método que checa um determinado movimento de uma peça:
    @Override
    public boolean checaMovimento(int linhaOrigem, char colunaOrigem, int linhaDestino, char colunaDestino) {
        if (this.getStatus()) {                                                                         //se a peça estiver ativa
            int variacaoLinha = Math.abs(linhaDestino - linhaOrigem);                                   //calculando a variação de linha
            int variacaoColuna = Math.abs(((int)(colunaDestino - 97) - (int)(colunaOrigem - 97)));      //calculando a variação de coluna
            if (((variacaoLinha != 0 || variacaoColuna != 0) && variacaoLinha == variacaoColuna)) {     //lógica de movimento do bispo
                return true;                                                                            //o movimento só é válido se a posição final não é a mesma e se estiver na diagonal
            } else {                                                                                    
                return false;
            }                 
        } 
        return false;     
    }
}
