import java.util.Scanner;

public class areas {
	
    static double shapeArea(double r){
    	//area of circle
    	return r*r*3.14;
    }
    
    static double shapeArea(double l, double b) {
    	//area of rectangle
    	return l*b;
    }
    
    static double shapeArea(double s1, double s2, double s3) {
    	//area of triangle
    	double s = (s1+s2+s3)/2.0;
    	return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] arr = new double[4];
		double a = 0;
		String str;
		
		//read input
	    System.out.println("Enter sides of the shape (space seperated): ");        
	    Scanner sc = new Scanner(System.in);
	    str = sc.nextLine();
        
	    //string to stringArray conversion
	    String num[] = str.split(" ");
	    
	    // adding string values to double array
	    for(int i=0; i<num.length; i++){
	    	arr[i] = Double.valueOf(num[i]);
	    }
	    
	    //checking for which shape using the number of sides in the input
	    if(arr[1] == 0) {
	    	a = shapeArea(arr[0]);
	    	System.out.println("Area of Circle: " + a);
	    }
	    else if(arr[2] == 0) {
	    	a = shapeArea(arr[0], arr[1]);
	    	System.out.println("Area of Rectangle " + a);
	    }
	    else if(arr[3] == 0) {
	    	a = shapeArea(arr[0], arr[1], arr[2]);
	    	System.out.println("Area of Triangle: " + a);
	    }
	    else {
	    	System.out.print("Shape not found!");
	    }
	}

}
