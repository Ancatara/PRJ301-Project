
package entity;


public class Account {
    private int id;
    private String user;
    private String pass;
    private int isCreator;

    public Account() {
    }

    public Account(int id, String user, String pass, int isCreator) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.isCreator = isCreator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIsCreator() {
        return isCreator;
    }

    public void setIsCreator(int isCreator) {
        this.isCreator = isCreator;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", user=" + user + ", pass=" + pass + ", isCreator=" + isCreator + '}';
    }
    
}
