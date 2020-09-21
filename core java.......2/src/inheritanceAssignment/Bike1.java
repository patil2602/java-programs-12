package inheritanceAssignment;

public class Bike1 extends Vehicle1 {
	String bname;
	int bprice;
	int discountRate=2000;
	int fprice;
	
	Bike1()
	{
		bname="pulsar";
		bprice=30000;
		this.discountRate=discountRate;
	}
	
	void discount()
	{
		fprice=this.bprice-this.discountRate;
	}
	void display()
	{
		System.out.println("name of bike"+bname);
	//	System.out.println("id of vehicle"+bid);
		System.out.println("fprice of bike"+fprice);
	}
	

}
