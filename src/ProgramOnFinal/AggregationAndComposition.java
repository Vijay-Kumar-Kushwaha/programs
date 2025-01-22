package ProgramOnFinal;

class Charger{
	private String brand;
	private float voltage;
	public Charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}	
}
class Os{
	private String brand;
	private int size;
	
	public Os(String brand, int size) {
		super();
		this.brand = brand;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public int getSize() {
		return size;
	}	
}

class Mobile{
	Os o = new Os("Android OS", 2);
	void hasA(Charger c)	{
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
public class AggregationAndComposition {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		Charger c = new Charger("Samsung Charger", 12.5f);
		System.out.println(m.o.getBrand());
		System.out.println(m.o.getSize());
		m.hasA(c);
		m= null;
//		System.out.println(m.o.getBrand());
//		System.out.println(m.o.getSize());
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
		
	}
}
