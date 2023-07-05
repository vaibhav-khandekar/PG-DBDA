import java.util.HashMap;

public class JavaHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> Employees = new HashMap<>();
		Employees.put(26,"vaibhav");
		Employees.put(21, "John");
		Employees.put(29, "Mary");
		Employees.put(23, "Alan");
		
		// if key is repeated then data will be updated
		Employees.put(29, "Aman");
		
		System.out.println(Employees.size());
		
		System.out.println(Employees);
		
		System.out.println(Employees.get(23));
		
		//System.out.println(Collections.singletonList(Employees)); // method 2
	}
}