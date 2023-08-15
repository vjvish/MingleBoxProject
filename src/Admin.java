

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class Admin {
	   List<Project> projectsForCoder = new ArrayList<>();
	     
	     List<Project> projectsForBuyer = new ArrayList<>();
	     
	     public boolean checkAdmin(String username,String password)
	     {
	         if(username.compareToIgnoreCase("Admin")==0 && password.compareTo("adminPassword")==0)
	         {
	             return true;
	         }else{
	             return false;
	         }
	     }
	    public void uploadProject(Scanner sc,char c) {
	        String projectName;
	        String description;
	        int pricePrediction;
	        System.out.println("Enter project name ,description, price :");
	        projectName= sc.nextLine();
	      
	        description=sc.nextLine();
	         
	        pricePrediction=sc.nextInt();
	
	        Project project = new Project(Project.c,projectName, description,pricePrediction);
	        sc.nextLine();
	        if(c=='c'||c=='C')
	        projectsForCoder.add(project);
	        else
	        projectsForBuyer.add(project);
	        
	    }
	   
	    public void showProjectForBuyer()
	    {           
	    	if(projectsForBuyer.size()==0)
	    	{
   		     System.out.println("No project added");
   		     return ;
	    	}
	        System.out.println("These are the project which is added for selling purpose  :");
	        for (Project i:projectsForBuyer)
	        {
	            System.out.println(i);
	        }
	    
	    }
	     public void showProjectForCoder()
	    {
	    	 if(projectsForCoder.size()==0)
		    	{
	   		     System.out.println("No project added");
	   		     return ;
		    	}
	        System.out.println("These are the project newly uploaded for code");
	       
	        for (Project i:projectsForCoder)
	        {
	            System.out.println(i);
	        }
	    }
	    public void chooseProjectBybuyer(User u1,Scanner sc)
	    {
	         int m=0,price=0;
	        
	        Random r=new Random();
	        int d=r.nextInt(projectsForCoder.size());
	        System.out.println(d);
	        for (Project i:projectsForCoder)
	        {
	           if(d==i.id)
	          {
	              price=i.pricePrediction;
	              break;
	           }
	        }
	       
	        System.out.println("\nWhat price u want to Give for the project  Expected price is "+price+" Enter ur price ");
	        price=sc.nextInt();
	        approveProjectForBuyer(d,price);
	    }
	    public  void approveProjectForBuyer(int id,int givenPrice)
	    {
	    	 int actualPrice = 0;
	    	 ApprovedProjects obj=new ApprovedProjects();
	    	 Project temp=new Project();
	    	 for (Project i:projectsForBuyer)
	    	 {
	    		 if(id==i.id)
	    		 {
	    			 actualPrice=i.pricePrediction;temp=i;
	    			 break;
	    		 }
	    	 }
	    	 if(actualPrice>=givenPrice)
	    	 {
	    		 obj.setProjectForBuyer(temp);
	    		 System.out.println("Congrats u got project ");
	    	 }else
	    	 {
	    		 System.out.println("Soryy u didn't get project ");
	    	 }
	    }
	    
	    public void chooseProjectByCoder(User u1,Scanner sc)
	    {
	        int m=0,price=0;
	        Random r=new Random();
	        for (Project i:projectsForCoder)
	        {
	           if(m< i.id)
	          {
	              price=i.pricePrediction;
	              m=i.id;
	           }
	        }
	        int d=r.nextInt(m);// id
	        System.out.println(d);
	        System.out.println("\nWhat price u want to take for the project current price is "+price+" Enter ur price ");
	        price=sc.nextInt();
	        approveProjectForCoder(d,price);
	    }
	     public  void approveProjectForCoder(int id,int givenPrice)
	    {
	    	 int actualPrice = 0;
	    	 ApprovedProjects obj=new ApprovedProjects();
	    	 Project temp=new Project();
	    	 for (Project i:projectsForCoder)
	    	 {
	    		 if(id==i.id)
	    		 {
	    			 actualPrice=i.pricePrediction;
	    			 temp=i;
	    			 break;
	    		 }
	    	 }
	    	 if(actualPrice>givenPrice)
	    	 {
	    		 obj.setProjectForCoder(temp);
	    		 System.out.println("Congrats u got project ");
	    	 }else
	    	 {
	    		 System.out.println("Sorryy u did not project ");
	    	 }
	    }
	    public void approvedProject() {
	    	
	    	 ApprovedProjects obj=new ApprovedProjects();
	    	 ArrayList<Project>pfb=obj.getProjectForBuyer();
	    	 ArrayList<Project>pfc=obj.getProjectForCoder();
	    	 if(pfb.size()==0)
	    	 {
	    		 System.out.println("No project selled till now");
	    	 }else
	    	 {
	    		 pfb.forEach((e)->System.out.println());
	    	 }
	    	 if(pfc.size()==0)
	    	 {
	    		 System.out.println("No project selled till now");
	    	 }else
	    	 {
	    		 pfc.forEach((e)->System.out.println());
	    	 }
	    }
	

}
