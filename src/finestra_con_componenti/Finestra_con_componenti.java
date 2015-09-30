/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finestra_con_componenti;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Lorenzo
 */
public class Finestra_con_componenti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame finestra = new JFrame("Finestra con componenti");
        JPanel pannello = new JPanel();
        //pannello.setLayout(new BorderLayout()); 
        
        
        JLabel etichetta = new JLabel("Etichetta");
        
        
        JButton bottoneVuoto = new JButton();
        JButton bottone = new JButton("Bottone");
        
        
        JTextField rigaVuota = new JTextField(30);
        
        
        JTextField rigaNome = new JTextField("immetti il nome");
        JTextArea areaDimensionata = new JTextArea("Dimensionata con 5 righe e 20 colonne",5,20);
        JTextArea areaDimensionataNomi = new JTextArea(5,20);
        
        
        JCheckBox checkBoxVuota = new JCheckBox();
        JCheckBox checkBoxTesto = new JCheckBox("Testo");
        JCheckBox checkBoxTesto1 = new JCheckBox("Testo attivato");
        
        
        ButtonGroup lingue = new ButtonGroup();
        JRadioButton francese = new JRadioButton("Lingua francese");
        JRadioButton inglese = new JRadioButton("Lingua inglese");
        lingue.add(francese);
        lingue.add(inglese);
        ButtonGroup sesso = new ButtonGroup();
        JRadioButton maschio = new JRadioButton("M");
        JRadioButton femmina = new JRadioButton("F");
        sesso.add(maschio);
        sesso.add(femmina);
        
        pannello.add(etichetta);
        pannello.add(bottoneVuoto);
        pannello.add(bottone);
        pannello.add(rigaVuota);
        pannello.add(rigaNome);
        
        pannello.add(areaDimensionata);
        pannello.add(areaDimensionataNomi);
        pannello.add(checkBoxVuota);
        pannello.add(checkBoxTesto);
        pannello.add(checkBoxTesto1);
        pannello.add(inglese);
        pannello.add(francese);
        pannello.add(maschio);
        pannello.add(femmina);
        
        pannello.setBackground(Color.gray);
        
        
        finestra.add(pannello);
        finestra.setSize(800, 800);
        finestra.setVisible(true);
        
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
