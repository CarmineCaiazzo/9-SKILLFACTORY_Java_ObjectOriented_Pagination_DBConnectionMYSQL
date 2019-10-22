package VIEW;

import java.util.*;
import MODEL.*;

//import javax.swing.*;  //PACKAGE SWING - APPLICATION ONLY JAVA

public class View {
	
	Scanner s=new Scanner(System.in);
   
	
// 1 - CREATE
	
    public Dipendente selectObject(Dipendente d, int id) 
    {
    
 
   	 if(d instanceof Dirigente) 
   	 {
   		 Dirigente other=(Dirigente) d;
   		 
   		 other.setID(id);
   		 other.setNome(leggiStringa("Insersci Nome --> "));
	     other.setCognome(leggiStringa("Insersci Cognome --> "));
	     other.setEta(leggiIntero("Insersci Età --> "));
	     other.setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale --> "));
	     other.setTitoloStudio(leggiStringa("Inserisci Titolo di Studio --> "));
	     other.setStipendio(leggiDouble("Inserisci Stipendio -->"));
	     other.setResponsabilitaArea(leggiStringa("Inserisci Responsabilità Area --> "));
         other.setLivelloFunzionale(leggiStringa("Inserisci Livello Funzionale --> "));
         
      
  
   	 }
   	 else if(d instanceof Manager) 
   	 {
   		  Manager other=(Manager) d;
   		 
   		 other.setID(id);
   		 other.setNome(leggiStringa("Insersci Nome --> "));
	     other.setCognome(leggiStringa("Insersci Cognome --> "));
	     other.setEta(leggiIntero("Insersci Età --> "));
	     other.setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale --> "));
	     other.setTitoloStudio(leggiStringa("Inserisci Titolo di Studio --> "));
	     other.setStipendio(leggiDouble("Inserisci Stipendio -->"));
	     other.setResponsabilitaArea(leggiStringa("Inserisci Responsabilità Area --> "));

	 
   	 }
   	 else if(d instanceof Dipendente) 
   	 {
   		 Dipendente other=(Dipendente) d;
   		 
   		 other.setID(id);
   		 other.setNome(leggiStringa("Insersci Nome --> "));
	     other.setCognome(leggiStringa("Insersci Cognome --> "));
	     other.setEta(leggiIntero("Insersci Età --> "));
	     other.setRuoloAziendale(leggiStringa("Inserisci Ruolo Aziendale --> "));
	     other.setTitoloStudio(leggiStringa("Inserisci Titolo di Studio --> "));
	     other.setStipendio(leggiDouble("Inserisci Stipendio -->"));
	   
   	 }
   
   	 return d;
   
}
    
// 2 - READ
	
    public Dipendente readObject(Dipendente d) 
    {
    	
   	 if(d instanceof Dirigente)
   	 {
   		 Dirigente other=(Dirigente) d;
   		 
   	     System.out.println("Nome --> " + other.getNome());
   	     System.out.println("Cognome --> " + other.getCognome());
   	     System.out.println("Eta --> " + other.getEta());
   	     System.out.println("ID --> " + other.getID());
   	     System.out.println("Ruolo Aziendale --> " + (other.getRuoloAziendale()));
   	     System.out.println("Titolo di Studio --> " + (other.getTitoloStudio()));
   	     System.out.println("Stipendio --> " + (other.getStipendio()+"€"));
   	     System.out.println("Area --> " + (other.getResponsabilitaArea()));
   	     System.out.println("Livello funzionale --> " + (other.getLivelloFunzionale()));
     }
   	 else if(d instanceof Manager) 
   	 {
   		 Manager other=(Manager) d;
   		 
   		 System.out.println("Nome --> " + other.getNome());
   	     System.out.println("Cognome --> " + other.getCognome());
   	     System.out.println("Eta --> " + other.getEta());
   	     System.out.println("ID --> " + other.getID());
   	     System.out.println("Ruolo -->" + (other.getRuoloAziendale()));
   	     System.out.println("Titolo di Studio --> " + (other.getTitoloStudio()));
   	     System.out.println("Stipendio -->" + (other.getStipendio()+"€"));
   	     System.out.println("Area --> " + (other.getResponsabilitaArea()));
   		 
   	 }
   	 else if(d instanceof Dipendente) 
   	 {
   		 Dipendente other=(Dipendente) d;
   		 
   		 System.out.println("Nome:" + other.getNome());
   	     System.out.println("Cognome:" + other.getCognome());
   	     System.out.println("Eta:" + other.getEta());
   	     System.out.println("ID:" + other.getID());
   	     System.out.println("Ruolo:" + (other.getRuoloAziendale()));
   	     System.out.println("Titolo di Studio:" + (other.getTitoloStudio()));
   	     System.out.println("Stipendio:" + (other.getStipendio()+"€"));        	
   	 }
   	 
   	 return d;

 }
    
// 2 ALL - READ
    
