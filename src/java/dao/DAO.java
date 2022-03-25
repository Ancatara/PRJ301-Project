package dao;

import context.DBContext;
import entity.Account;
import entity.Article;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Article> getAll() {
        String query = "select ar.* ,ac.username\n"
                + "from Article ar join Account ac\n"
                + "on ar.creatorID = ac.UserID";
        List<Article> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public List<Article> paging(int index) {
        String query = "SELECT ar.*,ac.username FROM Article ar join Account ac\n"
                + "on ar.creatorID = ac.UserID\n"
                + "order by ArticleID\n"
                + "OFFSET ? ROWS  FETCH NEXT 3 ROWS ONLY";
        List<Article> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index * 3 - 3));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public List<Article> getAllArticle() {
        String query = "select * from Article";
        List<Article> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public List<Article> getArticleBycID(int id) {
        String query = "select ar.* ,ac.username\n" +
"                from Article ar join Account ac\n" +
"                on ar.creatorID = ac.UserID\n" +
"				where ar.creatorID =?";
        List<Article> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public Article getArticleByID(String id) {
        String query = "select ar.* ,ac.username\n" +
                    "from Article ar join Account ac\n" +
                    "on ar.creatorID = ac.UserID\n" +
                    "where ar.ArticleID =?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account login(String user, String pass) {
        String query = "select * from account\n"
                + "where username = ?\n"
                + "and [password] = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Article> searchByTitle(String txtSearch) {
        List<Article> list = new ArrayList<>();
        String query = "select * from Article\n" +
                        "where title like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Article(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    

    public void addNew(int uid, String image, String title, String des) {
        String query = "insert into Article\n"
                + "values(?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, title);
            ps.setString(2, des);
            ps.setString(3, image);
            ps.setInt(4, uid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int totalPage() {
        int total = 0;
        String query = "select count(*)\n"
                + "from Article";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int totalA = rs.getInt(1);
                total = totalA / 3;
                if (totalA % 3 != 0) {
                    total++;
                }
            }
        } catch (Exception e) {
        }
        return total;
    }
    
    public void update(String uid, String image, String title, String des) {
        String query = "update Article \n" +
                        "set title = ?,\n" +
                        "description = ?,\n" +
                        "imageLink = ?\n" +
                        "where ArticleID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, title);
            ps.setString(2, des);
            ps.setString(3, image);
            ps.setString(4, uid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public Account checkAccountExist(String user) {
        String query = "select * from\n" +
                        "account\n" +
                        "where username = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void singup(String user, String pass) {
        String query = "insert into account\n" +
                        "values(?,?,0)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteArticle(String aid) {
        String query = "Delete from Article\n" +
                        "where ArticleID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, aid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }


    public static void main(String[] args) {
        DAO dao = new DAO();

    }

    
}
