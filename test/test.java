
import dao.DAO;
import entity.Article;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        DAO dao = new DAO();
        dao.searchByTitle("elit");
                
            System.out.println(dao.searchByTitle("elit"));
        }
    
}
