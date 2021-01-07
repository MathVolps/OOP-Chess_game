/**
 * 
 * @autor: Matheus Vargas Volpon Berto
 */
public class Peao extends Peca {    
    public Peao(String cor) {
        super(cor);
    }
    
    //método que retorna o código/representação da peça:
    @Override
    public String desenho() {
        if (this.getCor().equals("preto")) {            //caso sua cor seja preta
            return "Pb";
        } else {                                        //caso sua cor seja branco
            return "Pw";
        }
    }
    
    //método que checa um determinado movimento de uma peça:
    @Override
    public boolean checaMovimento(int linhaOrigem, char colunaOrigem, int linhaDestino, char colunaDestino) {
        if (this.getStatus()) {                                                                         //se a peça estiver ativa
            //Math.abs não é usado nesse caso, pois o sinal da variação é importante para o peão
            int variacaoLinha = (linhaDestino - linhaOrigem);                                           //calculando a variação de linha
            int variacaoColuna = (((int)(colunaDestino - 97) - (int)(colunaOrigem - 97)));              //calculando a variação de coluna
            if (this.getCor().equals("preto")) {                                                        //se a peça for preta
                if (linhaOrigem == 6) {                                                                 //posição original preta, pode mover 2 casas
                    if (variacaoColuna == 0 && (variacaoLinha == -1 || variacaoLinha == -2)) {          //movimento incial
                        return true;
                    } else if ((variacaoColuna == 1 || variacaoColuna == -1) && variacaoLinha == -1) {
                        return true;
                    } else {                                                                            //movimento inválido
                        return false;
                    }                 
                } else { 
                    if (variacaoColuna == 0 && variacaoLinha == -1) {                                   //movimento comum, apenas uma casa
                        return true;
                    } else if (variacaoLinha == -1 && (variacaoColuna == 1 || variacaoColuna == -1)) {  //movimento de "comer"
                        return true;
                    } else {                                                                            //qualquer outro movimento comum e inválido
                        return false;
                    } 
                }                       
            } else {                                                                                    //se a peça for branca
                if (linhaOrigem == 1) {                                                                 //posição original branca, pode mover 2 casas
                    if (variacaoColuna == 0 && (variacaoLinha == 1 || variacaoLinha == 2)) {            //movimento inicial
                        return true;
                    } else if ((variacaoColuna == 1 || variacaoColuna == -1) && variacaoLinha == 1) {
                        return true;
                    } else {                                                                            //movimento inválido
                        return false;
                    }  
                } else { 
                    if (variacaoColuna == 0 && variacaoLinha == 1) {                                    //movimento comum, apenas uma casa
                        return true;
                    } else if (variacaoLinha == 1 && (variacaoColuna == 1 || variacaoColuna == -1)) {   //movimento de "comer"
                        return true;
                    } else {                                                                            //qualquer outro movimento comum e inválido
                        return false;
                    }   
                }
            }                   
        } 
        return false;        
    }
}