    public void readObjectAll(ArrayList<Dipendente> a)
    {
    	for(int i=0; i<a.size(); i++)
    	{
    		System.out.println(a.get(i));
    	}
    }
    
// 3 - UPDATE
    
    public Dipendente updateObject(Dipendente d) 
    {	


//DIRIGENTE
    	
   	if(d instanceof Dirigente)
   	{	
   		Dirigente other=(Dirigente) d;
  
//|-----------------------------------------------------------------------------------------|  	
   		
   //Name	
   		
   	System.out.print("Nome ["+other.getNome()+"] :");
   	String nome=leggiStringa(" New Name --> ") ; 
		   if(nome.equals(""))
		   {
			   System.out.println("Non modificato");
		   }
		   else
		   {
			   other.setNome(nome);
		   }
		   
//|-----------------------------------------------------------------------------------------|
		   
    //Surname
		   
   	System.out.print("Cognome ["+other.getCognome()+"] :");
    String cognome=leggiStringa(" New Surname --> ") ; 
    
			if(cognome.equals(""))
			{
				System.out.println("Non modificato");
			}
		    else 
		    { 
		    	other.setCognome(cognome);
		    }
			
//|-----------------------------------------------------------------------------------------|	 
			   
	//Age
			
	System.out.print("Eta ["+other.getEta()+"] :");
    String eta=leggiStringa(" New Age --> ") ; 
    
		   if(eta.equals("")) 
		   {
			   System.out.println("Non modificato");
		   }
		   else 
		   {
			   other.setEta(Integer.parseInt(eta));
		   }
		   		    
//|-----------------------------------------------------------------------------------------|
			   
	//Rule
		    
	System.out.print("Ruolo ["+other.getRuoloAziendale()+"] :");
    String ruolo=leggiStringa(" New Company Rule --> ") ; 
		   if(ruolo.equals("")) 
		   {
			   System.out.println("Non modificato");
		   }
		   else 
		   {
			   other.setRuoloAziendale(ruolo);
		   }
		   
//|-----------------------------------------------------------------------------------------|
			   
	//Qualification
		   
	System.out.print("Titolo di studio ["+other.getTitoloStudio()+"] :");
    String titolo=leggiStringa(" New Qualification --> ") ; 
		   if(cognome.equals("")) 
		   {
			   System.out.println("Non modificato");
		   }
		   else 
		   {
			   other.setTitoloStudio(titolo);
		   }
		   
//|-----------------------------------------------------------------------------------------|
			  
	//Salary
		   
    System.out.print("Stipendio ["+other.getStipendio()+"] :");
    String stipendio=leggiStringa(" New Salary --> ") ; 
		   if(stipendio.equals("")) 
		   {
			   System.out.println("Non modificato");
		   }
		   else 
		   {
			   other.setStipendio(Double.parseDouble(stipendio));
		   }
			   
//|-----------------------------------------------------------------------------------------|
			   
	//Area of responsibility
		   
    System.out.print("Area responsabilità ["+other.getResponsabilitaArea()+"] :");
    String area=leggiStringa(" New Area of Responsibility --> ") ; 
		   if(area.equals("")) 
		   {
			   System.out.println("Non modificato");
		   }
		   else 
		   {
			   other.setResponsabilitaArea(area);
		   }
		   
//|-----------------------------------------------------------------------------------------|
			   
	//Level
		   
	System.out.print("Livello funzionale ["+other.getLivelloFunzionale()+"] :");
    String  livello=leggiStringa(" New Functional Level --> ") ; 
			if(livello.equals(""))
			{
				System.out.println("Non modificato");
			}
		    else 
		    {
		    	other.setLivelloFunzionale(livello);
		    }
			   
   	 }
   
//|-----------------------------------------------------------------------------------------|
   	
//MANAGER
   	
   	 else if(d instanceof Manager) 
   	 {
   		  Manager other=(Manager) d;

//|-----------------------------------------------------------------------------------------|
   		  
   //Name
   		  
   System.out.print("Nome ["+other.getNome()+"] :");
   String nome=leggiStringa(" New Name -->  ") ; 
  		  if(nome.equals("")) 
  			   {
  				   System.out.println("Non modificato");
  			   }
  			   else 
  			   {
  				   other.setNome(nome);
  			   }
  			   
//|-----------------------------------------------------------------------------------------|
  			   
   //Surname
  			   
   System.out.print("Cognome ["+other.getCognome()+"] :");
   String cognome=leggiStringa(" New Surname --> ") ; 
   		  if(cognome.equals("")) 
   		  {
   			  System.out.println("Non modificato");
   		  }
     	  else 
     	  {
     		  other.setCognome(cognome);
     	  }
   		  
//|-----------------------------------------------------------------------------------------|
   			   
   //Age
   		  
   System.out.print("Eta ["+other.getEta()+"] :");
   String eta=leggiStringa(" New Age --> ") ; 
          if(eta.equals("")) 
          {
        	  System.out.println("Non modificato");
          }
          else 
          {
        	  other.setEta(Integer.parseInt(eta));
          }
   		  
//|-----------------------------------------------------------------------------------------|
   			   
   //Rule
   		  
   System.out.print("Ruolo ["+other.getRuoloAziendale()+"] :");
   String ruolo=leggiStringa(" New Company Rule --> ") ; 
          if(ruolo.equals("")) 
          {
        	  System.out.println("Non modificato");
          }
      	  else 
      	  {
      		  other.setRuoloAziendale(ruolo);
      	  }
          
//|-----------------------------------------------------------------------------------------|
    			   
   //Qualification
          
   System.out.print("Titolo di studio ["+other.getTitoloStudio()+"] :");
   String titolo=leggiStringa(" New Qualification --> ") ; 
   		  if(cognome.equals("")) 
   		  {
   			  System.out.println("Non modificato");
   		  }
     	  else 
     	  {
     		  other.setTitoloStudio(titolo);
     	  }
   		  
//|-----------------------------------------------------------------------------------------|
   			   
   //Salary
   		  
   System.out.print("Stipendio ["+other.getStipendio()+"] :");
   String stipendio=leggiStringa(" New Salary --> ") ; 
          if(stipendio.equals("")) 
          {
        	  System.out.println("Non modificato");
          }
          else 
          {
        	  other.setStipendio(Double.parseDouble(stipendio));
          }
    			   
//|-----------------------------------------------------------------------------------------|
    			   
   //Area of responsibility
   System.out.print("Area responsabilità ["+other.getResponsabilitaArea()+"] :");
   String area=leggiStringa("New Area Of Responsability --> ") ; 
   	      if(area.equals("")) 
   	      {
   	    	  System.out.println("Non modificato");
   	      }
          else 
          {
        	  other.setResponsabilitaArea(area);  
          }
    }
   	
//|-----------------------------------------------------------------------------------------|
   	
//DIPENDENTE
   	
   	 else if(d instanceof Dipendente)
   	 {
   		 Dipendente other=(Dipendente) d;
   		 
//|-----------------------------------------------------------------------------------------|
   		 
   //Name
   		 
   System.out.print("Nome ["+other.getNome()+"] :");
   String nome=leggiStringa("New Name --> ") ; 
   	      if(nome.equals("")) 
 		  {
 			  System.out.println("Non modificato");
 		  }
   		  else 
   		  {
   			  other.setNome(nome);
   		  }
 		   
//|-----------------------------------------------------------------------------------------|
 			   
   //Surname
   	      
   System.out.print("Cognome ["+other.getCognome()+"] :");
   String cognome=leggiStringa("New Surname --> ") ; 
  		  if(cognome.equals("")) 
  		  {
  			  System.out.println("Non modificato");
  		  }
    	  else 
    	  {
    		  other.setCognome(cognome);
    	  }
  		  
//|-----------------------------------------------------------------------------------------|
  			   
  	 //Age
  		  
  	System.out.print("Eta ["+other.getEta()+"] :");
    String eta=leggiStringa("New Age --> ") ; 
   		   if(eta.equals("")) 
   			 {
   				 System.out.println("Non modificato");
   			 }
     		 else 
     		 {
     			 other.setEta(Integer.parseInt(eta));
     		 }
  		  
//|-----------------------------------------------------------------------------------------|
  			   
   //Rule
  		  
   System.out.print("Ruolo ["+other.getRuoloAziendale()+"] :");
   String ruolo=leggiStringa("New Comapny Rule --> ") ; 
   		  if(ruolo.equals("")) 
   		  {
   			  System.out.println("Non modificato");
   		  }
     	  else 
     	  {
     		  other.setRuoloAziendale(ruolo);
     	  }
   		  
//|-----------------------------------------------------------------------------------------|
   			   
   //Qualification
   		  
   System.out.print("Titolo di studio ["+other.getTitoloStudio()+"] :");
   String titolo=leggiStringa("New Qualification --> ") ; 
  		  if(cognome.equals("")) 
  		  {
  			  System.out.println("Non modificato");
  		  }
    	  else 
    	  {
    		  other.setTitoloStudio(titolo);
    	  }
  		  
//|-----------------------------------------------------------------------------------------|
  			   
   //Salary
   System.out.print("Stipendio ["+other.getStipendio()+"] :");
   String stipendio=leggiStringa("New Salary --> ") ; 
   		  if(stipendio.equals("")) 
   		  {
   			  System.out.println("Non modificato");
   		  }
     	  else 
     	  {
     		  other.setStipendio(Double.parseDouble(stipendio));
     	  }
   		
   	 }
   	
	return d;
   	
//|-----------------------------------------------------------------------------------------|

}
   
// 4 - DELETE
	
