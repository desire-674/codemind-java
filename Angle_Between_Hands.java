import java.util.Scanner;

public class ClockAngleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
         String[] timeParts = time.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);
        
        double hourAngle = (hour % 12 + minute / 60.0) * 30;  // 360 degrees divided by 12 hours
        double minuteAngle = minute * 6;  // 360 degrees divided by 60 minutes
        
        double angleBetweenHands = Math.abs(hourAngle - minuteAngle);
 
        if (angleBetweenHands > 180) {
            angleBetweenHands = 360 - angleBetweenHands;
        }
        
        System.out.println( angleBetweenHands);
        
    }
}
