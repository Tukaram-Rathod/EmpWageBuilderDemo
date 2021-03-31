package empwagebuilderdemo;
public class EmpWageBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to employye wage builder program:");

		int IS_PRESENT = 1;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		if (empCheck == IS_PRESENT)
			System.out.println("Employee Is Present"); 
		else
			System.out.println("Employee Is Absent");
		
	}
}
