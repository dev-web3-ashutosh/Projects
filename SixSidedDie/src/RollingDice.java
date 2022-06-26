import java.util.Random;

public class RollingDice {
	
	Random rand = new Random();
	
	public int rollDice() {
		return rand.nextInt(6) + 1;
	}

	public static void main(String[] args) {
		
		RollingDice obj = new RollingDice();
		
		System.out.println(obj.rollDice());

	}

}
