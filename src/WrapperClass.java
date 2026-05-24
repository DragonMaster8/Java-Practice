import java.util.ArrayList;

class WrapperClass {
	public static void main(String[] args) {

		byte b = 1;
		Byte byteObj = Byte.valueOf(b);

		int i = 10;
		Integer intObj = Integer.valueOf(i);

		float f = 18.6f;
		Float floatObj = Float.valueOf(f);

		double d = 250.5;
		Double doubleObj = Double.valueOf(d);

		char c = 'a';
		Character charObj = c; // autoboxing

		System.out.println("Wrapper Objects:");
		System.out.println(byteObj);
		System.out.println(intObj);
		System.out.println(floatObj);
		System.out.println(doubleObj);
		System.out.println(charObj);

		// Unboxing
		byte bv = byteObj;
		int iv = intObj;
		float fv = floatObj;
		double dv = doubleObj;
		char cv = charObj;

		System.out.println("\nUnwrapped values:");
		System.out.println(bv);
		System.out.println(iv);
		System.out.println(fv);
		System.out.println(dv);
		System.out.println(cv);
		
		
		System.out.println("---------------------------------");

		char ch1 = 'a';

		// Autoboxing: char -> Character
		Character c1 = ch1;

		ArrayList<Integer> list = new ArrayList<>();
		// Autoboxing: int -> Integer
		list.add(25);
		System.out.println(list.get(0));

		Character ch11 = 'a';
		// Unboxing: Character -> char
		char c11 = ch1;

		ArrayList<Integer> list1 = new ArrayList<>();
		list.add(24);
		// Unboxing: Integer -> int
		int num = list.get(0);

		System.out.println(num);
	}
}