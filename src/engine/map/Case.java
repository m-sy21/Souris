package engine.map;

/**
 * Représente une case (cellule) de la grille de simulation.
 * <p>
 * Une case est identifiée de manière unique par ses coordonnées :
 * un numéro de ligne et un numéro de colonne. Elle constitue l'unité
 * de base de l'environnement spatial dans lequel évoluent les souris,
 * les obstacles et les sources de nourriture.
 * </p>
 * <p>
 * Deux cases sont considérées égales si et seulement si elles partagent
 * la même ligne et la même colonne ({@link #equals(Object)}).
 * </p>
 *
 * @author SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma
 * @version 5.1
 * @see Grille
 */
public class Case {

    /** Numéro de ligne de cette case dans la grille (index à partir de 0). */
    private int line;

    /** Numéro de colonne de cette case dans la grille (index à partir de 0). */
    private int column;

    /**
     * Construit une case à la position donnée.
     *
     * @param line   numéro de ligne (≥ 0)
     * @param column numéro de colonne (≥ 0)
     */
    public Case(int line, int column) {
        this.line = line;
        this.column = column;
    }

    /**
     * Retourne le numéro de ligne de cette case.
     *
     * @return numéro de ligne
     */
    public int getLine() {
        return line;
    }

    /**
     * Retourne le numéro de colonne de cette case.
     *
     * @return numéro de colonne
     */
    public int getColumn() {
        return column;
    }

    /**
     * Retourne une représentation textuelle de la case.
     *
     * @return chaîne de la forme {@code "Block [line=L, column=C]"}
     */
    @Override
    public String toString() {
        return "Block [line=" + line + ", column=" + column + "]";
    }

    /**
     * Teste l'égalité entre deux cases.
     * Deux cases sont égales si elles ont la même ligne et la même colonne.
     *
     * @param obj l'objet à comparer
     * @return {@code true} si les deux cases occupent la même position
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Case)) return false;
        Case other = (Case) obj;
        return this.line == other.line && this.column == other.column;
    }

    /**
     * Calcule le code de hachage de la case.
     * Cohérent avec {@link #equals(Object)}.
     *
     * @return code de hachage basé sur la ligne et la colonne
     */
    @Override
    public int hashCode() {
        return 31 * line + column;
    }
}
