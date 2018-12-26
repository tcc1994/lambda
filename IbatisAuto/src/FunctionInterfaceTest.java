import java.util.ArrayList;
import java.util.List;


public class FunctionInterfaceTest {
 
	
	public void test(){
		List<Students> arrayList = new ArrayList<Students>();
		for (int i = 0; i < 10; i++) {
			Students students = new Students();
			students.setCity("beijing---" + i);
			arrayList.add(students);
		}
		
//		Integer count1 = 0;
//		for (Students students : arrayList) {
//		    if (students.getCity().equals("beijing---5")) {
//		    	count1++;
//		    }
//		}
//		等同于以下：
//		Integer count2 = 0;
//		count2 = arrayList.stream().filter((students -> students.getCity().equals("beijing---5"))).count();
		
	}
	
	
	public class Students{
		
		private String city;

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
	}
	
}