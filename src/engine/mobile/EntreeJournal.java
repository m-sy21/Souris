package engine.mobile;

/**
 * Représente une entrée individuelle dans le journal intime d'une souris.
 * <p>
 * Chaque entrée associe un message textuel (rédigé à la première personne)
 * au numéro du tour de simulation auquel il a été écrit. L'ensemble des
 * entrées forme le journal de vie de la souris, consultable en cliquant
 * sur elle dans l'interface graphique.
 * </p>
 *
 * @author SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma
 * @version 5.1
 * @see Journal
 * @see Souris
 */
public class EntreeJournal {

    /** Numéro du tour de simulation auquel cette entrée a été créée. */
    private int temps;

    /** Texte de l'entrée, rédigé à la première personne. */
    private String contenu;

    /**
     * Crée une nouvelle entrée de journal.
     *
     * @param temps   numéro du tour de simulation
     * @param contenu texte de l'entrée (ex : "J'ai mangé (+25 énergie).")
     */
    public EntreeJournal(int temps, String contenu) {
        this.temps   = temps;
        this.contenu = contenu;
    }

    /**
     * Retourne le numéro du tour auquel cette entrée a été écrite.
     *
     * @return numéro de tour
     */
    public int getTemps() { return temps; }

    /**
     * Retourne le contenu textuel de cette entrée.
     *
     * @return texte de l'entrée
     */
    public String getContenu() { return contenu; }

    /**
     * Modifie le contenu de cette entrée.
     *
     * @param nouveauTexte nouveau texte à associer à cette entrée
     */
    public void modifierContenu(String nouveauTexte) { this.contenu = nouveauTexte; }

    /**
     * Retourne une représentation lisible de l'entrée.
     *
     * @return chaîne de la forme {@code "[t=N] contenu"}
     */
    @Override
    public String toString() {
        return "[t=" + temps + "] " + contenu;
    }
}
