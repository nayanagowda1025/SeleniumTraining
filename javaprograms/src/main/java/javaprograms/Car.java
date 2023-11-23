package javaprograms;

public class Car {
	String color;
	double price;
    public Car(String color,double price)
    {
    	this.color=color;
    	this.price=price;
    	
    }
   
	public static void main(String[] args) {
		Car c=new Car("red",5000000);
		System.out.println(c.color);
		System.out.println(c.price);

	}

}
