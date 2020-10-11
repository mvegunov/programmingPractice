package lesson_4.order_service.model;


/**
 * Класс сущности заказа
 */
public class Order {

    /**
     * Идентификатор заказа
     */
    private Integer orderId;

    /**
     * Наименование клиента
     */
    private String customerName;

    /**
     * Сумма заказа
     */
    private Integer price;

    /**
     * Конструктор класса Order
     */
    public Order(Integer orderId, String customerName, Integer price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.price = price;
    }

    /**
     * Конструктор без параметров
     */
    public Order() {
        super();
    }

    /**
     * Метод получения поля id
     * @return значения поля id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * Метод получения поля customerName
     * @return значение поля customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Метод получения поля price
     * @return значение поля price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * Метод для редактирования поля orderId
     * @param orderId желаемое значение поля id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * Метод для редактирования поля customerName
     * @param customerName желаемое значение поля customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Метод для редактирования поля price
     * @param price желаемое значение поля price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}
