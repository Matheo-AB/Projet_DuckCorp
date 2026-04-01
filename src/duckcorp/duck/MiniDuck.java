package duckcorp.duck;

/**
 * Canard en plastique miniature.
 *
 * TODO (Ex1) :
 *   - Faites hériter cette classe de Duck -> OK
 *   - Implémentez le constructeur MiniDuck(int qualityScore) avec un appel à super -> OK
 *   - Implémentez getBasePrice() et describe() -> OK
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class MiniDuck extends Duck
    {
        private static final double BASE_PRICE = 12.0;

        public MiniDuck(int qualityScore)
            {
                super(DuckType.MINI, qualityScore);
            }

        @Override
        public double getBasePrice()
            {
                return BASE_PRICE;
            }

        @Override
        public String describe()
            {
                return "Mini Canard";
            }
    }
