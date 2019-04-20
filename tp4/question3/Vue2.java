package question3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.util.Observable;
import java.util.Observer;

/**
 * Décrivez votre classe Controleur ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
 public class Vue2 extends JPanel implements Observer { 
   
  private JSlider jauge; 
  private PileModele<Integer> pile; 

  public Vue2(PileModele<Integer> pile) { 
    super(); 
    this.pile = pile; 
    this.jauge = new JSlider(JSlider.HORIZONTAL, 0, pile.capacite(), 0); 
    this.jauge.setValue(0); 
    setLayout(new FlowLayout(FlowLayout.CENTER)); 
    this.jauge.setEnabled(false); 
    add(this.jauge); 
    setBackground(Color.magenta); 
    pile.addObserver(this); 
  } 

  public void update(Observable obs, Object arg) { 
    jauge.setValue(pile.taille()); 
  } 

}