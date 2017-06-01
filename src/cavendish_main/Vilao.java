package cavendish_main;

import java.util.Random;

/**
 *
 * @author User
 */
public class Vilao {
    //atributos do vilão
    int idVilao, num; 
    int qntVilao = 2; //♣ QUANTIDADE DE VILÕES CADASTRADOS
    String sexo, cabelo, caracteristica, acessorio, evidencia, nome, dossie, textoPergaminho;
    Random aleatorio = new Random();
    String[] vetPistas = new String[10];
    int qntCidadesVilao = 3; 
    int idCidade;
    Cidade vetCidades [] = new Cidade [qntCidadesVilao];
    
   
    boolean capturado = false; // ♥ variável booleana para indicar se o jogador capturou esse vilão ou não
  
    
    Vilao(){ 
        num = 0+aleatorio.nextInt(qntVilao);
        idCidade = 0+aleatorio.nextInt(3);
        
        for (int i = 0; i < 3; i++){
            vetCidades[i] = new Cidade(idCidade);
        }
        for (int i = 1; i < 3; i++){
            while (vetCidades[i] == vetCidades[i-1]){
                vetCidades[i] = new Cidade(idCidade);   
            }
        }
            
        switch (num){
            
            case 0:
                idVilao = 0;
                nome = "William Kidd";
                sexo = "m";
                cabelo = "preto";
                caracteristica = "cicatriz";
                acessorio = "brinco de moeda de ouro";
                evidencia = "pegada";
                dossie = "";
                textoPergaminho = "  \n  texto William Kidd ";
                vetPistas [0]="PISTA VILAO - ";
                vetPistas [1]="PISTA VILAO - ";
                vetPistas [2]="PISTA VILAO - ";
                vetPistas [3]="PISTA VILAO - ";
                vetPistas [4]="PISTA VILAO - ";
            break;
            
            case 1:
                idVilao = 1;
                nome = "Anne Dieu-Le-Veut";
                sexo = "f";
                cabelo = "colorido";
                caracteristica = "tapa-olho";
                acessorio = "corrente de caveira";
                evidencia = "impressão digital";
                dossie = "";
                textoPergaminho = "  \n  texto Anne Dieu-Le-Veut ";
                vetPistas [0] = "PISTA VILAO - \" \" ";
                vetPistas [1] = "PISTA VILAO - \" \" ";
                vetPistas [2] = "PISTA VILAO - \" \" ";
                vetPistas [3] = "PISTA VILAO - \" \" ";
                vetPistas [4] = "PISTA VILAO - \" \" ";
            break;         
        }
           
        


    }   
    

    
    public String getPista (){ //ARU - FUNÇÃO PARA RETORNAR UMA PISTA ALEÁTORIA
         int i = aleatorio.nextInt(4);
         return vetPistas [i];
        }
    
    
    
}
    
    