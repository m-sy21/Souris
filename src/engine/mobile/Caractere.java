package engine.mobile;

/**
 * Énumère les caractères (personnalités) possibles d'une souris.
 * <p>
 * Le caractère est attribué aléatoirement à la création et peut être
 * hérité partiellement des parents lors d'une reproduction (45% parent 1,
 * 45% parent 2, 10% mutation aléatoire).
 * </p>
 * <p>
 * Il influence deux comportements principaux :
 * </p>
 * <ul>
 *   <li><strong>Fiabilité de l'information partagée</strong> (rôle DONNEUR) :
 *       un {@code SINCERE} ou {@code SOCIABLE} dit toujours la vérité ;
 *       un {@code EGOISTE} ment 70% du temps ;
 *       un {@code MECHANTE} ment toujours.</li>
 *   <li><strong>Probabilité d'accepter un partage</strong> (rôle RECEVEUR) :
 *       un {@code SINCERE} est le plus réceptif (facteur 1.0),
 *       un {@code MECHANTE} est le moins réceptif (facteur 0.3).</li>
 * </ul>
 *
 * @author SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma
 * @version 5.1
 * @see Souris
 * @see Interaction
 */
public enum Caractere {

    /**
     * Souris honnête et bienveillante.
     * En tant que DONNEUR : partage toujours une information vraie.
     * En tant que RECEVEUR : très réceptive aux informations (facteur 1.0).
     * Bonus : donne 5 points d'énergie à une souris amie affaiblie.
     */
    SINCERE,

    /**
     * Souris malveillante.
     * En tant que DONNEUR : ment toujours (partage de fausses informations).
     * En tant que RECEVEUR : très peu réceptive (facteur 0.3).
     * Pénalise les probabilités de reproduction.
     */
    MECHANTE,

    /**
     * Souris centrée sur ses propres intérêts.
     * En tant que DONNEUR : ment 70% du temps.
     * En tant que RECEVEUR : moyennement réceptive (facteur 0.5).
     * Pénalise légèrement les probabilités de reproduction.
     */
    EGOISTE,

    /**
     * Souris ouverte et communicative.
     * En tant que DONNEUR : partage toujours une information vraie.
     * En tant que RECEVEUR : bonne réceptivité (facteur 0.9).
     */
    SOCIABLE
}
