
package Controller;


import Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDto {
    public static List<User>get(String qry){
        List<User> persons = new ArrayList<>();
        try{
            ResultSet rslt = Common.get(qry);
            while (rslt.next()){

                User user = new User();
                user.setId(rslt.getInt("id"));
                user.setName(rslt.getString("name"));
                user.setNic(rslt.getString("nic"));
                user.setMobile(rslt.getString("mobile"));
                user.setEmail(rslt.getString("email"));
                user.setUserType(UserTypeDto.getById(rslt.getInt("user_type_id")));
                persons.add(user);
            }
        }catch (SQLException e){
            System.out.println("Can't get result as"+e.getMessage());
        }
        return persons;
    }
    public static List<User> getAll() {
        String qry = "select*from user";
        List list = get(qry);
        return list;
    }
    public static String save(User user) {
        String msg = "1";
        System.out.println(user);
        String qry = "insert into user(name,nic,mobile,email,user_type_id) values( '" + user.getName() + "','" + user.getNic() + "','" +user.getMobile()+"','"+user.getEmail()+"',"+ user.getUserType().getId()  + ");";
        msg = Common.modify(qry);
        return msg;
    }
    public static String update(User user){
        String msg ="1";
        String sql = "UPDATE user set name='"+user.getName()+"',nic='"+user.getNic()+"',mobile='"+user.getMobile()+"',email='"+user.getEmail()+"',user_type_id='"+user.getUserType().getId()+"'WHERE id="+user.getId();
        msg = Common.modify(sql);
        return msg;

    }
    public static String delete(User user){
        String msg ="1";
        String sql = "Delete From user WHERE id=" +user.getId();
        msg = Common.modify(sql);
        return msg;
    }
    
    public static List<User> getAllByName(String name){
        String qry =  "select*from user where name like '" + name + "%'";
        List list = get(qry);
        return list;
    }
}
