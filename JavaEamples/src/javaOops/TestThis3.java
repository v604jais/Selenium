package javaOops;

class Student{
	
	String Name;
	int roll_no;
	float fee;
	
	Student(String Name, int roll_no, float fee){
		        this.Name=Name;
				this.roll_no=roll_no;
				this.fee=fee;
	}
	
	void display(){
		 System.out.println(Name+ " "+roll_no +" "+fee);
	 }
	
}

public class TestThis3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Vishal",11,450f);
		Student s2=new Student("Simran",11,450f);
		s1.display();
		s2.display();
	}

}
