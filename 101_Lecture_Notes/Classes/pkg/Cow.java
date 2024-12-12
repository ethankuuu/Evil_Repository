/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
    
    int numberSpots;
    int moosPerHour;
    String flavor;
    boolean isBeef;
    
    public Cow(){
        numberSpots = 17;
        flavor = "waygu";
        isBeef = false;
        if(isBeef)
            moosPerHour =0;
        else
            moosPerHour = 87;
        
    }
    
    public Cow(int n, String f, boolean b){
        numberSpots = n;
        flavor = f;
        isBeef = b;
        if (isBeef)
            moosPerHour = 0;
        else
            moosPerHour = 87;
        
    }
    public String getFlavor(){
        return flavor;
    }
    public void moo() {
        if(!isBeef) {
            int c = 0;
            while (0<moosPerHour) {
                System.out.println("MOOOOOOO");
                c++;
            }
        }
        else
            System.out.println("Your cow is beef");
    }
}