
public class tulostinOhjelma {

	public static void main(String[] args) {
		String muuttuja= "Sonja";
		double luku1= 4 ;
		double luku2 = 5; 
		double tulo =luku1*luku2;
		double erotus = luku1 - luku2 ;
		double summa = luku1 + luku2;
		double jako = luku1 / luku2;
		
		System.out.println("Hei olen Tulostin-ohjelma");
		System.out.print("Ohjelman tekijä:");
		System.out.println(muuttuja);
		
		System.out.println("Luku1-muuttujan arvo on "+luku1);
		System.out.println("Luku1-muuttujan arvo on "+luku2);
		
		System.out.println(luku1+" * "+luku2+" = "+ tulo);
		System.out.println(luku1+" - "+luku2+" = "+ erotus);
		System.out.println(luku1+" + "+luku2+" = "+ summa);
		System.out.println(luku1+" / "+luku2+" = "+ jako);
		
	}

}
