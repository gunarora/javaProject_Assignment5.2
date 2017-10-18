package javaProject_Assignment5;

import java.text.DecimalFormat;

//Package declaration is mandatory
/*Write a programme to calculate Area and Perimeter of Circle, Rectangle and Triangle*/

//Abstract class
public abstract class Figure {
	//declare variable
	double dim1;	
	//abstract methods
	abstract void findArea(); 
	abstract void findPerimeter();
}

//extend Abstract class to calculate Area and Perimeter of Circle
class Circle extends Figure{
	//declare variables
	double perimeter;
	 int r = 6;
	 double pi = 3.14;	 
	 //Implement Area method 
	public void findArea(){
		dim1 = pi*r*r; 
		//Convert value of two places of points
		System.out.println("Area of circle = " + String.format( "%.2f",dim1));
	}	
	//logic applied to calculate Perimeter
	public void findPerimeter() {
		 
	        perimeter = 2 * pi * r;
	        System.out.println("Perimeter of circle:"+perimeter);
	}	
}

//extend Abstract class to calculate Area and Perimeter of Rectangle
class Rectangle extends Figure {
	//declare variables
	double perimeter;	
	double length;
    double breadth;
    //Parameterized Constructor and save length, breadth into variables
    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }    
  //Implement Area method 
    public void findArea(){
    	dim1 = length * breadth; 
    	System.out.println("Area of Rectangle = " + dim1);
    }    
  //logic applied to calculate Perimeter
    public void findPerimeter() {
		perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle= " + perimeter);
	}
}

//extend Abstract class to calculate Area and Perimeter of Triangle
class Triangle  extends Figure{
  //declare variables
	double perimeter;	
	int s1 = 3, s2=4, s3=5;
	double s4;	
	//logic applied to calculate Area
	public void findArea(){
		s4 = (s1 + s2 + s3 )/ 2 ;
        dim1 = Math.sqrt(s4 * (s4 - s1) * (s4 - s2) * (s4 - s3));
        System.out.print("Area of Triangle is:"+dim1);
	}	
	//logic applied to calculate Perimeter
	public void findPerimeter() {
		perimeter = s1 + s2 + s3;
		System.out.println( "\nPerimeter of Triangle = " + perimeter);
	}	
}

//class - implementing main method
class FindRectangleArea
{
	// Main method started
    public static void main(String arg[])
    {
    	//object creating of rectangle
        Rectangle rect = new Rectangle(10, 5);
        //print length and breadth 
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        //call method of rectangle
        rect.findArea();
        rect.findPerimeter();
        //object creating of circle
        Circle cir = new Circle();
       //call method of circle      
        cir.findArea(); 
        cir.findPerimeter();
      //object creating of triangle
        Triangle tr = new Triangle();
        //call method of triangle        		
        tr.findArea();
        tr.findPerimeter();        		
    }
}
