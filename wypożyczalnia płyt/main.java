
public class main {

	public static void main(String[] args) {

		listmovie movies = new listmovie();
		movies.putListm(new movie("Shrek","Adamson", 51.99));
		movies.putListm(new movie("Shrek 2","Adamson",50.99));
		movies.putListm(new movie("Shrek 3","Miller", 59.99));
		System.out.println("Before sorting:");
		movies.view();
		movies.sort();
		System.out.println("After sorting:");
		movies.view();
		
	}
	
}
	
