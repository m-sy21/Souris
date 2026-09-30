package engine.process;

import config.Configuration;
import engine.map.Grille;

/**
 * Fabrique responsable de la construction des objets principaux de la simulation.
 * <p>
 * {@code GameBuilder} est une classe utilitaire (méthodes statiques uniquement)
 * qui centralise la création de la grille et du moteur de simulation.
 * Elle est appelée une seule fois au démarrage par {@code MainGUI}.
 * </p>
 *
 * @author SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma
 * @version 5.1
 * @see Grille
 * @see Environnement
 */
public class GameBuilder {

    /**
     * Construit et retourne la grille de jeu aux dimensions définies
     * dans {@link Configuration} ({@code LINE_COUNT × COLUMN_COUNT}).
     *
     * @return une nouvelle grille prête à l'emploi
     */
    public static Grille buildMap() {
        return new Grille(Configuration.LINE_COUNT, Configuration.COLUMN_COUNT);
    }

    /**
     * Construit et retourne le moteur de simulation ({@link Environnement})
     * initialisé avec la grille donnée.
     * <p>
     * Les souris, obstacles et sources de nourriture sont placés aléatoirement
     * sur la grille lors de cette initialisation.
     * </p>
     *
     * @param map la grille sur laquelle la simulation s'exécute
     * @return le moteur de simulation initialisé
     */
    public static MobileInterface buildInitMobile(Grille map) {
        return new Environnement(map);
    }
}
