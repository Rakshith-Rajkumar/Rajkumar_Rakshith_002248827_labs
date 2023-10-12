/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
//IMPORTING JAVA CLASSES.
import java.util.ArrayList;

//IMPORTING MODEL JAVA CLASSES.
import Model.Account;
/**
 *
 * @author raksh
 */
public class AccountDirectory {
    private ArrayList<Account> accountList;
    Account newAccount;

    //Constructor function.
    public AccountDirectory(){
        this.accountList = new ArrayList<Account>();
    }
    
    
    //Getters and setters.
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    //Add a new account to the array list and return the account.
    public Account addAccount(){
        Account newAccount = new Account();
        accountList.add(newAccount);
        return newAccount;
    }
    
    //Method to delete the account from the list.
    public void deleteAccount(Account account){
        accountList.remove(account);
    }
    
    //Method to return a particular account from the account list.
    public Account searchAccount(String accountNumber){
        Account seachedAccount = null;
        for(Account curAccount : accountList){
            if(curAccount.getAccountNumber().equals(accountNumber)){
                seachedAccount = curAccount;
                break;
            }
        }
        return seachedAccount;
    }
}

