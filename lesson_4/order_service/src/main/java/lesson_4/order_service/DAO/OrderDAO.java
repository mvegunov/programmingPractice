package lesson_4.order_service.DAO;

import lesson_4.order_service.model.Order;

import java.util.List;

/**
 * DAO - интерфейс
 */
public interface OrderDAO {

    List<Order> getAll();

    boolean createOrder(Order order);
}
