
package Controller;

import Model.UserType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserTypeDto {
    public static UserType getById(int id){
        UserType userType = new UserType();
        try {
            ResultSet result = Common.get("select * from user_type where id=" + id);
            while (result.next()) {
                userType.setId(result.getInt("id"));
                userType.setName(result.getString("name"));
               
            }
        }catch (SQLException e){
            System.out.println("Can't Get Results as : " + e.getMessage());
        }
        return userType;
    }
    
    public static List<UserType> getAll() {
        List<UserType> userTypes = new ArrayList<>();
        try {
            ResultSet result = Common.get("select * from user_type");
            while (result.next()) {
                UserType userType = new UserType();
                userType.setId(result.getInt("id"));
                userType.setName(result.getString("name"));
                userTypes.add(userType);
            }
        } catch (SQLException Ex) {
            System.out.println("Can't Get Results as : " + Ex.getMessage());
        }
        return userTypes;
    } 
}
