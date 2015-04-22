import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by לירון on 22/04/2015.
 */
public class CustomerDAO {
    private  static Connection c;

    public static List<Customer> getCustomerByDomain(String email) throws SQLException{
        PreparedStatement ps;
        ps = c.prepareCall("SELECT coupon_preference FROM customer_user WHERE email LIKE email");
        int x = 1;
        ps.setString(x, email);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        List <Customer> l_customers = new ArrayList<>();
        while (rs.next()){
            l_customers.add(new Customer(rs.getString(1), rs.getDate(1), rs.getString(1)));
        }
        return l_customers;
    }
}
