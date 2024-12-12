
package pkg;

public class BaseClass{
    
    
    String role;
    
    public BaseClass(){
        role = "No Role";
        
    }
    
    public BaseClass(String b){
        if (b == "Warrior"){
        	System.out.println("You choose Warrior congrats");
        	role = b;
        }
        if (b == "Rogue"){
        	System.out.println("You choose Rogue congrats");
        	role = b;
        } 
        if (b == "Wizard"){
        	System.out.println("You choose Wizard congrats");
        	role = b;
        } 
        else{
        	System.out.println("You choose an invalid role");
        	role = ("No Role");
        }
    }
    public String getRole(){
        return role;
    }
}