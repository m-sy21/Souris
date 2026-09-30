package engine.process;

import java.util.List;
import engine.mobile.Nourriture;
import engine.mobile.Obstacle;
import engine.mobile.Souris;

/**
 * Interface définissant le contrat du moteur de simulation.
 * <p>
 * {@code MobileInterface} est implémentée par {@link Environnement}
 * et expose toutes les opérations nécessaires à l'interface graphique
 * ({@code MainGUI}, {@code GameDisplay}) pour piloter la simulation :
 * avancer d'un tour, accéder aux éléments, ajouter des entités,
 * réinitialiser.
 * </p>
 * <p>
 * Cette interface permet de découpler la logique de simulation
 * de la couche graphique, facilitant les évolutions futures.
 * </p>
 *
 * @author SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma
 * @version 5.1
 * @see Environnement
 */
public interface MobileInterface {

    /**
     * Avance la simulation d'un tour.
     * <p>
     * À chaque tour, les opérations suivantes sont effectuées dans l'ordre :
     * vieillissement, gestion de la faim, déplacement avec attraction,
     * consommation de nourriture, gestion des interactions sociales
     * et reproductives, suppression des souris mortes.
     * </p>
     */
    void nextRound();

    /**
     * Retourne la liste de toutes les souris vivantes dans la simulation.
     *
     * @return liste des souris actives
     */
    List<Souris> getMice();

    /**
     * Retourne la liste de tous les obstacles présents sur la grille.
     *
     * @return liste des obstacles
     */
    List<Obstacle> getObstacles();

    /**
     * Retourne la liste de toutes les sources de nourriture présentes.
     *
     * @return liste des sources de nourriture
     */
    List<Nourriture> getFoods();

    /**
     * Retourne le numéro du tour courant de la simulation.
     *
     * @return numéro de tour (commence à 0, incrémenté à chaque {@link #nextRound()})
     */
    int getTime();

    /**
     * Retourne le nombre de souris actuellement vivantes.
     *
     * @return nombre de souris
     */
    int getMouseCount();

    /**
     * Retourne le nombre de sources de nourriture restantes.
     *
     * @return nombre de sources de nourriture
     */
    int getFoodCount();

    /**
     * Retourne le nombre d'obstacles présents sur la grille.
     *
     * @return nombre d'obstacles
     */
    int getObstacleCount();

    /**
     * Ajoute une souris avec des paramètres aléatoires sur une case libre.
     */
    void addMouse();

    /**
     * Ajoute une source de nourriture sur une case libre aléatoire.
     */
    void addFood();

    /**
     * Ajoute un obstacle sur une case libre aléatoire.
     */
    void addObstacle();

    /**
     * Réinitialise complètement la simulation :
     * supprime tous les éléments, remet le temps à zéro et
     * replace les entités initiales.
     */
    void reset();
}

    // NOTE: getStats() est accessible via cast vers Environnement
