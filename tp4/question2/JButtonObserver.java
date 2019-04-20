package question2;

//import java.awt.event. // Ã  complÃ©ter
//import java.awt.event. // Ã  complÃ©ter
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * DÃ©crivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un numÃ©ro de version ou une date)
 */
public class JButtonObserver implements ActionListener{ // à compléter

    private String nom;
    private TextArea contenu;

    /**
     * Constructeur d'objets de classe JButtonObserver
     * 
     * @param nom
     *            le nom du bouton, jbo1, jbo2, jbo3, jmo1, jmo2, jmo3
     * @param contenu
     *            la zone de texte de l'applette
     */
    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    /**
     * affichage d'un message dans la zone de texte ce message est de la forme
     * observateur this.nom : clic du bouton nom_du_bouton exemple : observateur
     * jbo1 : clic du bouton A, voir la méthode getActionCommand()
     * 
     * @param à
     *            compléter
     */
    public void actionPerformed(ActionEvent event) {
        String message = "observateur "+this.nom+" : clic du bouton "+event.getActionCommand();
        contenu.append(message + "\n");
    }

}

