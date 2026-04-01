package duckcorp.duck;

/**
 * Canard en plastique de luxe.
 *
 * TODO (Ex1) :
 *   - Faites hériter cette classe de Duck -> OK
 *   - Implémentez le constructeur LuxuryDuck(int qualityScore) avec un appel à super -> OK
 *   - Implémentez getBasePrice() et describe() -> OK
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class LuxuryDuck extends Duck
    {
        public LuxuryDuck(int qualityScore)
            {
                super(DuckType.LUXURY, qualityScore);
            }

        @Override
        public double getBasePrice()
            {
                return 80.0;
            }

        @Override
        public String describe()
            {
                return "Canard en plastique de luxe";
            }
    }
