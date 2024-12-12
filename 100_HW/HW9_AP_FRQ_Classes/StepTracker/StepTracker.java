import java.util.ArrayList;

public class StepTracker{
    private int minSteps;
    
    private int Adays;
    
    private int days;
    
    private int avg;
    
    public int stepTracker(int minSteps){
        this.minSteps = minSteps;
        this.Adays = 0;
        this.days = 0;
        this.avg = 0;
    }
    public void addDailySteps(int steps){
        if(steps >= minSteps){
            Adays++;
            days++;
            avg = ((avg/days) + steps)*days;
        }
        else{
            days++;
            avg = ((avg/days) + steps)*days;
        }
    }
    public double averageSteps(){
        return avg;
    }
    public int activeDays(){
        return Adays;
    }
    
}
public class StepTracker {
    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays()); // 0
        System.out.println(tr.averageSteps()); // 0.0
        
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays()); // 0
        System.out.println(tr.averageSteps()); // 7000.0
        
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays()); // 1
        System.out.println(tr.averageSteps()); // 9000.0
        
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays()); // 2
        System.out.println(tr.averageSteps()); // 10222.2
    }
}