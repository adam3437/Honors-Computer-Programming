public class One_To_One_Hundred
 {
	public static void main(String[] args)
	 {
		int x = 1;
		while(x <= 100)
		 {
			if(x % 2 != 0)
			 {
				System.out.printf(x + " ");
			 }
			if(x % 20 == 0)
			 {
				System.out.println();
			 }
			x++;
		 }
	}
}