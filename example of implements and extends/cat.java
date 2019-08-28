
public class cat extends organism implements cats {//klasy, interfejsy z duzej litery

	public cat(int sleppingTime, String kindOfFun, String gender, String name) {
		super(sleppingTime, kindOfFun, gender, name);

	}

	public String toString() {
		return "Name: " + name + " Gender: " + gender + " Kind of fun: " + kindOfFun + " Type of food: " + eat
				+ " Sound: " + sound + " Slepping time: " + sleppingTime + "h";
	}

}
