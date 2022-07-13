package TostringArrayList;
import java.util.ArrayList;
//import Collections.ArraytoString to add constructor parameters
import Collections.StudenttostringArrayList;
public class Studentdetails {

	public static void main(String[] args) {
		
		ArrayList<StudenttostringArrayList> stu=new ArrayList<StudenttostringArrayList>();
		
		// create object & add constructor parameters inside array list using new 
		stu.add(new StudenttostringArrayList(15, "harsha", "NIE college", "mysore", 570008));
		stu.add(new StudenttostringArrayList(16, "indra", "Jain college", "Banglore", 570023));
		stu.add(new StudenttostringArrayList(54, "madhu", "NIE college", "mumbai", 410008));

		//using class object to iterate
		for(StudenttostringArrayList display:stu) {
			System.out.println(display);
		}


	}

}
