package ex_18052024_Encapsulation;

public class Student_mainclass {

	public static void main(String[] args) 
	{
		Student S = new Student("Jhon", 24);
		
		System.out.println("Student name is: " + S.getstd_name());
		System.out.println("Student age is: " + S.getstd_age());
		
		S.setstd_age(27);
		System.out.println("updated Student age is: " + S.getstd_age());
		
		
		System.out.println(" ");
		
		S.add_grade(110);
		
		S.add_grade(90);
		S.add_grade(80);
		S.add_grade(70);
		System.out.println("Student grades are added: " + S.getstd_grades());
		
		
        S.remove_grade(80);
		System.out.println("Student grades are removed: " + S.getstd_grades());
		
		
	}

}
