package lesson_4.order_service.DAO;

import lesson_4.order_service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.List;

/**
 * Класс, реализующий DAO - интерфейс
 */
@Component
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * Переменная запроса на получение списка всех заказов
     */
    private final String GET_ALL = "SELECT * FROM orders";

    /**
     * Переменная запроса на добавление нового заказа
     */
    private final String INSERT_ORDER = "INSERT INTO orders (order_id, customer_name, price) values (?, ?, ?)";

    /**
     * Переменная запроса на получение заказа с определённым идентификатором
     */
    private final String SELECT_BY_ID = "SELECT * FROM orders WHERE order_id = ?";

    private RowMapper<Order> orderRowMapper = (ResultSet rs, int rowNumber) -> {
        Order order = new Order();

        order.setOrderId(rs.getInt(1));
        order.setCustomerName(rs.getString(2));
        order.setPrice(rs.getInt(3));
        return order;
    };

    /**
     * Запрос на получение всех заказов
     * @return все значения таблицы orders
     */
    @Override
    public List<Order> getAll() {
        return jdbcTemplate.query(GET_ALL, orderRowMapper);
    }


    /**
     * Запрос на создание заказа
     * @param order заказ
     * @return статус выполнения запроса
     */
    public boolean createOrder(Order order) {
        return (jdbcTemplate.update(INSERT_ORDER, order.getOrderId(), order.getCustomerName(), order.getPrice()) > 0);
    }
}
