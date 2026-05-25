import java.util.*;

public class lambda    {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add addition= (a,b)->a+b;
		System.out.print(addition.addition(50,50));
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("All elements:");
        list.forEach(n -> System.out.println(n));

        System.out.println("Even elements:");
        list.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
		
		
        List<String> names = Arrays.asList(
                "Alice", "Bob", "Charlie", "Adam");

            System.out.println("All names:");
            names.forEach(name -> System.out.println(name));

            System.out.println("\nNames starting with 'A':");
            names.stream()
                .filter(n -> n.startsWith("A"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
            
            
          

	}

	
}
