package com.company;

interface MyCamera{
	void takesnap();
	void recordvideo();
	//private methods require body ,can't be accessed by any classes.
	private void greet()
	{
		System.out.println("Hello Good Morning");
	}
	//default(requires body) is included so that it will be common for every classes which will implements this interface.
	//it will not cause when class doesnot implements this method
	default void record4k_video() {
		greet();
		System.out.println("Recording 4k video");
	}
	
}
interface Wifi{
	String[] getNetworks();
	void ConnectToNetwork(String[] Networks);
	
	
}
class MyCellPhone{
	void Calling(long PhoneNumber)
	{
		System.out.println("Calling to "+PhoneNumber);
	}
	void pickcall() {
		System.out.println("Connecting...");
	}
}
class MySmartPhone extends MyCellPhone implements MyCamera, Wifi{
	public void takesnap() {
		System.out.println("Taking Snap");
	}
	public void recordvideo() {
		System.out.println("Recording video");
	}
	public String[] getNetworks()
	{
		System.out.println("Getting List Of Networks");
		String[] Networks= {"RedmiY3","Redmi9","OnePlus"};
		return Networks;
	}
	public void ConnectToNetwork(String[] Networks)
	{
		System.out.println("Conneting to Network..."+Networks[0]);
	}
}


class Defaultmethod_Inheritance {

	public static void main(String[] args) {
		MySmartPhone sm=new MySmartPhone();
		sm.record4k_video();
		String[] Networks=sm.getNetworks();
		for(String item:Networks)
		{
		System.out.println("-->"+item);	
		}
		sm.ConnectToNetwork(Networks);
		sm.Calling(726287492);
		sm.pickcall();
	}

}
