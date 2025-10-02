//Please comment other exercises to run a specific one. To make 





public class Main {
public static void attemptToChangePrimitive(int val) {
System.out.println("Inside method, parameter 'val' starts as: " + val);
val = 99; // Local change
System.out.println("Inside method, parameter 'val' is now: " + val);
}
public static void resetPoint(Point p) {
    p = new Point(0, 0); 

}

// Used for Exercise 5
public static int sumCoordinates(Point... points) {
    int sum=0;
    for (Point p : points) {
        sum += p.x;
    }
    return sum;
// Implementation needed for Exercise 5
//return 0;
}
public static void main(String[] args) {

//Ex 1
//---------------------------------------------------------------
    Point startPoint = new Point (10,20);
System.out.println("Direct access to x: " + startPoint.x);
        startPoint.move(5, -3);
        startPoint.printState();

//---------------------------------------------------------------
//Ex 2
        int originalValue = 50;
        attemptToChangePrimitive(originalValue);
        System.out.println(originalValue); // → 50

        Point refPoint = new Point(8, 9);
        resetPoint(refPoint);
        refPoint.printState(); 

//---------------------------------------------------------------
//Ex 3
Point p = new Point(); 
        p.printState();  
        
  //---------------------------------------------------------------      
 //Ex 4
 Microwave mw = new Microwave(800, 60);
 System.out.println("Microwave created with power: " + mw.powerLevel);
 System.out.println("Max time: " + mw.maxTime);       

//---------------------------------------------------------------
//Ex 5
 Point a = new Point(1, 2);
Point b = new Point(3, 4);
Point c = new Point(5, 6);
int sum1 = sumCoordinates(a, b, c);
System.out.println("Sum of x values (individual): " + sum1);
Point[] pointsArray = { a, b, c };
int sum2 = sumCoordinates(pointsArray);
System.out.println("Sum of x values (array): " + sum2);  
//---------------------------------------------------------------

//Ex 6
//---------------------------------------------------------------
 mw = new Microwave(700, 90);
mw.printDescription();

//---------------------------------------------------------------
//Ex 7
Device d1 = new Device(500);
Microwave m1 = new Microwave(1000, 120);
Device polyDevice;
polyDevice = m1;
polyDevice.printDescription();

//---------------------------------------------------------------
//Ex 8
if (polyDevice instanceof Microwave) {
     mw = (Microwave) polyDevice;  // Downcast safely
    mw.heatFood();                          // Now you can call heatFood()
} else {
    System.out.println("polyDevice is not a Microwave.");
}
}
}

