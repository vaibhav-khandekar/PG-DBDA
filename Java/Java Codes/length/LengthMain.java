package length;

import java.util.Scanner;

class Length{
	int cm ;
	int mm;
	
	public Length() {
		
	}

	public Length(int cm, int mm) {
		super();
		this.cm = cm;
		this.mm = mm;
	}
	
	public void show() {
		System.out.println("Length : "+this.cm+"cm"+this.mm+"mm");
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cm : ");
		cm = sc.nextInt();
		System.out.println("Enter mm : ");
		mm = sc.nextInt();
	}
	
	public Length add(Length l) {
		Length res = new Length();
		res.mm = mm+l.mm;
		res.cm = cm+l.cm;
		
		// 1 cm = 10 mm
	
		if(res.mm >=10) {
			res.cm = res.cm + res.mm / 10;
			res.mm = res.mm % 10;
		}
		return res;
	}
}
public class LengthMain {

	public static void main(String[] args) {
		
		Length lt = new Length();
		lt.accept();
		
		Length lt2 = new Length();
		lt2.accept();
		
		lt.show();
		lt2.show();
		
		Length sum = lt.add(lt2);
		
		sum.show();
	}

}
