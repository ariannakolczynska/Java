import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<organism> list = new ArrayList();
		list.add(new dog(10, "fetching", "male","Morus"));
		list.add(new dog(8, "digging", "male","Kubus"));
		list.add(new cat(14, "mouse", "male", "Julek"));
		list.stream().forEach(System.out::println);
		
		
		
	

	}

}
