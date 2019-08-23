import java.util.Comparator;

public class sortmovie implements Comparator<movie> {

	@Override
	public int compare(movie a, movie b) {
		if(a.price > b.price)
			return -1;
		else if (a.price < b.price)
			return 1;
		
		return 0;
	}
	

}
