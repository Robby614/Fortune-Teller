
public class ScratchPad {

	private static int count;

	public static void main(String[] args) {
		
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum < 100); {
			if (beerNum == 1)  {
				word = "bottle";
			}
			
			System.out.println(beerNum + "" + word + "of beer on the wall");
			System.out.println(beerNum + "" + word + "of beer.");
			System.out.println("Take on down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
			
			if (beerNum > 0) {
				System.out.println(beerNum + "" + word + " of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall.");
			}
		
	
	}
	}
}
