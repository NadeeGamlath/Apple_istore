
package Controller;

import Model.Category;
import Model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDto extends Product{
    public static List<Product>get(String qry){
        List<Product> persons = new ArrayList<>();
        try{
            ResultSet rslt = Common.get(qry);
            while (rslt.next()){

                Product product = new Product();
                product.setId(rslt.getInt("id"));
                product.setName(rslt.getString("name"));
                product.setPrice(rslt.getDouble("price"));
                product.setQty(rslt.getInt("quantity"));
                product.setCategory(CategoryDto.getById(rslt.getInt("category_id")));
                persons.add(product);
            }
        }catch (SQLException e){
            System.out.println("Can't get result as"+e.getMessage());
        }
        return persons;
    }
    
    public static String save(Product product) {
        String msg = "1";
        System.out.println(product);
        String qry = "insert into product(name,price,quantity,category_id) values( '" + product.getName() + "','" + product.getPrice() +"','" + product.getQty()+"'," + product.getCategory().getId()  + ");";
        msg = Common.modify(qry);
        return msg;
    }
    
    public static List<Product> getAll() {
        String qry = "select*from product";
        List list = get(qry);
        return list;
    }
    public static String update(Product product){
        String msg ="1";
        String sql = "UPDATE product set name='"+product.getName()+"',price='"+product.getPrice()+"',quantity='"+product.getQty()+"',category_id='"+product.getCategory().getId()+"'WHERE id="+product.getId();
       
        msg = Common.modify(sql);
        return msg;

    }
    public static String delete(Product product){
        String msg ="1";
        String sql = "Delete From product WHERE id=" +product.getId();
        msg = Common.modify(sql);
        return msg;
    }
    
    public static List<Product> getAllByName(String name){
        String qry =  "select*from product where name like '" + name + "%'";
        List list = get(qry);
        return list;
    }
    public static List<Product> getAllByCategory(Object category){
        String qry = "select*from product where category_id =" + category;
        System.out.println(qry);
        List list = get(qry);
        return  list;
    }
    public static List<Product> getAllByNameAndCategory(String name, Object category) {
        String qry = "select*from product where name like '" + name + "%' and category_id =" + category;
        List list = get(qry);
        return list;
    }
    
    

}
