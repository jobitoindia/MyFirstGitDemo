package AddtoCart;

import java.util.jar.JarOutputStream;

import javax.swing.plaf.basic.BasicListUI;

public class JobitoStudents {
	
	String studentName;  //10 bytes
	String studentAddress;  //10 bytes
	int studnetMobNo;  //4 bytes
	String studentPanCard;   //10 bytess
		
	public  void set() {
		
	}
	
	public void get() {
		
	}

	public static void main(String[] args) 
	{
		JobitoStudents student1=new JobitoStudents();  // record 1
		student1.studentName="ABHISHEK ";
		student1.studentAddress="pune";
//		student1.studnetMobNo=123;
//		student1.studentPanCard="abc123";
//		
		System.out.println("the name of first student is: "+student1.studentName);
		
		
		JobitoStudents student2=new JobitoStudents();   //record 2
//		student2.studentName="SNEHA";
//		student2.studentAddress="pune";
//		student2.studnetMobNo=67687;
//		student2.studentPanCard="abnmbv123";
//		
		System.out.println("the name of second student is: "+student2.studentName);		
		JobitoStudents student3=new JobitoStudents(); 
		

		
		
		
		
		
		
		System.out.println("");
		
	}

}