    public Dipendente deleteObject(Dipendente d) {
    	   
   	 if(d instanceof Dirigente) 
   	 {
   		 Dirigente other=(Dirigente) d;
   		 
   		 other.setNome(null);
   		 other.setCognome(null);
	     other.setEta(0);
	     other.setID(0);
	     other.setRuoloAziendale(null);
	     other.setTitoloStudio(null);
	     other.setStipendio(0);
	     other.setResponsabilitaArea(null);
	     other.setLivelloFunzionale(null);
   	 }
   	 
//|-----------------------------------------------------------------------------------------|
   	 
   	 else if(d instanceof Manager) 
   	 {
   		 Manager other=(Manager) d;
   		  
   		 other.setNome(null);
	     other.setCognome(null);
	     other.setEta(0);
	     other.setID(0);
	     other.setRuoloAziendale(null);
	     other.setTitoloStudio(null);
	     other.setStipendio(0);
	     other.setResponsabilitaArea(null);
   	 }

//|-----------------------------------------------------------------------------------------|
   	 
   	 else if(d instanceof Dipendente) 
   	 {
   		 Dipendente other=(Dipendente) d;
   		 
   		 other.setNome(null);
	     other.setCognome(null);
	     other.setEta(0);
	     other.setID(0);
	     other.setRuoloAziendale(null);
	     other.setTitoloStudio(null);
	     other.setStipendio(0);
   	 }
   	 
   	 return d;

   }
	
    
// 5 - Fine Programma	
	
