package engine.mobile;

/**
 * Énumère les couleurs de pelage (robe) possibles d'une souris.
 * <p>
 * La couleur est attribuée aléatoirement à la création des souris initiales
 * et est héritée lors d'une reproduction selon la règle suivante :
 * 45% de chance d'hériter la couleur du parent 1, 45% du parent 2,
 * et 10% de mutation vers une couleur aléatoire.
 * </p>
 * <p>
 * La couleur détermine le sprite graphique utilisé pour représenter
 * la souris sur la grille, combinée avec son sexe et sa direction
 * de déplacement. Elle n'a aucun effet sur le comportement logique.
 * </p>
 *
 * @author SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma
 * @version 5.1
 * @see Souris
 */
public enum CouleurRobe {

    /** Pelage gris — couleur par défaut, souris mâle sombre, femelle avec oreilles roses. */
    GRIS,

    /** Pelage blanc crème — teinte claire pour les deux sexes. */
    BLANC,

    /** Pelage marron — teinte chaude pour les deux sexes. */
    MARRON
}
