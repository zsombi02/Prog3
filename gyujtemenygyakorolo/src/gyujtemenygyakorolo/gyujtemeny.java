package gyujtemenygyakorolo;

import java.io.*;
import java.util.*;

import javax.swing.table.AbstractTableModel;

public class gyujtemeny extends AbstractTableModel
{
	List<jatekos> jatekosok = new ArrayList<>();

	
	
	
	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return jatekosok.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Object getValueAt(int i, int j) {
		// TODO Auto-generated method stub
		jatekos jatekos = jatekosok.get(i);
		switch(j)
		{
		case 1 :return jatekos.getnev();
		case 2 :return jatekos.getnehezseg();
		case 3 :return jatekos.getido();
		default : return null;
		}
			
	}
	
	public void setValue(String adat, int i, int oszlop)
	{
		jatekos s=jatekosok.get(i);
		//int adatint = 
		
		
			switch(oszlop)
			{	
			case 1: s.setname(adat);
			//case 2: s.setnehezseg(Integer.parseInt(adat));
			//case 3: s.setnehezseg(Integer.parseInt(adat));
			//default: System.out.println("vmi nem jo itt");
			}
			jatekosok.set(i, s);
		
	}
	
	public void hozzaad(String nev, int nehezseg, int ido)
	{
		jatekosok.add(new jatekos(nev,nehezseg,ido));
		
	}
	
	public void kiir()
	{
		for( int i = 0; i != jatekosok.size() ; i++)
		{
		 System.out.println(getValueAt(i, 1) + " " + getValueAt(i, 2) + " " + getValueAt(i, 3));
			
		}
		
	}
	

}
