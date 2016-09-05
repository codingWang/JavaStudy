package com.duwei.designpattern.state2;

//³éÏó×´Ì¬Àà  
abstract class AccountState {  
  protected Account acc;  
  public abstract void deposit(double amount);  
  public abstract void withdraw(double amount);  
  public abstract void computeInterest();  
  public abstract void stateCheck();  
}  
