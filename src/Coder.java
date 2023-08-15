import java.util.ArrayList;
import java.util.Scanner;

public class Coder extends User{
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
          
                        System.out.println("Enter Username and password");
                        String u= scanner.nextLine();
                          scanner.nextLine();
                        String p=scanner.nextLine();
                         for(User r:coder)
                        {
                         if(u.compareToIgnoreCase(r.username)==0 &&(p.compareTo(r.password)==0))
                            loggedInUser= r;
                        
                        }
                     if (loggedInUser != null) 
                     {
                        System.out.println("User logged in Succesfully ,Welcome  "+loggedInUser.username);
                        admin.showProjectForCoder();   
                      }else
                      {
                        System.out.println("Invalid user or password");
                      }
                
                return loggedInUser;
 
    }

}
