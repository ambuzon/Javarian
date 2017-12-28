package apc.entjava.logindemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import java.sql.*;
/**
 * Created by student on 12/2/2017.
 */
@ManagedBean
public class LoginBean {
    private String loginName;
    private String password;

    @ManagedProperty(value = "#{authBean}")
    private AuthBean authBean;

    public AuthBean getAuthBean() {
        return authBean;
    }

    public void setAuthBean(AuthBean authBean) {
        this.authBean = authBean;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db/tests.db";
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            System.out.println("it now works");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public boolean selectAll(String username, String password){
        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        try{
            Connection conn = this.connect();
            if(conn != null){
                Statement stmt  = conn.createStatement();
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, username);
                pstmt.setString(2, password);

                ResultSet rs    = pstmt.executeQuery();

                // loop through the result set
                if(rs.next()){
                    System.out.println("Query is true");
                    return true;
                }
                else {
                    System.out.println("Query is true");
                    return false;
                }
            }
            else {
                System.out.println("conn = null");
                return false;
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
/*
    public static void main(String[] args) {
        LoginBean app = new LoginBean();
        System.out.println(app.selectAll("Andrey","123"));
    }
*/
    public String login() {
        LoginBean app = new LoginBean();
        System.out.println(app.selectAll(loginName,password));
            if (app.selectAll(loginName,password)) {
                authBean.setLoggedUsername(loginName);
                return "protected/mainpage";
            }else {
                System.out.println("it goes false int login class");
                return "error";
            }
    }
}
