  
package Singleton;

public class Main {
    public static void main(String[] args){
        System.out.println("The Sum of Data Manager Acount is : ");
        DataManager account = DataManager.getInstance("200819");
        DataManager NextAccount = DataManager.getInstance("200820");
        
    }
}