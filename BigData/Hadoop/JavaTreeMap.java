import java.util.TreeMap;

public class JavaTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer,String> Employees = new TreeMap<>();
		Employees.put(24,"vaibhav");
		Employees.put(21, "John");
		Employees.put(26, "Mary");
		Employees.put(23, "Alan");
		
		// if key is repeated then data will be updated
		Employees.put(21, "Aman");
		
		System.out.println(Employees.size());
		
		System.out.println(Employees);
		
	}
}