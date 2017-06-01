package cavendish_main;

import java.util.Random;

/**
 *
 * @author Aruan
 */
public class Local {
    int visitas=0; // VARIÁVEL PARA CONTAR QUANTOS LOCAIS JÁ PERCORREU, NO...
                   // ...TERCEIRO LOCAL DÁ UM GET NA PISTA GEOGRÁFICA DA PRÓXIMA CIDADE
    
    int idLocal;
    String fundo, nome, descricao, testemunha, testemunhaNome;
    
    String[] vetMaisImagens=new String[10];
    Random aleatorio = new Random();
    
    //ARU - CONSTRUTOR DA CLASSE, RECEBE A CIDADE E CRIA UM OBJETO REFERENTE A UM LOCAL ALEATÓRIO
    Local (int idCidade){
        switch (idCidade){
            case 0:
                this.ubatuba();
            break;
            case 1:
                this.ilhabela();
            break;
            case 2:
                this.caraguatatuba();
            break;
        }        
    }    
    
    private void ubatuba(){
        int qntLocal = 3; //ARU - QUANTIDADE DE LOCAIS INSERIDOS
        int num = 1+ aleatorio.nextInt(qntLocal); // criar randomico
        switch (num){
            case 1:
                idLocal = 1;
                nome = "Pico do Corvovado";
                fundo = "fundos/ubatuba-pico do corcovado.png";
                descricao = " \n  Localizado a 1.181m de altitude, é acessado por uma trilha íngreme de \n "
                + "aproximadamente 8 km e é considerado um dos mais imponentes da região.";
                testemunha = "testemunhas/turista1.png";
                testemunhaNome = "  Turista";
            break;
            
            case 2:
                idLocal = 2;
                nome = "Ilha das Couves";
                fundo = "fundos/ubatuba-ilha das couves.png";
                descricao = " \n  As águas claras e quentes da Ilha das Couves também oferecem ótimas condições \n"
                            + "para nadar, fazer passeios de barco e nos últimos anos se tornou um paraíso para os praticantes do mergulho.";
                testemunha = "testemunhas/pescador.png";
                testemunhaNome = "  Pescador";
            break;
            
            case 3:
                idLocal = 3;
                nome = "Projeto Tamar";
                fundo = "fundos/ubatuba-projeto tamar.png";
                descricao = " \n  Criado em 1980, o projeto foi pioneiro na conservação e pesquisa \n"
                             + "de tartaruga marinha, animal ameaçado de extinção.";
                testemunha = "testemunhas/biologo.png";
                testemunhaNome = "  Biólogo";
            break;
        }
            
    }
    
    private void caraguatatuba(){
        int qntLocal = 3; //ARU - QUANTIDADE DE LOCAIS INSERIDOS
        int num = 1 + aleatorio.nextInt(qntLocal); // criar randomico
        switch (num){
            case 1:
                idLocal = 1;
                nome = "Pedra do Jacaré";
                fundo = "fundos/caraguatatuba-pedra jacare.png";
                descricao = " \n  Localizada na Prainha, a pedra assemelha-se a \n"
            + "uma boca de jacaré. Cuidado ao saltar, pois a água \n"
            + " não é muito funda.";
                testemunha = "testemunhas/surfista.png";
                testemunhaNome = "  Surfista";
            break;
            
            case 2:
                idLocal = 2;
                nome = "Academia ao ar livre";
                fundo = "fundos/caraguatatuba-academia.png.png";
                descricao = " \n  Espalhadas em variados pontos na cidade, \n"
            + "as academias gratuitas promovem o bem estar da população.";
                testemunha = "testemunhas/personal treiner.png";
                testemunhaNome = "Personal trainer";
            break;
            
            case 3:
                idLocal = 3;
                nome = "Morro do Santo Antônio";
                fundo = "fundos/caraguatatuba-morro santo antonio.png";
                descricao = "";
                testemunha = "testemunhas/turista.png";
                testemunhaNome = "  Turista";
            break;
        }
       
    }
    
    private void ilhabela(){
        int qntLocal = 3; //ARU - QUANTIDADE DE LOCAIS INSERIDOS
        int num = 1 + aleatorio.nextInt(qntLocal); // criar randomico
        switch (num){
            case 1:
                idLocal = 1;
                nome = "Praia Castelhanos";
                fundo = "fundos/ilhabela-castelhanos.png";
                descricao = " \n  Considerada uma das praias mais belas do Brasil, \n"
            + "o acesso principal é por uma estrada de 22km que corta a Ilha no sentido \n"
            + "Oeste a Leste, por meio da exuberante flora da Mata Atlântica do \n"
            + "Parque Estadual de Ilhabela\n";
                testemunha = "testemunhas/pescador.png";
                testemunhaNome = "  Pescador";
            break;
            
            case 2:
                idLocal = 2;
                nome = "Museu Náutico";
                fundo = "fundos/ilhabela-museu nautico.png";
                descricao = " \n   O  setor de naufrágios do Museu, conta com um valioso acervo de objetos \n"
            + "(cristais, porcelanas, faianças, talheres de prata, artefatos de bronze, etc..), \n"
            + "datados do séc. XVIII até meados deste século.\n"
            + "";
                testemunha = "testemunhas/turista.png";
                testemunhaNome = "  Turista";
            break;
            
            case 3:
                idLocal = 3;
                nome = "Cachoeira do Gato";
                fundo = "fundos/ilhabela-cachoeira gato.png";
                descricao = " \n    Com 40 metros de altura, a Cachoeira do Gato é a estrela da trilha \n"
            + "que leva o seu nome. O percurso da trilha é de quatro quilômetros e leva \n"
            + "aproximadamente uma hora e 30 minutos para ser todo percorrido.\n";
                testemunha = "testemunhas/personal trainer.png";
                testemunhaNome = "  Personal trainer";
            break;
        }        
    }
}
