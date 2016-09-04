package mockitosample.orderprocessing.bo;

import mockitosample.orderprocessing.dto.Order;

/**
 * The Business Object interface represents the data client.
 * It is the object that requires access to the data source to obtain and store data
 * Created by 212361198 on 8/15/16.
 */
public interface OrderBO {

    boolean placeOrder(Order order) throws BOException;

    boolean cancelOrder(int id) throws BOException;

    boolean deleteOrder(int id) throws BOException;
}
