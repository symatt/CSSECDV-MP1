package Controller;


import Model.History;
import Model.Logs;
import Model.Product;
import Model.User;
import View.Frame;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.security.SecureRandom;



public class Main {
    
    public SQLite sqlite;
    
    public static void main(String[] args) {
        new Main().init();
    }
    
    public void init(){
        // Initialize a driver object
        sqlite = new SQLite();

//        // Create a database
//        sqlite.createNewDatabase();
//        
        // Drop users table if needed
        sqlite.dropHistoryTable();
        sqlite.dropLogsTable();
        sqlite.dropProductTable();
        sqlite.dropUserTable();
        sqlite.dropSecQuesTable();
//        
        // Create users table if not exist
        sqlite.createHistoryTable();
        sqlite.createLogsTable();
        sqlite.createProductTable();
        sqlite.createUserTable();
        sqlite.createSecQuesTable();
//        
//        // Add sample history
//        sqlite.addHistory("admin", "Antivirus", 1, "2019-04-03 14:30:00.000");
//        sqlite.addHistory("manager", "Firewall", 1, "2019-04-03 14:30:01.000");
//        sqlite.addHistory("staff", "Scanner", 1, "2019-04-03 14:30:02.000");
//        
//        // Add sample logs
//        sqlite.addLogs("NOTICE", "admin", "User creation successful", new Timestamp(new Date().getTime()).toString());
//        sqlite.addLogs("NOTICE", "manager", "User creation successful", new Timestamp(new Date().getTime()).toString());
//        sqlite.addLogs("NOTICE", "admin", "User creation successful", new Timestamp(new Date().getTime()).toString());
//        
//        // Add sample product
//        sqlite.addProduct("Antivirus", 5, 500.0);
//        sqlite.addProduct("Firewall", 3, 1000.0);
//        sqlite.addProduct("Scanner", 10, 100.0);
//
//        // Add sample users
//        sqlite.addUser("admin", "qwerty1234", 5);
//        sqlite.addUser("manager", "qwerty1234", 4);
//        sqlite.addUser("staff", "qwerty1234", 3);
//        sqlite.addUser("client1", "qwerty1234", 2);
//        sqlite.addUser("client2", "qwerty1234", 2);
//        
        sqlite.addSecQues("In what city were you born?");
        sqlite.addSecQues("What is your mother's maiden name?");
        sqlite.addSecQues("What was your favorite food as a child?");
        sqlite.addSecQues("What year was your father (or mother) born?");
        sqlite.addSecQues("What is the name of your favorite pet?");
        sqlite.addSecQues("What high school did you attend?");
        sqlite.addSecQues("What was the name of your elementary school?");
        sqlite.addSecQues("What street did you live on in third grade?");

//        
//        // Get users
//        ArrayList<History> histories = sqlite.getHistory();
//        for(int nCtr = 0; nCtr < histories.size(); nCtr++){
//            System.out.println("===== History " + histories.get(nCtr).getId() + " =====");
//            System.out.println(" Username: " + histories.get(nCtr).getUsername());
//            System.out.println(" Name: " + histories.get(nCtr).getName());
//            System.out.println(" Stock: " + histories.get(nCtr).getStock());
//            System.out.println(" Timestamp: " + histories.get(nCtr).getTimestamp());
//        }
//        
//        // Get users
//        ArrayList<Logs> logs = sqlite.getLogs();
//        for(int nCtr = 0; nCtr < logs.size(); nCtr++){
//            System.out.println("===== Logs " + logs.get(nCtr).getId() + " =====");
//            System.out.println(" Username: " + logs.get(nCtr).getEvent());
//            System.out.println(" Password: " + logs.get(nCtr).getUsername());
//            System.out.println(" Role: " + logs.get(nCtr).getDesc());
//            System.out.println(" Timestamp: " + logs.get(nCtr).getTimestamp());
//        }
//        
//        // Get users
//        ArrayList<Product> products = sqlite.getProduct();
//        for(int nCtr = 0; nCtr < products.size(); nCtr++){
//            System.out.println("===== Product " + products.get(nCtr).getId() + " =====");
//            System.out.println(" Name: " + products.get(nCtr).getName());
//            System.out.println(" Stock: " + products.get(nCtr).getStock());
//            System.out.println(" Price: " + products.get(nCtr).getPrice());
//        }
//        // Get users
//        ArrayList<User> users = sqlite.getUsers();
//        for(int nCtr = 0; nCtr < users.size(); nCtr++){
//            System.out.println("===== User " + users.get(nCtr).getId() + " =====");
//            System.out.println(" Username: " + users.get(nCtr).getUsername());
//            System.out.println(" Password: " + users.get(nCtr).getPassword());
//            System.out.println(" Role: " + users.get(nCtr).getRole());
//            System.out.println(" Locked: " + users.get(nCtr).getLocked());
//        }
        
        // Initialize User Interface
        Frame frame = new Frame();
        frame.init(this);
    }
    
    public String checkPassStrength(String inputPassword) {
        int count = 0;

        if(inputPassword.length() >= 8 && inputPassword.length() <= 32) {
            if(inputPassword.matches(".*[a-z].*"))
                count++;
            if(inputPassword.matches(".*[A-Z].*"))
                count++;
            if(inputPassword.matches(".*\\d.*"))
                count++;
            if(inputPassword.matches(".*[*.!@#$%^&=_+-].*"))
                count++;
        }
        else if (inputPassword.length() > 32)
            return "Too Long";
        
        String passwordStrength;
        
        switch(count) {
            case 1:
                passwordStrength = "Weak";
               break;
            case 2:
                passwordStrength = "Fair";
               break;
            case 3:
                passwordStrength = "Good";
               break;
            case 4:
                passwordStrength = "Strong";
               break;
            default:
                passwordStrength = "Too Short";
        }
        
        return passwordStrength; 
    }
}
