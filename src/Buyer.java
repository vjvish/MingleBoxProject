import java.util.ArrayList;
import java.util.Scanner;

public class Buyer extends User {
	public void  register(Scanner sc,ArrayList<User>a)
    {
        System.out.println("Enter  username and password ");
        username=sc.nextLine();
        sc.nextLine();
        password=sc.nextLine();
        a.add(this);
        
    }
    public User login(ArrayList<User>coder,ArrayList<User>buyer,Scanner scanner,Admin admin)
    {
        char c;
         User loggedInUser=null;
        
                     
                        scanner.nextLine();
                        System.out.println("Enter Username and password");
                        String u= scanner.nextLine();
                         
                        String p=scanner.nextLine();
                       for(User r:buyer)
                       {
                         if(u.compareToIgnoreCase(r.username)==0 &&(p.compareTo(r.password)==0))
                            loggedInUser= r;
                        else
                            loggedInUser=null;
                       }
                      if (loggedInUser != null)
                      {
                        System.out.println("User logged in Succesfully,Welcome  "+loggedInUser.username);
                        admin.showProjectForBuyer();
                      }
                      else
                      {
                        System.out.println("Invalid user or password");
                      }
                
                    
                return loggedInUser;
 
    }

}
