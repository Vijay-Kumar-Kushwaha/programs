package String;

public class JavajavaHeapArea {

	public static void main(String[] args) {
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		if(s1 == s2) {
			System.out.println("Equal");
		}
		else{
			System.out.println("Unequal");
		}
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("unequal");
		}
	}

}
