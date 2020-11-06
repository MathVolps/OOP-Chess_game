public class Teste {
    public static void main(String[] args) {
        /* ****** TESTANDO AS CLASSES INDIVIDUALMENTE ******
         * em todos os casos, serã instanciados objetos referentes àquela classe,
         * e serão testados seus atributos e métdoso (desenho() e checaMovimento())
        */

        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO A CLASSE CAVALO:");
        //instanciando objetos:
        Cavalo c1 = new Cavalo("preto");
        Cavalo c2 = new Cavalo("branco");
        Cavalo c3 = new Cavalo("verde");                    //instanciando um objeto de cor incorreta. O objeto é criado, mas sua cor não é atribuída

        //imprimindo os desenhos das peças corretamente criadas:
        System.out.println(c1.desenho());                   //Cp = cavalo preto
        System.out.println(c2.desenho());                   //Cb = cavalo branco

        //verificando os atributos do objeto criado incorretamente:
        System.out.println(c3.getCor());
        System.out.println(c3.getStatus());

        System.out.println("");

        
        //checando movimentos válidos do cavalo preto:
        System.out.println("Movimentos válidos do cavalo preto:");
        System.out.println(c1.checaMovimento(4, 'd', 2, 'e'));  //movimento correto, inferior para direita
        System.out.println(c1.checaMovimento(4, 'd', 2, 'c'));  //movimento correto, inferior para esquerda
        System.out.println(c1.checaMovimento(4, 'd', 6, 'e'));  //movimento correto, superior para direita
        System.out.println(c1.checaMovimento(4, 'd', 6, 'c'));  //movimento correto, superior para esquerda
        System.out.println(c1.checaMovimento(4, 'd', 5, 'f'));  //movimento correto, lateral para direita
        System.out.println(c1.checaMovimento(4, 'd', 3, 'f'));  //movimento correto, lateral para direita
        System.out.println(c1.checaMovimento(4, 'd', 5, 'b'));  //movimento correto, lateral para esquerda
        System.out.println(c1.checaMovimento(4, 'd', 3, 'b'));  //movimento correto, lateral para esquerda

        System.out.println("");

        //checando movimentos válidos do cavalo branco:
        System.out.println("Movimentos válidos do cavalo branco:");
        System.out.println(c2.checaMovimento(4, 'd', 2, 'e'));  //movimento correto, inferior para direita
        System.out.println(c2.checaMovimento(4, 'd', 2, 'c'));  //movimento correto, inferior para esquerda
        System.out.println(c2.checaMovimento(4, 'd', 6, 'e'));  //movimento correto, superior para direita
        System.out.println(c2.checaMovimento(4, 'd', 6, 'c'));  //movimento correto, superior para esquerda
        System.out.println(c2.checaMovimento(4, 'd', 5, 'f'));  //movimento correto, lateral para direita
        System.out.println(c2.checaMovimento(4, 'd', 3, 'f'));  //movimento correto, lateral para direita
        System.out.println(c2.checaMovimento(4, 'd', 5, 'b'));  //movimento correto, lateral para esquerda
        System.out.println(c2.checaMovimento(4, 'd', 3, 'b'));  //movimento correto, lateral para esquerda
        
        System.out.println("");
        
        //checando movimentos inválidos do cavalo preto:
        System.out.println("Movimentos inválidos do cavalo preto:");
        System.out.println(c1.checaMovimento(4, 'd', 5, 'g'));  //movimento errado, 3 casas para o lado (o correto são 2)
        System.out.println(c1.checaMovimento(4, 'd', 3, 'e'));  //movimento errado, diagonal
        System.out.println(c1.checaMovimento(6, 'e', 6, 'e'));  //movimento errado, não saiu do lugar
        System.out.println(c1.checaMovimento(5, 'c', 3, 'c'));  //movimento errado, em linha reta

        System.out.println("");

        //checando movimentos inválidos do cavalo branco:
        System.out.println("Movimentos inválidos do cavalo branco:");
        System.out.println(c2.checaMovimento(4, 'd', 5, 'g'));  //movimento errado, 3 casas para o lado (o correto são 2)
        System.out.println(c2.checaMovimento(4, 'd', 3, 'e'));  //movimento errado, diagonal
        System.out.println(c2.checaMovimento(6, 'e', 6, 'e'));  //movimento errado, não saiu do lugar
        System.out.println(c2.checaMovimento(5, 'c', 3, 'c'));  //movimento errado, em linha reta

        System.out.println("");

        //testando movimentos, válidos e inválidos, do objeto criado incorretamente:
        System.out.println("Movimentos válidos e inválidos da peça de cor incorreta:");
        System.out.println(c3.checaMovimento(4, 'd', 2, 'e'));  //movimento correto, inferior para direita
        System.out.println(c3.checaMovimento(4, 'd', 2, 'c'));  //movimento correto, inferior para esquerda
        System.out.println(c3.checaMovimento(4, 'd', 5, 'g'));  //movimento errado, 3 casas para o lado (o correto são 2)
        System.out.println(c3.checaMovimento(4, 'd', 3, 'e'));  //movimento errado, diagonal
        
        System.out.println("------------------------------------------------------");


        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO A CLASSE BISPO:");
        //instanciando objetos:
        Bispo b1 = new Bispo("preto");
        Bispo b2 = new Bispo("branco");
        Bispo b3 = new Bispo("amarelo");                    //instanciando um objeto de cor incorreta. O objeto é criado, mas sua cor não é atribuída

        //imprimindo os desenhos das peças corretamente criadas:
        System.out.println(b1.desenho());                   //Bp = bispo preto
        System.out.println(b2.desenho());                   //Bb = bispo branco

        //verificando os atributos do objeto criado incorretamente:
        System.out.println(b3.getCor());
        System.out.println(b3.getStatus());

        System.out.println("");
        
        //checando movimentos válidos do bispo preto:
        System.out.println("Movimentos válidos do bispo preto:");
        System.out.println(b1.checaMovimento(4, 'd', 5, 'e'));  //movimento correto, diagonal superior direita (1 casa)
        System.out.println(b1.checaMovimento(4, 'd', 5, 'c'));  //movimento correto, diagonal superior esquerda (1 casa)
        System.out.println(b1.checaMovimento(4, 'd', 3, 'e'));  //movimento correto, diagonal inferior direita (1 casa)
        System.out.println(b1.checaMovimento(4, 'd', 3, 'c'));  //movimento correto, diagonal inferior esquerda (1 casa)
        System.out.println(b1.checaMovimento(4, 'd', 6, 'b'));  //movimento correto, diagonal superior esquerda (2 casas)
        System.out.println(b1.checaMovimento(4, 'd', 6, 'f'));  //movimento correto, diagonal superior direita (2 casas)
        System.out.println(b1.checaMovimento(4, 'd', 2, 'b'));  //movimento correto, diagonal inferior esquerda (2 casas)
        System.out.println(b1.checaMovimento(4, 'd', 2, 'f'));  //movimento correto, diagonal inferior direita (2 casas)
        System.out.println(b1.checaMovimento(4, 'd', 7, 'a'));  //movimento correto, diagonal superior esquerda (3 casas)
        System.out.println(b1.checaMovimento(4, 'd', 7, 'g'));  //movimento correto, diagonal superior direita (3 casas)
        System.out.println(b1.checaMovimento(4, 'd', 1, 'a'));  //movimento correto, diagonal inferior esquerda (3 casas)
        System.out.println(b1.checaMovimento(4, 'd', 1, 'g'));  //movimento correto, diagonal inferior direita (3 casas)

        System.out.println("");

        //checando movimentos válidos do bispo branco:
        System.out.println("Movimentos válidos do bispo branco:");
        System.out.println(b2.checaMovimento(4, 'd', 5, 'e'));  //movimento correto, diagonal superior direita (1 casa)
        System.out.println(b2.checaMovimento(4, 'd', 5, 'c'));  //movimento correto, diagonal superior esquerda (1 casa)
        System.out.println(b2.checaMovimento(4, 'd', 3, 'e'));  //movimento correto, diagonal inferior direita (1 casa)
        System.out.println(b2.checaMovimento(4, 'd', 3, 'c'));  //movimento correto, diagonal inferior esquerda (1 casa)
        System.out.println(b2.checaMovimento(4, 'd', 6, 'b'));  //movimento correto, diagonal superior esquerda (2 casas)
        System.out.println(b2.checaMovimento(4, 'd', 6, 'f'));  //movimento correto, diagonal superior direita (2 casas)
        System.out.println(b2.checaMovimento(4, 'd', 2, 'b'));  //movimento correto, diagonal inferior esquerda (2 casas)
        System.out.println(b2.checaMovimento(4, 'd', 2, 'f'));  //movimento correto, diagonal inferior direita (2 casas)
        System.out.println(b2.checaMovimento(4, 'd', 7, 'a'));  //movimento correto, diagonal superior esquerda (3 casas)
        System.out.println(b2.checaMovimento(4, 'd', 7, 'g'));  //movimento correto, diagonal superior direita (3 casas)
        System.out.println(b2.checaMovimento(4, 'd', 1, 'a'));  //movimento correto, diagonal inferior esquerda (3 casas)
        System.out.println(b2.checaMovimento(4, 'd', 1, 'g'));  //movimento correto, diagonal inferior direita (3 casas)

        System.out.println("");
        
        //checando movimentos inválidos do bispo preto:
        System.out.println("Movimentos inválidos do bispo preto:");
        System.out.println(b1.checaMovimento(4, 'd', 5, 'f'));      //movimento errado, não está na diagonal
        System.out.println(b1.checaMovimento(4, 'd', 6, 'd'));      //movimento errado, não está na diagonal
        System.out.println(b1.checaMovimento(4, 'd', 4, 'd'));      //movimento errado, não saiu do lugar

        System.out.println("");

        //checando movimentos inválidos do bispo branco:
        System.out.println("Movimentos inválidos do bispo branco:");
        System.out.println(b2.checaMovimento(4, 'd', 5, 'h'));      //movimento errado, não está na diagonal
        System.out.println(b2.checaMovimento(4, 'd', 1, 'd'));      //movimento errado, não está na diagonal
        System.out.println(b2.checaMovimento(4, 'd', 4, 'd'));      //movimento errado, não saiu do lugar

        System.out.println("");

        //testando movimentos, válidos e inválidos, do objeto criado incorretamente:
        System.out.println("Movimentos válidos e inválidos da peça de cor incorreta:");
        System.out.println(b3.checaMovimento(4, 'd', 5, 'e'));  //movimento correto, diagonal superior direita (1 casa)
        System.out.println(b3.checaMovimento(4, 'd', 5, 'c'));  //movimento correto, diagonal superior esquerda (1 casa)
        System.out.println(b3.checaMovimento(4, 'd', 5, 'h'));  //movimento errado, não está na diagonal
        System.out.println(b3.checaMovimento(4, 'd', 1, 'd'));  //movimento errado, não está na diagonal

        System.out.println("------------------------------------------------------");

        
        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO A CLASSE PEAO:");
        //instanciando os objetos:
        Peao p1 = new Peao("preto");
        Peao p2 = new Peao("branco");
        Peao p3 = new Peao("laranja");                      //instanciando um objeto de cor incorreta. O objeto é criado, mas sua cor não é atribuída

        //imprimindo os desenhos das peças corretamente criadas:
        System.out.println(p1.desenho());                   //Pp = peao preto
        System.out.println(p2.desenho());                   //Pb = peao branco

        //verificando os atributos do objeto criado incorretamente:
        System.out.println(p3.getCor());
        System.out.println(p3.getStatus());

        System.out.println("");
        
        
        //checando movimentos válidos do peão preto:
        System.out.println("Movimentos válidos do peão preto:");
        System.out.println(p1.checaMovimento(7, 'a', 5, 'a'));    //movimento incial, pode mover até duas casas
        System.out.println(p1.checaMovimento(6, 'b', 5, 'b'));    //movimento correto
        System.out.println(p1.checaMovimento(5, 'c', 4, 'd'));    //movimento de "comer"

        System.out.println("");

        //checando movimentos válidos do peão branco:
        System.out.println("Movimentos válidos do peão branco:");
        System.out.println(p2.checaMovimento(2, 'a', 3, 'a'));    //movimento incial, pode mover até duas casas
        System.out.println(p2.checaMovimento(6, 'b', 7, 'b'));    //movimento comum
        System.out.println(p2.checaMovimento(5, 'c', 6, 'd'));    //movimento de "comer"  

        System.out.println("");
        
        //checando movimentos inválidos do peão preto:
        System.out.println("Movimentos inválidos do peão preto:");
        System.out.println(p1.checaMovimento(7, 'c', 7, 'c'));    //movimento errado, não sai do lugar
        System.out.println(p1.checaMovimento(4, 'f', 5, 'f'));    //movimento errado, não pode ir para trás
        System.out.println(p1.checaMovimento(3, 'e', 3, 'd'));    //movimento errado, não pode ir para o lado
        System.out.println(p1.checaMovimento(2, 'e', 3, 'f'));    //movimento errado, não pode ir para a diagonal
        
        System.out.println("");
    
        //checando movimentos inválidos do peão branco:
        System.out.println("Movimentos inválidos do peão branco:");
        System.out.println(p2.checaMovimento(4, 'c', 4, 'c'));    //movimento errado, não sai do lugar
        System.out.println(p2.checaMovimento(4, 'f', 3, 'f'));    //movimento errado, não pode ir para trás
        System.out.println(p2.checaMovimento(3, 'e', 3, 'd'));    //movimento errado, não pode ir para o lado
        System.out.println(p1.checaMovimento(2, 'b', 3, 'a'));    //movimento errado, não pode ir para a diagonal

        System.out.println("");

        //testando movimentos, válidos e inválidos, do objeto criado incorretamente:
        System.out.println("Movimentos válidos e inválidos da peça de cor incorreta:");
        System.out.println(p3.checaMovimento(6, 'b', 7, 'b'));    //movimento comum
        System.out.println(p3.checaMovimento(5, 'c', 6, 'd'));    //movimento de "comer"
        System.out.println(p3.checaMovimento(3, 'e', 3, 'd'));    //movimento errado, não pode ir para o lado
        System.out.println(p3.checaMovimento(2, 'b', 3, 'a'));    //movimento errado, não pode ir para a diagonal

        System.out.println("------------------------------------------------------");
        
        
        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO A CLASSE TORRE:");
        //instanciando os objetos:
        Torre t1 = new Torre("preto");
        Torre t2 = new Torre("branco");
        Torre t3 = new Torre("rosa");                       //instanciando um objeto de cor incorreta. O objeto é criado, mas sua cor não é atribuída

        //imprimindo os desenhos das peças corretamente criadas:
        System.out.println(t1.desenho());                   //Tp = torre preta
        System.out.println(t2.desenho());                   //Tb = torre branca

        //verificando os atributos do objeto criado incorretamente:
        System.out.println(t3.getCor());
        System.out.println(t3.getStatus());

        System.out.println("");

        
        //checando movimentos válidos da torre preta:
        System.out.println("Movimentos válidos da torre preta:");
        System.out.println(t1.checaMovimento(5, 'a', 3, 'a'));  //movimento comum, para frente (2 casas)
        System.out.println(t1.checaMovimento(7, 'a', 8, 'a'));  //movimento comum, para trás (1 casa)
        System.out.println(t1.checaMovimento(6, 'd', 6, 'h'));  //movimento comum, para o lado (3 casa)
        System.out.println(t1.checaMovimento(5, 'd', 5, 'a'));  //movimento comum, para o lado (3 casas)

        System.out.println("");

        //checando movimentos válidos da torre branca:
        System.out.println("Movimentos válidos da torre branca:");
        System.out.println(t2.checaMovimento(2, 'a', 6, 'a'));  //movimento comum, para frente (4 casas)
        System.out.println(t2.checaMovimento(4, 'g', 1, 'g'));  //movimento comum, para trás (3 casas)
        System.out.println(t2.checaMovimento(3, 'b', 3, 'h'));  //movimento comum, para o lado (6 casas)
        System.out.println(t2.checaMovimento(2, 'e', 2, 'd'));  //movimento comum, para o lado (1 casa)

        System.out.println("");

        //checando movimentos inválidos da torre preta:
        System.out.println("Movimentos inválidos da torre preta:");
        System.out.println(t1.checaMovimento(7, 'd', 6, 'e'));  //movimento errado, na diagonal
        System.out.println(t1.checaMovimento(5, 'd', 6, 'c'));  //movimento errado, na diagonal
        System.out.println(t1.checaMovimento(2, 'g', 2, 'g'));  //movimento errado, não saiu do lugar    
        
        System.out.println("");

        //checando movimentos inválidos da torre branca:
        System.out.println("Movimentos inválidos da torre branca:");
        System.out.println(t2.checaMovimento(5, 'd', 4, 'e'));  //movimento errado, na diagonal
        System.out.println(t2.checaMovimento(3, 'g', 5, 'e'));  //movimento errado, na diagonal
        System.out.println(t2.checaMovimento(1, 'f', 1, 'f'));  //movimento errado, não saiu do lugar

        System.out.println("");

        //testando movimentos, válidos e inválidos, do objeto criado incorretamente:
        System.out.println("Movimentos válidos e inválidos da peça de cor incorreta:");
        System.out.println(t3.checaMovimento(2, 'a', 6, 'a'));  //movimento comum, para frente (4 casas)
        System.out.println(t3.checaMovimento(4, 'g', 1, 'g'));  //movimento comum, para trás (3 casas)
        System.out.println(t3.checaMovimento(5, 'd', 4, 'e'));  //movimento errado, na diagonal
        System.out.println(t3.checaMovimento(3, 'g', 5, 'e'));  //movimento errado, na diagonal

        System.out.println("------------------------------------------------------");

        
        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO A CLASSE RAINHA:");
        //instanciando os objetos
        Rainha ra1 = new Rainha("preto");
        Rainha ra2 = new Rainha("branco");
        Rainha ra3 = new Rainha("roxo");                         //instanciando um objeto de cor incorreta. O objeto é criado, mas sua cor não é atribuída

        //imprimindo os desenhos das peças corretamente criadas:
        System.out.println(ra1.desenho());                       //RAp = rainha preta
        System.out.println(ra2.desenho());                       //RAb = rainha branca

        //verificando os atributos do objeto criado incorretamente:
        System.out.println(ra3.getCor());
        System.out.println(ra3.getStatus());

        System.out.println("");

        //checando movimentos válidos da rainha preta (obs: é a união dos movimentos da torre e do bispo):
        System.out.println("Movimentos válidos da rainha preta:");
        System.out.println(ra1.checaMovimento(4, 'd', 5, 'e'));  //movimento comum, diagonal superior da direita (1 casa)
        System.out.println(ra1.checaMovimento(4, 'd', 5, 'c'));  //movimento comum, diagonal superior da esquerda (1 casa)
        System.out.println(ra1.checaMovimento(4, 'd', 3, 'e'));  //movimento comum, diagonal inferior da direita (1 casa)
        System.out.println(ra1.checaMovimento(4, 'd', 3, 'c'));  //movimento comum, diagonal inferior da esquerda (1 casa)
        System.out.println(ra1.checaMovimento(4, 'd', 6, 'b'));  //movimento comum, diagonal superior da esquerda (2 casas)
        System.out.println(ra1.checaMovimento(4, 'd', 6, 'f'));  //movimento comum, diagonal superior da direita (2 casas)
        System.out.println(ra1.checaMovimento(4, 'd', 2, 'b'));  //movimento comum, diagonal inferior da esquerda (2 casas)
        System.out.println(ra1.checaMovimento(4, 'd', 2, 'f'));  //movimento comum, diagonal inferior da direita (2 casas)
        System.out.println(ra1.checaMovimento(4, 'd', 7, 'a'));  //movimento comum, diagonal superior da esquerda (3 casas)
        System.out.println(ra1.checaMovimento(4, 'd', 7, 'g'));  //movimento comum, diagonal superior da direita (3 casas)
        System.out.println(ra1.checaMovimento(4, 'd', 1, 'a'));  //movimento comum, diagonal inferior da esquerda (3 casas)
        System.out.println(ra1.checaMovimento(4, 'd', 1, 'g'));  //movimento comum, diagonal inferior da direita (3 casas)
        System.out.println(ra1.checaMovimento(5, 'a', 3, 'a'));  //movimento comum, para frente (2 casas)
        System.out.println(ra1.checaMovimento(7, 'a', 8, 'a'));  //movimento comum, para trás (1 casa)
        System.out.println(ra1.checaMovimento(6, 'd', 6, 'h'));  //movimento comum, para o lado (3 casa)
        System.out.println(ra1.checaMovimento(5, 'd', 5, 'a'));  //movimento comum, para o lado (3 casas)

        System.out.println("");

        //checando movimentos válidos da rainha branca (obs: é a união dos movimentos da torre e do bispo):
        System.out.println("Movimentos válidos da rainha branca:");
        System.out.println(ra2.checaMovimento(4, 'd', 5, 'e'));  //movimento comum, diagonal superior da direita (1 casa)
        System.out.println(ra2.checaMovimento(4, 'd', 5, 'c'));  //movimento comum, diagonal superior da esquerda (1 casa)
        System.out.println(ra2.checaMovimento(4, 'd', 3, 'e'));  //movimento comum, diagonal inferior da direita (1 casa)
        System.out.println(ra2.checaMovimento(4, 'd', 3, 'c'));  //movimento comum, diagonal inferior da esquerda (1 casa)
        System.out.println(ra2.checaMovimento(4, 'd', 6, 'b'));  //movimento comum, diagonal superior da esquerda (2 casas)
        System.out.println(ra2.checaMovimento(4, 'd', 6, 'f'));  //movimento comum, diagonal superior da direita (2 casas)
        System.out.println(ra2.checaMovimento(4, 'd', 2, 'b'));  //movimento comum, diagonal inferior da esquerda (2 casas)
        System.out.println(ra2.checaMovimento(4, 'd', 2, 'f'));  //movimento comum, diagonal inferior da direita (2 casas)
        System.out.println(ra2.checaMovimento(4, 'd', 7, 'a'));  //movimento comum, diagonal superior da esquerda (3 casas)
        System.out.println(ra2.checaMovimento(4, 'd', 7, 'g'));  //movimento comum, diagonal superior da direita (3 casas)
        System.out.println(ra2.checaMovimento(4, 'd', 1, 'a'));  //movimento comum, diagonal inferior da esquerda (3 casas)
        System.out.println(ra2.checaMovimento(4, 'd', 1, 'g'));  //movimento comum, diagonal inferior da direita (3 casas)
        System.out.println(ra2.checaMovimento(2, 'a', 6, 'a'));  //movimento comum, para frente (4 casas)
        System.out.println(ra2.checaMovimento(4, 'g', 1, 'g'));  //movimento comum, para trás (3 casas)
        System.out.println(ra2.checaMovimento(3, 'b', 3, 'h'));  //movimento comum, para o lado (6 casas)
        System.out.println(ra2.checaMovimento(2, 'e', 2, 'd'));  //movimento comum, para o lado (1 casa)

        System.out.println("");

        //checando movimentos inválidos da rainha preta:
        System.out.println("Movimentos inválidos da rainha preta:");
        System.out.println(ra1.checaMovimento(2, 'g', 2, 'g'));  //movimento errado, não saiu do lugar
        System.out.println(ra1.checaMovimento(4, 'd', 5, 'f'));  //movimento errado, não está na diagonal, nem eixos

        System.out.println("");

        //checando movimentos inválidos da rainha branca:
        System.out.println("Movimentos inválidos da rainha branca:");
        System.out.println(ra2.checaMovimento(4, 'a', 4, 'a'));  //movimento errado, não saiu do lugar
        System.out.println(ra2.checaMovimento(1, 'd', 3, 'e'));  //movimento errado, não está na diagonal, nem eixos

        System.out.println("");

        //testando movimentos, válidos e inválidos, do objeto criado incorretamente:
        System.out.println("Movimentos válidos e inválidos da peça de cor incorreta:");
        System.out.println(ra3.checaMovimento(4, 'g', 1, 'g'));  //movimento comum, para trás (3 casas)
        System.out.println(ra3.checaMovimento(3, 'b', 3, 'h'));  //movimento comum, para o lado (6 casas)
        System.out.println(ra3.checaMovimento(4, 'a', 4, 'a'));  //movimento errado, não saiu do lugar
        System.out.println(ra3.checaMovimento(1, 'd', 3, 'e'));  //movimento errado, não está na diagonal, nem eixos

        System.out.println("------------------------------------------------------");

        
        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO A CLASSE REI:");
        //instanciando os objetos:
        Rei re1 = new Rei("preto");
        Rei re2 = new Rei("branco");
        Rei re3 = new Rei("cinza");                             //instanciando um objeto de cor incorreta. O objeto é criado, mas sua cor não é atribuída

        //imprimindo os desenhos das peças corretamente criadas:
        System.out.println(re1.desenho());                      //REp = rei preto
        System.out.println(re2.desenho());                      //REb = rei branco

        //verificando os atributos do objeto criado incorretamente:
        System.out.println(re3.getCor());
        System.out.println(re3.getStatus());

        System.out.println("");

        //checando movimentos válidos do rei preto:
        System.out.println("Movimentos válidos do rei preto:");
        System.out.println(re1.checaMovimento(3, 'f', 3, 'g')); //movimento comum, para direita
        System.out.println(re1.checaMovimento(2, 'b', 1, 'a')); //movimento comum, para esquerda
        System.out.println(re1.checaMovimento(3, 'f', 4, 'f')); //movimento comum, para cima
        System.out.println(re1.checaMovimento(3, 'c', 2, 'c')); //movimento comum, para baixo
        System.out.println(re1.checaMovimento(5, 'g', 6, 'h')); //movimento comum, para diagonal superior direita
        System.out.println(re1.checaMovimento(4, 'f', 5, 'e')); //movimento comum, para diagonal superior esquerda
        System.out.println(re1.checaMovimento(7, 'f', 6, 'g')); //movimento comum, para diagonal inferior direita
        System.out.println(re1.checaMovimento(6, 'c', 5, 'd')); //movimento comum, para diagonal inferior esquerda

        System.out.println("");

        //checando movimentos válidos do rei branco:
        System.out.println("Movimentos válidos do rei branco:");
        System.out.println(re2.checaMovimento(3, 'f', 3, 'g')); //movimento comum, para direita
        System.out.println(re2.checaMovimento(2, 'b', 1, 'a')); //movimento comum, para esquerda
        System.out.println(re2.checaMovimento(3, 'f', 4, 'f')); //movimento comum, para cima
        System.out.println(re2.checaMovimento(3, 'c', 2, 'c')); //movimento comum, para baixo
        System.out.println(re2.checaMovimento(5, 'g', 6, 'h')); //movimento comum, para diagonal superior direita
        System.out.println(re2.checaMovimento(4, 'f', 5, 'e')); //movimento comum, para diagonal superior esquerda
        System.out.println(re2.checaMovimento(7, 'f', 6, 'g')); //movimento comum, para diagonal inferior direita
        System.out.println(re2.checaMovimento(6, 'c', 5, 'd')); //movimento comum, para diagonal inferior esquerda

        System.out.println("");

        //checando movimentos inválidos do rei preto:
        System.out.println("Movimentos inválidos do rei preto:");
        System.out.println(re1.checaMovimento(3, 'f', 3, 'h')); //movimento errado, para direita (2 casas)
        System.out.println(re1.checaMovimento(3, 'f', 3, 'c')); //movimento errado, para esquerda (3 casas)
        System.out.println(re1.checaMovimento(3, 'f', 7, 'f')); //movimento errado, para cima (4 casas)
        System.out.println(re1.checaMovimento(3, 'f', 1, 'f')); //movimento errado, para baixo (2 casas)
        System.out.println(re1.checaMovimento(3, 'f', 5, 'h')); //movimento errado, para diagonal superior deireita (2 casas)
        System.out.println(re1.checaMovimento(3, 'f', 6, 'c')); //movimento errado, para diagonal superior esquerda (3 casas)
        System.out.println(re1.checaMovimento(3, 'f', 1, 'h')); //movimento errado, para diagonal inferior deireita (2 casas)
        System.out.println(re1.checaMovimento(3, 'f', 1, 'd')); //movimento errado, para diagonal inferior esquerda (2 casas)

        System.out.println("");

        //checando movimentos inválidos do rei branco:
        System.out.println("Movimentos inválidos do rei branco:");
        System.out.println(re2.checaMovimento(3, 'f', 3, 'h')); //movimento errado, para direita (2 casas)
        System.out.println(re2.checaMovimento(3, 'f', 3, 'c')); //movimento errado, para esquerda (3 casas)
        System.out.println(re2.checaMovimento(3, 'f', 7, 'f')); //movimento errado, para cima (4 casas)
        System.out.println(re2.checaMovimento(3, 'f', 1, 'f')); //movimento errado, para baixo (2 casas)
        System.out.println(re2.checaMovimento(3, 'f', 5, 'h')); //movimento errado, para diagonal superior deireita (2 casas)
        System.out.println(re2.checaMovimento(3, 'f', 6, 'c')); //movimento errado, para diagonal superior esquerda (3 casas)
        System.out.println(re2.checaMovimento(3, 'f', 1, 'h')); //movimento errado, para diagonal inferior deireita (2 casas)
        System.out.println(re2.checaMovimento(3, 'f', 1, 'd')); //movimento errado, para diagonal inferior esquerda (2 casas)

        System.out.println("");

        //testando movimentos, válidos e inválidos, do objeto criado incorretamente:
        System.out.println("Movimentos válidos e inválidos da peça de cor incorreta:");
        System.out.println(re3.checaMovimento(3, 'f', 3, 'g')); //movimento comum, para direita
        System.out.println(re3.checaMovimento(2, 'b', 1, 'a')); //movimento comum, para esquerda
        System.out.println(re3.checaMovimento(3, 'f', 7, 'f')); //movimento errado, para cima (4 casas)
        System.out.println(re3.checaMovimento(3, 'f', 1, 'f')); //movimento errado, para baixo (2 casas)
        
        System.out.println("------------------------------------------------------");


        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO A CLASSE POSICAO:");
        //instanciando um objeto válido:
        Posicao pos1 = new Posicao(1, 'c');     //posição branca
        Posicao pos2 = new Posicao(6, 'e');     //posição preta

        System.out.println("");

        //testando getLinha e getColuna:
        System.out.println("Linha e coluna de pos1: " + pos1.getLinha() + ", " + pos1.getColuna());
        System.out.println("Linha e coluna de pos2: " + pos2.getLinha() + ", " + pos2.getColuna());

        System.out.println("");

        //testando getStatus e getCor:
        System.out.println("Status e cor de pos1: " + pos1.getStatus() + ", " + pos1.getCor());
        System.out.println("Status e cor de pos2: " + pos2.getStatus() + ", " + pos2.getCor());

        System.out.println("");

        //instanciando um objeto inválido:
        Posicao pos3 = new Posicao(9, 'A');     //instanciando um objeto inválido. O objeto é criado, mas sua linha é setada como 0, cor null, status false e coluna vazia

        //tentando acessar atributos do onjeto criado incorretamente:
        System.out.println(pos3.getColuna());
        System.out.println(pos3.getLinha());
        System.out.println(pos3.getCor());
        System.out.println(pos3.getStatus());

        System.out.println("------------------------------------------------------");
        

        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO A CLASSE TABULEIRO:");
        //instanciando o objeto:
        Tabuleiro tab1 = new Tabuleiro();
        //imprimino o tabuleiro:
        tab1.imprimeTabuleiro();
        //*obs: por enquanto, como a classe Peca não foi implementada, o conteúdo impresso por esta função se limita à linha, coluna e cor da posição,
        //e não o código (desenho()) da peça ali existente.

        System.out.println("");
        
        //lembre-se que pos1 = (1, 'c') e pos2 = (6, 'e')
        System.out.println(tab1.limitesTabuleiro(pos1, pos2));  //posições válida

        Posicao pos4 = new Posicao(-1, 'j');
        Posicao pos5 = new Posicao(5, 't');
        System.out.println(tab1.limitesTabuleiro(pos4, pos5));        

        System.out.println("------------------------------------------------------");

        
        System.out.println("------------------------------------------------------");
        System.out.println("TESTANDO A CLASSE JOGO:");
        //instanciando o objeto:
        Jogo j1 = new Jogo();

        //testando os atributos iniciais do objeto j1:
        System.out.println("Situação do jogo: " + j1.getSituacao());
        System.out.println("Jogador da vez: " + j1.getJogada());
        
        //imprimindo a configuração atual do tabuleiro:
        j1.tabuleiroAtual();
        //*obs: novamente, como ainda não é possível atribuir às posições do tabuleiro suas respectivas peças, a impressão mostra as linhas, colunas e
        //cor de cada posição

        System.out.println("------------------------------------------------------");
    }
}