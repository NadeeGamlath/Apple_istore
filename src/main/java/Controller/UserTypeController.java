
package Controller;

import Model.UserType;
import java.util.List;


public class UserTypeController {
    public static List<UserType> get(){

        List<UserType> userType = null;
        userType = UserTypeDto.getAll();

        return userType;

}
}
