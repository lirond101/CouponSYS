import java.util.Date;

/**
 * Created by לירון on 22/04/2015.
 */
public class Customer {
    public String _email;
    public Date _dateOfBirth;
    public String _categoryType;

    public Customer (String email, Date dateOfBirth, String categoryType){
        this._email = email;
        this._dateOfBirth = dateOfBirth;
        this._categoryType = categoryType;
    }

}
