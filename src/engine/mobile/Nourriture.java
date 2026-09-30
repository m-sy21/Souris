package engine.mobile;

import engine.map.Case;

/**
 * Représente une source de nourriture placée sur la grille.
 * <p>
 * La nourriture est un élément passif : une souris qui se déplace sur
 * sa case la consomme automatiquement, gagne de l'énergie, et la source
 * est supprimée de la simulation par {@code Environnement}.
 * </p>
 * <p>
 * La case d'une source de nourriture consommée est mémorisée dans la
 * {@link Memoire} de la souris comme case connue, et peut ensuite
 * être partagée avec d'autres souris lors d'une interaction D → R.
 * </p>
 *
 * @author SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma
 * @version 5.1
 * @see Element
 * @see Memoire
 */
public class Nourriture extends Element {

    /** Type de cette nourriture (FROMAGE par défaut). */
    private TypeNourriture type;

    /** Valeur énergétique selon le type. */
    private int valeurEnergie;

    /** Crée une nourriture de type FROMAGE (25 pts) par défaut. */
    public Nourriture(Case position) {
        super(position);
        this.type          = TypeNourriture.FROMAGE;
        this.valeurEnergie = this.type.getValeurEnergie();
    }

    /** Crée une nourriture du type spécifié. */
    public Nourriture(Case position, TypeNourriture type) {
        super(position);
        this.type          = type;
        this.valeurEnergie = type.getValeurEnergie();
    }

    /** Retourne le type de cette nourriture. */
    public TypeNourriture getType() { return type; }

    /**
     * Retourne la valeur énergétique apportée par cette source de nourriture.
     *
     * @return points d'énergie gagnés par la souris qui consomme cette nourriture
     */
    public int getValeurEnergie() {
        return valeurEnergie;
    }

    /**
     * Marque cette source comme consommée.
     * La suppression réelle de la grille est effectuée par {@code Environnement}.
     */
    public void consommer() {
        // Suppression gérée par Environnement.nextRound()
    }
}
