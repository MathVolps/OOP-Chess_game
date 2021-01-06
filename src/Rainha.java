import java.lang.Math;

/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Rainha extends Peca {    
    public Rainha(String cor) {
        super(cor);
    }
    
    //método que retorna o código/representação da peça:
    @Override
    public String desenho() {
        if (this.getCor().equals("preto")) {            //caso sua cor seja preta
            return "Qb";
        } else {                                        //caso sua cor seja branco
            return "Qw";
        }
    }
    
    //método que checa um determinado movimento de uma peça:
    @Override
    public boolean checaMovimento(int linhaOrigem, char colunaOrigem, int linhaDestino, char colunaDestino) {
        if (this.getStatus()) {                                                                     // se a peça estiver ativa
            int variacaoLinha = Math.abs(linhaDestino - linhaOrigem);                               //calculando a variação de linha
            int variacaoColuna = Math.abs(((int)(colunaDestino - 97) - (int)(colunaOrigem - 97)));  //calculando a variação de coluna
            //lógica abaixo: posição destino diferente da inicial e combinação de lógicas da torre e bispo
            if (((variacaoLinha != 0 || variacaoColuna != 0) && variacaoLinha == variacaoColuna) || (variacaoLinha == 0 ^ variacaoColuna == 0)) {
                return true;
            } else {                                                                                //movimento inválido
                return false;
            }     
        } 
        return false;   
    }
}
