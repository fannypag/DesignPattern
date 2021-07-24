package Singleton;

public class DataManager {
    private static DataManager dataManager;
    private String accountNumber;   

    public static DataManager getInstance(String accountNumber) {
        if (dataManager == null) {
            dataManager = new DataManager(accountNumber);
        }
        return dataManager;
    }
    
    private DataManager(String accountNumber){
        this.accountNumber = accountNumber;
        System.out.println(accountNumber);
    }

    private DataManager() { }
}