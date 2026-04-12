package duckcorp.bonus;

import duckcorp.order.Order;
import duckcorp.order.OrderStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Carnet de commandes trié automatiquement par urgence (délai croissant).
 * Les commandes les plus urgentes apparaissent en tête de liste.
 *
 * TODO (Bonus 2) :
 *   - Implémentez addOrder(), getPendingOrders(), getMostUrgent()
 *
 * Utilisez Collections.sort() avec un Comparator approprié.
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class OrderBook
    {
        private final List<Order> orders = new ArrayList<>();

        /**
         * Ajoute une commande et maintient la liste triée par turnsRemaining croissant.
         * En cas d'égalité de délai, triez par id pour garantir un ordre stable.
         *
         * TODO : ajoutez l'ordre puis triez la liste.
         * En cas d'égalité de délai, garantissez un ordre stable et reproductible.
         */
        public void addOrder(Order order)
            {
                // TODO
                orders.add(order);
                orders.sort(Comparator.comparingInt(Order::getTurnsRemaining).thenComparing(Order::getId));
            }

        /**
         * Retourne la liste des commandes en attente (status == PENDING),
         * dans l'ordre de tri courant.
         *
         * TODO : parcourez orders, ne retournez que celles avec status PENDING.
         */
        public List<Order> getPendingOrders()
            {
                // TODO
                List<Order> pending = new ArrayList<>();
                for (Order order : orders)
                    {
                        if (order.getStatus() == OrderStatus.PENDING)
                            {
                                pending.add(order);
                            }
                    }
                return pending;
            }

        /**
         * Retourne la commande PENDING la plus urgente (premier élément trié),
         * ou null si aucune commande n'est en attente.
         *
         * TODO : utilisez getPendingOrders() et retournez le premier élément.
         */
        public Order getMostUrgent()
            {
                // TODO
                List<Order> pending = getPendingOrders();
                return pending.isEmpty() ? null : pending.get(0);
            }

        /** Retourne toutes les commandes (fourni). */
        public List<Order> getAll()
            {
                return Collections.unmodifiableList(orders);
            }
    }
