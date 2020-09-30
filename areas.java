
import java.util.Scanner;
public class areas {

	public static void main(String[] args) {
		
		
		        int r;
		        double pi = 3.14, area;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter radius of circle:");
		        r = s.nextInt();
		        area = pi * r * r;
		        System.out.println("Area of circle:"+area);

		        int length, breadth;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the length of the rectangle ::");
		        length = sc.nextInt();
		        System.out.println("Enter the breadth of the rectangle ::");
		        breadth = sc.nextInt();
		        area = length* breadth;
		        System.out.println("Area of the rectangle is ::"+area); 
		        Scanner scanner = new Scanner(System.in);

		       
                 int height,base;
		        System.out.println("Enter the height of the triangle ::");
		        height = sc.nextInt();
		        System.out.println("Enter the base of the triangle ::");
		        base = sc.nextInt();
		        area = (height* base);
		        System.out.println("Area of the triangle is ::"+area);
		       
		    }            
}
