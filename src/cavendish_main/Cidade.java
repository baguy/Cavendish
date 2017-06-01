package cavendish_main;

import java.util.Random;

/**
 *
 * @author Aruan
 */
public class Cidade {
    //ARU - PONTEIRO DA LISTA
    Cidade prox = null; 
    Cidade ant = null;
    
    //ARU - OBJETO ALEATÓRIO CRIADO DA CLASSE "LOCAL.01"
    Local local1 = null;
    Local local2 = null;
    Local local3 = null;
    
    int idCidade;
    String nomeCidade,cidadeDescricao, fundo;
     Local local = new Local(0);
    
    //ARU - VETOR DE PISTAS
    String[] vetPistas = new String[10];
    Random aleatorio = new Random();
    
    Cidade (int num){
        switch (num){
            case 0: //ARU - CONTRUTOR UBATUBA
                ubatuba();
                break;
                
            case 1: //ARU - CONSTRUTOR ILHABELA
                ilhabela();
                break;
                
                
            case 2: //ARU - CONSTRUTOR CARAGUATATUBA
                caraguatatuba();
                break;  
        }
    }
    Cidade (){//♣ CONTRUTOR VAZIO PARA CRIAR O TEMP
        
    }

        
    private void ubatuba (){
        idCidade = 0;
        nomeCidade = "Ubatuba";
        cidadeDescricao = " \n  Ubatuba é um município brasileiro localizado "
                        + "no litoral norte do estado de \n São Paulo.";
        fundo = "fundos/ubatuba.png";
        
        //ARU - PISTAS GEOGRÁFICAS REFERENTES A CIDADE
        vetPistas [0]="PISTA GEOGRAFICA 1 - UBA";
        vetPistas [1]="PISTA GEOGRAFICA 2 - UBA";
        vetPistas [2]="PISTA GEOGRAFICA 3 - UBA";
        vetPistas [3]="PISTA GEOGRAFICA 4 - UBA";
        vetPistas [4]="PISTA GEOGRAFICA 5 - UBA";
        
        carregarLocal(); //ARU -  SETANDO LOCAIS ALEATÓRIOS AO OBJETO
    }    
        
    private void ilhabela () {
        idCidade = 1;
        nomeCidade = "Ilhabela";
        cidadeDescricao = " \n   É um dos únicos municípios–arquipélagos marinhos brasileiros. \n"
            + "A cidade é a capital do Iatismo. ";
        fundo = "fundos/ilhabela.png";
        
        //ARU - PISTAS GEOGRÁFICAS REFERENTES A CIDADE
        vetPistas [0]="PISTA GEOGRAFICA 1 - ILHA";
        vetPistas [1]="PISTA GEOGRAFICA 2 - ILHA";
        vetPistas [2]="PISTA GEOGRAFICA 3 - ILHA";
        vetPistas [3]="PISTA GEOGRAFICA 4 - ILHA";
        vetPistas [4]="PISTA GEOGRAFICA 5 - ILHA";
        
        carregarLocal(); //ARU -  SETANDO LOCAIS ALEATÓRIOS AO OBJETO        
    }
    
    private void caraguatatuba (){
        idCidade = 2;
        nomeCidade = "Caraguatatuba";
        cidadeDescricao = " \n   Texto Caraguatatuba. ";
        fundo = "fundos/caraguatatuba.png";
        
        //ARU - PISTAS GEOGRÁFICAS REFERENTES A CIDADE
        vetPistas [0]="PISTA GEOGRAFICA 1 - CARAGUA";
        vetPistas [1]="PISTA GEOGRAFICA 2 - CARAGUA";
        vetPistas [2]="PISTA GEOGRAFICA 3 - CARAGUA";
        vetPistas [3]="PISTA GEOGRAFICA 4 - CARAGUA";
        vetPistas [4]="PISTA GEOGRAFICA 5 - CARAGUA";
        
        carregarLocal(); //ARU -  SETANDO LOCAIS ALEATÓRIOS AO OBJETO
    }

    private void carregarLocal(){//ARU -  CRIAÇÃO DE OBJETO (CLASSE LOCAL) ALEATORIO)
        local1 = new Local (idCidade);
        local2 = new Local (idCidade);
        while (local2.idLocal==local1.idLocal){
            local2 = new Local (idCidade);
        }   
        local3 = new Local (idCidade);
        while (local3.idLocal==local1.idLocal || local3.idLocal==local2.idLocal){
            local3 = new Local (idCidade);            
        }
    }
    
    public String getPista (){ //ARU - FUNÇÃO PARA RETORNAR UMA PISTA ALEÁTORIA PARA A CLASSE LOCAL
        int i = aleatorio.nextInt(4);
        return vetPistas[i];
    }
    
    
    
}
