
package Controller;

import Model.Category;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDto {
    public static Category getById(int id){
        Category category = new Category();
        try {
            ResultSet result = Common.get("select * from category where id=" + id);
            while (result.next()) {
                category.setId(result.getInt("id"));
                category.setName(result.getString("name"));
               // System.out.println(result.getString("name"));
            }
        }catch (SQLException e){
            System.out.println("Can't Get Results as : " + e.getMessage());
        }
        return category;
    }
    
    public static List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        try {
            ResultSet result = Common.get("select * from category");
            while (result.next()) {
                Category category = new Category();
                category.setId(result.getInt("id"));
                category.setName(result.getString("name"));
                categories.add(category);
            }
        } catch (SQLException Ex) {
            System.out.println("Can't Get Results as : " + Ex.getMessage());
        }
        return categories;
    } 
}


