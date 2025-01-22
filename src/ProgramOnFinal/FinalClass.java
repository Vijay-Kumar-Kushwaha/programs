package ProgramOnFinal;

class Parentt{
	void disp() {
		System.out.println("HI");
	}
}
final class Childd extends Parentt {
	
	
}
public class FinalClass {
	public static void main(String[] args) {
		Childd c = new Childd();
		c.disp();
	}

}
