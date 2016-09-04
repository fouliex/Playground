package mockitosample.orderprocessing.bo;

import mockitosample.orderprocessing.dao.OrderDAO;
import mockitosample.orderprocessing.dto.Order;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.sql.SQLException;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class OrderBOImplTest {

    public static final int ORDER_ID = 123;
    OrderDAO dao;
    private OrderBOImpl bo;

    @Before
    public void setup() {
        dao = Mockito.mock(OrderDAO.class);
        bo = new OrderBOImpl();
        bo.setDao(dao);
    }

    @Test
    public void placeOrderShouldCreateAnOrder() throws SQLException, BOException {
        //when
        Order order = new Order();
        when(dao.create(order)).thenReturn(new Integer(1));

        //Then
        boolean result = bo.placeOrder(order);
        assertTrue(result);
        verify(dao).create(order);
    }


    @Test
    public void placeOrderShouldNotCreateAnOrder() throws SQLException, BOException {
        //When
        Order order = new Order();
        when(dao.create(order)).thenReturn(new Integer(0));

        //Then
        boolean result = bo.placeOrder(order);
        assertFalse(result);
        verify(dao,times(1)).create(order);
    }

    @Test(expected = BOException.class)
    public void placeOrderShouldThrowAnException() throws BOException, SQLException {
        //When
        Order order = new Order();
        when(dao.create(order)).thenThrow(SQLException.class);
        boolean result = bo.placeOrder(order);
        assertNull(result);
    }

    @Test
    public void cancelOrderShouldCancelTheOrder() throws SQLException, BOException {
        Order order = new Order();
        when(dao.read(anyInt())).thenReturn(order);
        when(dao.update(any(Order.class))).thenReturn(1);

        boolean result = bo.cancelOrder(123);
        assertTrue(result);
        verify(dao).read(ORDER_ID);
        verify(dao).update(order);
    }

    @Test
    public void cancelOrderShouldNotCancelTheOrder() throws SQLException, BOException {
        Order order = new Order();
        when(dao.read(ORDER_ID)).thenReturn(order);
        when(dao.update(order)).thenReturn(0);

        boolean result = bo.cancelOrder(ORDER_ID);
        assertFalse(result);
        verify(dao).read(ORDER_ID);
        verify(dao).update(order);
    }

    @Test(expected = BOException.class)
    public void cancelOrderShouldThrowABOExceptionOnRead() throws SQLException, BOException {
        when(dao.read(ORDER_ID)).thenThrow(SQLException.class);
        bo.cancelOrder(ORDER_ID);
    }

    @Test(expected = BOException.class)
    public void cancelOrderShouldThrowABOExceptionOnUpdate() throws SQLException, BOException {
        Order order = new Order();
        when(dao.read(ORDER_ID)).thenReturn(order);
        when(dao.update(order)).thenThrow(SQLException.class);
        bo.cancelOrder(ORDER_ID);
    }

    @Test
    public void deleteOrderShouldDeleteOrder() throws SQLException, BOException {
        when(dao.delete(ORDER_ID)).thenReturn(1);
        boolean result = bo.deleteOrder(ORDER_ID);
        assertTrue(result);
        verify(dao).delete(ORDER_ID);

    }

    @Test
    public void deleteOrderShouldNotDeleteOrder() throws SQLException, BOException {
        when(dao.delete(ORDER_ID)).thenReturn(0);
        boolean result = bo.deleteOrder(ORDER_ID);
        assertFalse(result);
        verify(dao).delete(ORDER_ID);
    }

    @Test(expected = BOException.class)
    public void deleteOrderShouldThrowABOException() throws SQLException, BOException {
        when(dao.delete(ORDER_ID)).thenThrow(SQLException.class);
        bo.deleteOrder(ORDER_ID);

    }
}