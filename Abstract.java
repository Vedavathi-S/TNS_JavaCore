//Abstract class and methods gives a rough  idea for developers what should be included
//in abstract class we can have concrete and abstract methods
//You can extend only one class in Java. Use interfaces for multiple inheritance, or have Hardware_features be an interface.
// Interface for extra features (since Java doesn't support multiple inheritance)

abstract class Phone{
	abstract void greet();
	
	abstract void brandname();
	
	void isSmartphone(Boolean answer)
	{
		if(answer)
		{
			System.out.println("yes it is a smartphone");
		}
		else {
			System.out.println("no it is not a smartphone");
		}
	}
	
}
//we have to inherit every abstract methods in child classes
class Hardware_features{
	public void chip_ver(){
		System.out.println(10);
	}
}
//class Samsung extends Phone,Hardware_features(to have this we should use interface )

class Samsung extends Phone{
	public void greet()
	{
		System.out.println("Hello folks");
	}
	public void brandname()
	{
		System.out.println	("samsung");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s=new Samsung();
		s.greet();
		//Dynamic method dispatch
		Phone p=new Samsung();
		p.isSmartphone(true);
		

	}

}
