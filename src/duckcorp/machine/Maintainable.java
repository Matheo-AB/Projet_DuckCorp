package duckcorp.machine;

/**
 * Interface représentant une machine pouvant être entretenue.
 *
 * TODO (Ex2) :
 *   - Implémentez needsMaintenance() et getConditionLabel() (méthodes default) -> OK
 * @author Roussille Philippe <roussille@3il.fr>
 */
public interface Maintainable
    {
        /** Retourne l'état de la machine (entre 0 et 100). */
        int getCondition();


        /** Effectue une opération de maintenance sur la machine. */
        void maintain();

        /**
         * Retourne true si la machine nécessite une maintenance (condition < 30).
         * TODO : implémentez cette méthode default. -> OK
         */
        default boolean needsMaintenance()
            {
                if (getCondition() < 30)
                        return true;
                else
                        return false;
            }

        /**
         * Retourne un libellé décrivant l'état de la machine :
         *   condition >= 80 -> "Parfait" / >= 50 -> "Correct" / >= 30 -> "Usé" / < 30 -> "Critique"
         * TODO : implémentez cette méthode default. -> OK
         */
        default String getConditionLabel()
            {
                if (getCondition() >= 80) return "Parfait";
                else if (getCondition() >= 50) return "Correct";
                else if (getCondition() >= 30) return "Usé";
                else if (getCondition() < 30) return "Critique";
                throw new UnsupportedOperationException("Maintainable.getConditionLabel()");
            }
    }
