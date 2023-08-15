

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        User  coder  = new Coder ();
        User  buyer  = new Buyer ();
      User loggedInUser = null ;
        
        Project  project  = new Project ();
        Admin admin = new Admin();
        ArrayList<User> coderList=new ArrayList<User>();
        ArrayList<User> buyerList=new ArrayList<>();
        ArrayList<Admin> projectList=new ArrayList<>();
       
		char ch;
		do {
            System.out.println("1. Register\n2.Login\n3. Admin Pannel "
            		+ "\n4. Chosing the project by coder \n5. project for Purchasing \n 6.Showing all approved projects\n7. for logout \n 8..for Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  
                   
                   char c;  
            switch (choice) {
                case 1:
                    System.out.println("\n Enter char c for coder and b for buyer :");
                       
                    c=scanner.next().charAt(0);
                    if(c=='c'||c=='C')
                    {
                     coder.register(scanner,coderList);
                     System.out.println(coderList);
                    }
                    else
                    {
                    buyer.register(scanner,buyerList);
                    System.out.println(buyerList);
                    }
                    break;
                case 2:
                	System.out.println("\n Enter char c for coder and b for buyer :");
                    
                    c=scanner.next().charAt(0);
                     if(c=='c'||c=='C')
                         loggedInUser=coder.login(coderList,buyerList,scanner,admin);
                     else
                         loggedInUser=buyer.login(coderList,buyerList,scanner,admin); 
                    break;
                case 3:
                    String u,p;
                    System.out.println("\n Enter user and password for admin login ");
                    u=scanner.nextLine();
                    p=scanner.nextLine();
                    
                    if (admin.checkAdmin(u,p)) {
                         
                       
                         char v;
						do {
							
                         System.out.println("\n Enter 1 for upload Project \n 2 for Show project to Buyer \n 3 for showProjects to coder \n other for exit");
                          switch(scanner.nextInt()) 
                          {
                            case 1:
                            	 System.out.println("\n Enter c for coding purpose project ,b  for selling ...:");
 		                        c=scanner.next().charAt(0);
 		                        scanner.nextLine();
                            admin.uploadProject(scanner,c);
                            break;
                            case 2:
                            admin.showProjectForBuyer();
                            break;
                            case 3:
                            admin.showProjectForCoder();
                            break;
                            default:
                            	return;
                          }
                          System.out.println("\n Do u want to continue in Admin Page: press y for yes or any for no ");
                          v= scanner.next().charAt(0);
                         }while(v=='y'||v=='Y');
                         
                    }
                    else{
                        System.out.println("\n Enter correct credential :");
                    }
                    break;
                    case 4:
                        
                       System.out.println("welcome .."+loggedInUser.username);
                       admin.chooseProjectByCoder(loggedInUser,scanner);
                    break;
                case 5:
                     
                       System.out.println("welcome .."+loggedInUser.username);
                       admin.chooseProjectBybuyer(loggedInUser,scanner);
                    break;
                case 6:
                	admin.approvedProject();
                case 7:
                       loggedInUser=null;
                       System.out.println("logged Out Succesfully");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    
                    
             } 
             System.out.println("\n Do u Want to continue: press y for yes or any for no");
            ch=scanner.next().charAt(0);
        }while(ch=='y'||ch=='Y');
	}
}
