package lesson_4.order_service.Service;

import lesson_4.order_service.DAO.OrderDAOImpl;
import lesson_4.order_service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Класс сервиса
 */
@Service
public class OrderService {

    @Autowired
    OrderDAOImpl orderDAO;

    /**
     * Получение списка заказов
     * @return результат выполнения метода в классе DAO
     */
    public List<Order> getAll() {
        return orderDAO.getAll();
    }

    /**
     * Метод создания нового заказа
     * @param order экземпляр заказа
     * @return идентификатор заказа
     */
    public Integer createOrder(Order order) {
        try {
            orderDAO.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order.getOrderId();
    }
}
