
package Controller;


import Model.User;
import java.util.Hashtable;
import java.util.List;


public class UserController {
     public static List<User> get(Hashtable<String, Object> ht){
        List<User> users = null;
        if(ht == null){
            users = UserDto.getAll();
            System.out.println(users);
        }else {
            String name = (String) ht.get("name");
            users = UserDto.getAllByName(name);

        }
        return users;
    }
     public static String post(User user) {

        String msg = "";
        String err = "";

        if (err.isEmpty()) {

            String dbmsg = UserDto.save(user);
            if (dbmsg.equals("1"))
                msg = "1";
            else
                msg = "DB error : \n" + dbmsg;

        } else {
            msg = "Data Errors : \n" + err;
        }

        return msg;

    }
     public static String put(User user){
        String msg = "";
        String err = "";

        if (err.isEmpty()) {

            String dbmsg = UserDto.update(user);
            if (dbmsg.equals("1"))
                msg = "1";
            else
                msg = "DB error : \n" + dbmsg;

        } else {
            msg = "Data Errors : \n" + err;
        }

        return msg;
    }
     public static String delete(User user){
        String msg = "";
        String err = "";
        if (err.isEmpty()) {

            String dbmsg = UserDto.delete(user);
            if (dbmsg.equals("1"))
                msg = "1";
            else
                msg = "DB error : \n" + dbmsg;

        } else {
            msg = "Data Errors : \n" + err;
        }

        return msg;
    }
    
}
