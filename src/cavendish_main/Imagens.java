package cavendish_main;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Baguy
 */
public class Imagens extends InicialGUI{

    // ♥ criar label para usar de parâmetro
    JLabel label = new JLabel();
    
    
    // ♥ os parâmetros são o endereço da imagem e o nome da jlabel para onde vai a imagem
    public void trocar(String endereco, JLabel label){
        
        ImageIcon icone = new ImageIcon();
        icone.setImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(endereco)));
        label.setIcon(icone);
        
        System.out.println("classe Imagem :" +icone);


    }
 
    }
