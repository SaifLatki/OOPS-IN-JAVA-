
class Shape{
	String color;
	
	Shape(String color)
	{
		this.color=color;
	}
	
	double getArea()
	{
		return 0;
	}
}
	class Circle extends Shape{
		double radius;
		Circle(String color,double radius)
		{
			super(color);
			this.radius=radius;
		}
	double getArea()
	{
		double result;
		result=3.14*(radius*radius);
		return result;
	}
}
	
	class Rectangle extends Shape{
		double width;
		double height;
		
		Rectangle(String color, double width,double height)
		{
			super(color);
			this.width=width;
			this.height=height;
		}
		
	double getArea()
		{
			return width*height;
		}
}
 
class HelloWorld {
    public static void main(String[] args) {
        Circle c=new Circle("Black",2.4);
        Rectangle r=new Rectangle("Blue",2.5,1.5);
        System.out.println("Area of Circle is= "+c.getArea());
        System.out.println("Area of Rectangle is= "+r.getArea());
    }
}
