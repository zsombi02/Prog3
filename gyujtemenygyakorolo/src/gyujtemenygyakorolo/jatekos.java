package gyujtemenygyakorolo;

public class jatekos {

	String nev;
	int nehezseg;
	int ido;
	
	public String getnev()
	{return this.nev;}
	
	public int getnehezseg()
	{return this.nehezseg;}
	
	public int getido()
	{return this.ido;}
	
	public void setname(String name)
	{
		this.nev = name;
	}
	
	public void setnehezseg(int nehez)
	{
		this.nehezseg = nehez;
	}
	
	public void setido(int idoo)
	{
		this.ido = idoo;
	}
	
	public jatekos(String name, int nehez, int time)
	{
		this.nev = name;
		this.nehezseg = nehez;
		this.ido = time;
		
	}
	
}
