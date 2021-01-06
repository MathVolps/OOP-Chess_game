import java.lang.Math;

/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Torre extends Peca {    
    public Torre(String cor) {
        super(cor);
    }
    
    //método que retorna o código representação da peça:
    @Override
    public String desenho() {
        if (this.getCor().equals("preto")) {            //caso sua cor seja preta
            return "Rb";
        } else {                                        //caso sua cor seja branco
            return "Rw";
        }
    }
    
    //método que checa um determinado movimento de uma peça:
    @Override
    public boolean checaMovimento(int linhaOrigem, char colunaOrigem, int linhaDestino, char colunaDestino) {
        if (this.getStatus()) {                                                                     //se a peça estiver ativa
            int variacaoLinha = Math.abs(linhaDestino - linhaOrigem);                               //calculando a variação de linha
            int variacaoColuna = Math.abs(((int)(colunaDestino - 97) - (int)(colunaOrigem - 97)));  //calculando a variação de coluna

            if (variacaoLinha == 0 ^ variacaoColuna == 0) {                                         //lógica de movimentação, uso de operador XOR
                return true;            
            }
            return false;        
        }   
        return false; 
    }
}
