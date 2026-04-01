package duckcorp.duck;

/**
 * Canard en plastique standard.
 *
 * TODO (Ex1) :
 *   - Faites hériter cette classe de Duck -> OK
 *   - Implémentez le constructeur StandardDuck(int qualityScore) avec un appel à super -> OK
 *   - Implémentez getBasePrice() et describe() -> OK
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class StandardDuck extends Duck
    {
        public StandardDuck(int qualityScore)
            {
                super(DuckType.STANDARD, qualityScore);
            }

        @Override
        public double getBasePrice()
            {
                return 25.0;
            }

        @Override
        public String describe()
            {
                return "Canard en plastique standard";
            }
}
