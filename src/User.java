

import java.util.ArrayList;

import java.util.Scanner;

abstract class User {
    protected String username;
    protected String password;
    
	protected abstract void register(Scanner scanner, ArrayList<User> coderList);
	protected abstract User login(ArrayList<User> coderList, ArrayList<User> buyerList, Scanner scanner, Admin admin);
	 
    
} 