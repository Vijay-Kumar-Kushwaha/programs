package ProgramOnFinal;
class Day37{
//	final float PI;
//	int a;
//	PI = 3.142;
	void disp() {
		final int b;
		b=10;
//		b = 20;   // we cannot again reassign the value to the final variable
//		PI = 4.142;
//		System.out.println(PI);
		System.out.println(b);
	}
}
public class Final {
	public static void main(String[] args) {
	Day37 d = new Day37();
	d.disp();
	}

}
