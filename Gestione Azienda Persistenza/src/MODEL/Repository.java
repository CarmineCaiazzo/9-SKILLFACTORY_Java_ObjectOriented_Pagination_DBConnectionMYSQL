package MODEL;

import java.util.ArrayList;

public class Repository {

	
	private ArrayList<Dipendente> a; 

	private static Repository Instance;

	public static Repository getInstance() //CONTROLLO ARRAY VUOTO/PIENO.
	{
		if(Instance==null)
		{
			Instance = new Repository();
		}
		return Instance;
	}

// COSTRUTTORE
	private Repository() 
	{
		a=new ArrayList<Dipendente>();
	}

// GET ARRAY LIST

	public  ArrayList<Dipendente> getArrayList()
	{
		return a;
	}

// SET ARRAY LIST

	public  void setDipendente(Dipendente d)
	{
		a.add(d);
	}

// STAMPA ARRAY LIST

	public  ArrayList<Dipendente> StampaArray(Dipendente d)
	{
		return a;	
	}

// GET SINGOLO OGGETTO
	public Dipendente getDipendente(int i)
	{
		return a.get(i);
	}


	
}
