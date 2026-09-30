package engine.mobile;

import engine.map.Case;

/**
 * Classe abstraite de base pour tous les éléments pouvant être placés sur la grille.
 * <p>
 * Un élément possède un identifiant unique auto-incrémenté à la création,
 * ainsi qu'une position sur la grille représentée par une {@link Case}.
 * </p>
 * <p>
 * Les classes concrètes qui héritent de {@code Element} sont :
 * {@link Souris}, {@link Obstacle} et {@link Nourriture}.
 * </p>
 *
 * @author SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma
 * @version 5.1
 * @see Souris
 * @see Obstacle
 * @see Nourriture
 */
public abstract class Element {

    /** Compteur statique partagé par tous les éléments pour générer des IDs uniques. */
    private static int compteur = 0;

    /** Identifiant unique de cet élément, assigné automatiquement à la création. */
    protected int id;

    /** Position actuelle de cet élément sur la grille. */
    protected Case position;

    /**
     * Construit un élément à la position donnée et lui assigne un ID unique.
     *
     * @param position la case initiale de l'élément sur la grille
     */
    public Element(Case position) {
        this.id       = ++compteur;
        this.position = position;
    }

    /**
     * Retourne l'identifiant unique de cet élément.
     *
     * @return identifiant numérique unique
     */
    public int getId() {
        return id;
    }

    /**
     * Retourne la position actuelle de cet élément sur la grille.
     *
     * @return la case occupée par l'élément
     */
    public Case getPosition() {
        return position;
    }

    /**
     * Déplace cet élément vers la case spécifiée.
     *
     * @param position la nouvelle case de l'élément
     */
    public void setPosition(Case position) {
        this.position = position;
    }
}
