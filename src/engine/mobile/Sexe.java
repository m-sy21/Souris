package engine.mobile;

/**
 * Énumère les deux sexes possibles d'une souris dans la simulation.
 * <p>
 * Le sexe d'une souris est attribué aléatoirement à sa création et
 * ne change jamais au cours de sa vie. Il joue un rôle central dans
 * la gestion des interactions :
 * </p>
 * <ul>
 *   <li>Deux souris de <strong>même sexe</strong> (M+M ou F+F) peuvent échanger
 *       des informations sur la nourriture si l'un est {@code DONNEUR} et l'autre
 *       {@code RECEVEUR}.</li>
 *   <li>Deux souris de <strong>sexe opposé</strong> (M+F) peuvent se reproduire,
 *       quel que soit leur rôle D/R.</li>
 * </ul>
 *
 * @author SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma
 * @version 5.1
 * @see Souris
 */
public enum Sexe {

    /** Souris mâle — représentée par une image sans oreilles roses. */
    MALE,

    /** Souris femelle — représentée par une image avec oreilles roses. */
    FEMELLE;

    /**
     * Indique si ce sexe est compatible pour une reproduction avec un autre sexe.
     * La reproduction nécessite que les deux sexes soient différents.
     *
     * @param autre le sexe de l'autre souris
     * @return {@code true} si les deux sexes sont différents
     */
    public boolean estCompatible(Sexe autre) {
        return this != autre;
    }
}
