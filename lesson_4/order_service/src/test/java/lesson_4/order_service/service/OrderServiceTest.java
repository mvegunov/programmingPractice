package lesson_4.order_service.service;

import lesson_4.order_service.DAO.OrderDAOImpl;
import lesson_4.order_service.Service.OrderService;
import lesson_4.order_service.model.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@DisplayName("Класс тестов уровня сервиса")
public class OrderServiceTest {
    @InjectMocks
    OrderService orderService;

    @Mock
    OrderDAOImpl orderDAO;

    private Order orderOne = new Order(4, "Jest", 123);
    private Order orderTwo = new Order(5, "Ty", 456);
    private Order orderThree = new Order(6, "T1", 1123);

    @BeforeEach
    public void init() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Тест работы получения списка заказов")
    void getAll() {
        List<Order> testList = new ArrayList<>();

        testList.add(orderOne);
        testList.add(orderTwo);
        testList.add(orderThree);

        when(orderDAO.getAll()).thenReturn(testList);
    }

    @Test
    @DisplayName("Тест успешного создания нового заказа")
    void createOrder(){
        Order newOrder = orderOne;
        when(orderDAO.createOrder(newOrder)).thenReturn(true);
    }
}
