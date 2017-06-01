package cavendish_main;

import java.util.Random;



/**
 *
 * @author Aruan
 */
public class Fase {
    int cidades;
    Vilao listaFases[];
    Random aleatorio = new Random();
    int qntVilao = 2; //♣ INFORMAR QUANTIDADES DE VILAO INSERIDOS NA CLASSE
    
    int num = 1;
    
    Fase(){
        listaFases = new Vilao [qntVilao];
        num = 0 + aleatorio.nextInt(qntVilao-1);

        for (int i = 0 ; i < qntVilao ; i++){
        //    if (i==0)       //SE FOR A PRIMEIRA FASE:
        //        cidades = 3;//INSIRA 3 CIDADES NO VETOR
        //    if (i==1)       //SE FOR A PRIMEIRA FASE:
        //        cidades = 4;//INSIRA 3 CIDADES NO VETOR
                
            listaFases[i]= new Vilao ();
        }
        //for (int i = 1 ; i < qntVilao ; i++){
        //        if (listaFases[i] == listaFases[i-1]);
        //            listaFases[i] = new Vilao (cidades);
        //}   
        
        
    }   
}

    

