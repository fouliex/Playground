package mockitosample.orderprocessing.dao;

import mockitosample.orderprocessing.dto.Order;

import java.sql.SQLException;

/**
 * The Order Data Access Object  interface provides access to an underlying database
 * Created by 212361198 on 8/15/16.
 */
public interface OrderDAO {

    int create(Order order) throws SQLException;

    Order read(int id) throws SQLException;

    int update(Order order) throws SQLException;

    int delete(int id) throws SQLException;


}
