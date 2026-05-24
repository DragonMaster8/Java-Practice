import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String name = scan.nextLine();
		int age = scan.nextInt();
		System.out.println("Hello I am " + name + ", age is " + age);

		scan.close();

	}

}
