package duckcorp.duck;

/**
 * Interface représentant un objet dont on peut évaluer la qualité.
 *
 * TODO (Ex1) :
 *   - Implémentez isDefective() et getQualityLabel() (méthodes default)  -> OK
 * @author Roussille Philippe <roussille@3il.fr>
 */
public interface Qualifiable
    {
        /** Retourne le score de qualité (entre 0 et 100). */
        int getQualityScore();

        /**
         * Retourne true si le score de qualité est strictement inférieur à 20.
         * TODO : implémentez cette méthode default en vous appuyant sur getQualityScore(). -> OK
         */
        default boolean isDefective()
            {
                if (getQualityScore() < 20)
                        return true;
                else
                        return false;
            }

        /**
         * Retourne un libellé décrivant la qualité :
         *   score >= 80 -> "Excellent" / >= 50 -> "Bon" / >= 20 -> "Médiocre" / < 20 -> "Défectueux"
         * TODO : implémentez cette méthode default. -> OK
         */
        default String getQualityLabel()
            {
                if (getQualityScore() >= 80) return "Excellent";
                else if (getQualityScore() >= 50) return "Bon";
                else if (getQualityScore() >= 20) return "Médiocre";
                else if (getQualityScore() < 20) return "Défectueux";
                throw new UnsupportedOperationException("Qualifiable.getQualityLabel()");
            }
    }
