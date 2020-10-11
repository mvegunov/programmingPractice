package lesson_4.order_service.controller;

import lesson_4.order_service.Service.OrderService;
import lesson_4.order_service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Класс контроллера заказов
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * Метод получения списка всех заказов
     * @return результат выполнения метода в классе сервиса
     */
    @GetMapping("/getAll")
    public List<Order> getAll() {
        return orderService.getAll();
    }

    /**
     * Метод создания нового заказа
     * @param order экземпляр заказа
     * @return результат выполнения метода в классе сервиса
     */
    @PostMapping("/createOrder")
    public Integer createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
}

