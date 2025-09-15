// Interface for extra features (since Java doesn't support multiple inheritance)

interface Cycle{
	void blowup(String song);
	
	void speedup(int increment);
	
	void speeddown(int decrement);
}
interface Tire{
	void tire_brand();
}

class Avoncycle implements Cycle,Tire{
	int speed=40;
	public void blowup(String song)
	{
		System.out.println("Horning-- "+song);
	}
	public void speedup(int increment)
	{
		System.out.println("speed is: "+(speed+increment));
	}
	public void speeddown(int decrement)
	{
		System.out.println("speed is: "+(speed-decrement));
	}
	public void tire_brand()
	{
		System.out.println("tire brand is MRF");
	}
}

class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avoncycle a=new Avoncycle();
		a.blowup("thujhe dekha tohe janasanam peee pee pee pee ");
		a.speedup(10);
		a.tire_brand();
		

	}

}
