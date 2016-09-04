package mockitosample.orderprocessing.dto;

/**
 * Created by 212361198 on 8/15/16.
 */
public class Order {

    int id;

    String status;

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {

        return id;
    }

    public String getStatus() {
        return status;
    }
}
