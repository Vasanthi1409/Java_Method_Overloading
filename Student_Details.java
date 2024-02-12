package Method_Overloading.com;

public class Student_Details {
	private void student_Info(String name, int age, char s) {
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student Gender: " + s);
	}

	private void student_Info(int doorno, String address, int pincode) {
		System.out.println("Student address along with pincode: " +doorno+", "+ address + "-" + pincode);
	}

	private void student_Info(int fees, String Fname, char i, long accno) {
		System.out.println("Student Fees: " + fees);
		System.out.println("Student Father name and his Initial: " + Fname + "." + i);
		System.out.println("Student Bank Account Number: " + accno);
	}

	public static void main(String[] args) {
		Student_Details obj = new Student_Details();
		obj.student_Info("Harish", 20, 'M');
		obj.student_Info(13, "Ambal Nagar, Kovur, Chennai", 600128);
		obj.student_Info(50000, "Mugilan", 'S', 512345678342l);
	}
}