	public void endProgramm() 
	{
		System.out.println("Fine del Programma!!");
    }

//|-----------------------------------------------------------------------------------------|
//OTHER
//|-----------------------------------------------------------------------------------------|

//RICERCA FOR SEARCH AND DELETE
	
	public int search_delete(ArrayList<Dipendente> a)
	{ 
		
		int ID=leggiIntero("Inserisci l'ID del 'Dipendente' da Modificare - ID: ");

		int posizione=0;
		boolean flag=false;
		
		for(int i=0; i<a.size(); i++) 
		{
			
			if(ID == a.get(i).getID())
			{		
				flag=false;
				System.out.println("ID Trovato!!");
				posizione=i;
				break;	
			}
			else
			{
				flag=true;
			}
			
			if(!flag)
			{
				System.out.println("La Persona non è stata trovata!! UwU");	
				System.out.println("Per modificare la Persona, riprovare con una ID corretto");
			}
												
		}
		
		return posizione;
	}
	
// ID MAX METHOD++
	
	public int IDassignement(ArrayList<Dipendente> a)
	{
		int maxID=0;
		
		for(int i=0; i<a.size(); i++)
		{
			
			if(maxID<a.get(i).getID())
			{
				maxID=a.get(i).getID();
			}
			
		}
		
		++maxID;
		return maxID;
	}
	
//MENU'
	
	public void StampaMenu()
	{
		System.out.println("|-- C.R.U.D --|");
		System.out.println("Benvenuto nella Creazione del Database del Personale Aziendale!!");
		System.out.println("|--------------------------------------------------------------|");
		System.out.println("1 - Create");
		System.out.println("2 - Read");
		System.out.println("3 - Update");
		System.out.println("4 - Delete");
		System.out.println("5 - Quit Programm");
		System.out.println("|--------------------------------------------------------------|");		
	}
	
	public void menuDipendenti()
	{
		System.out.println("|--------------------------------------------------------------|");
		System.out.println("1 - Dipendente");
		System.out.println("2 - Manager");
		System.out.println("3 - Dirigente");
		System.out.println("|--------------------------------------------------------------|");	
	}
	
//LEGGI STRINGA
		
	public String leggiStringa(String s2)
	{
		System.out.println(s2);
		return s.nextLine();			
	}
		
//LEGGI INTERO
				
	public int leggiIntero(String s1)
		{
			System.out.println(s1);
					
			boolean flag;
			int N=0;
			do {
						
				flag=false;
						
					try 
					{
						N=Integer.parseInt(s.nextLine());
					}catch(NumberFormatException e)
					{
						System.out.println("ERRORE!! Inserire un Numero: ");
							flag=true;
					}
						
			}while(flag);
					
			return N;
		}
				
//LEGGI DOUBLE
	
		public double leggiDouble(String s2)
		{
			System.out.println(s2);
					
			boolean flag;
			double N=0;
				
			do {
				
				flag=false;
						
					try 
					{
						N=Double.parseDouble(s.nextLine());
					}catch(NumberFormatException e)
					{
						System.out.println("ERRORE!! Inserire un Numero: ");
						flag=true;
					}
							
			}while(flag);
					
			return N;
					
		
		}

		
	
}
