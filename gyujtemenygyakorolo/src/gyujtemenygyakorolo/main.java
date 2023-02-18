package gyujtemenygyakorolo;

public class main {
	
	
	static gyujtemeny adat = new gyujtemeny();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		adat.hozzaad("jozsi", 1, 40);
		adat.hozzaad("pista", 2, 700);
		adat.kiir();
		
		adat.setValue("Maris", 0, 1);
		
		System.out.println("es az uj adatok");
		adat.kiir();
		//System.out.println(adat.getRowCount());
		
	}

}
