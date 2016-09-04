package mockitosample.orderprocessing.bo;

import java.sql.SQLException;

/**
 * Created by 212361198 on 8/15/16.
 */
public class BOException extends Exception {

    private static final long serialVersionUID = 1L;

    public BOException(SQLException e) {
        super(e);
    }
}
