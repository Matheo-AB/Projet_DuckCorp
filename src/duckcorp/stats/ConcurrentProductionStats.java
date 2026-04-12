package duckcorp.stats;

import duckcorp.duck.Duck;
import duckcorp.duck.DuckType;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;

/**
 * Version thread-safe de ProductionStats, utilisant ConcurrentHashMap.
 *
 * TODO (Bonus 3) :
 *   - Implémentez le constructeur : remplacez les HashMap héritées
 *     par des ConcurrentHashMap via les champs protected de la classe parente.
 *   - Surchargez recordProduction() pour utiliser ConcurrentHashMap.merge()
 *     de façon atomique.
 *
 * Question ouverte : pourquoi ConcurrentHashMap ne suffit-il pas à garantir
 * la cohérence globale des stats dans un contexte multi-thread ?
 * Que faudrait-il ajouter ?
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class ConcurrentProductionStats extends ProductionStats
    {
        /**
         * TODO : remplacez les Maps héritées par des Maps thread-safe,
         * puis initialisez chaque entrée à 0 pour tous les DuckType.
         */
        public ConcurrentProductionStats()
            {
                super();
                // TODO
                this.produced = new ConcurrentHashMap<>();
                this.sold = new ConcurrentHashMap<>();
                for (DuckType type : DuckType.values())
                    {
                        this.produced.put(type, 0);
                        this.sold.put(type, 0);
                    }
            }

        /**
         * TODO : surchargez recordProduction() pour incrémenter les compteurs
         * de façon atomique, sans risque de race condition.
         */
        @Override
        public void recordProduction(List<Duck> ducks)
            {
                // TODO
                for (Duck duck : ducks)
                    {
                        this.produced.merge(duck.getType(), 1, Integer::sum);
                    }
            }
    }
