package String;

public class CharTOString {
	public static void main(String[] args) {
		String s1 = new String("TAP");
		System.out.println(s1);
		s1.concat("Academy");
		System.out.println(s1);
		String s2 = s1.concat("Academy");
		System.out.println(s2);
	}
}
