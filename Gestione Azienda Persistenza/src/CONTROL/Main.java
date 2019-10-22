package CONTROL;

import MODEL.*;
import VIEW.View;
//import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		View v=new View();
		
		CRUD_Dipendente cd=new CRUD_Dipendente();
		CRUD_Manager cm=new CRUD_Manager();
		CRUD_Dirigente cdir=new CRUD_Dirigente();
		
		Dipendente d;
		Manager m;
		Dirigente dir;
		
		String risposta;
		int NChoice;
		int id;
		
		do {
			
		v.StampaMenu();
		int scelta=v.leggiIntero("Scegli il tipo di Operazione da Eseguire: ");
		
		switch(scelta)
		{		
		
		case 1:	//CREATE
		
		NChoice=v.leggiIntero("Quanti 'Dipendenti' vuoi inserire?? ");
		
		for(int i=0; i<NChoice; i++ )
		{
			v.menuDipendenti();
			
			int scelta2=v.leggiIntero("Scegli il tipo di 'Dipendente' da Inserire: ");
			
			switch(scelta2)
			{
				
			case 1: //CREATE
				d= new Dipendente();
				id = v.IDassignement(cd.Read());
				v.selectObject(d, id);
				
				cd.Create(cd.Read(), d);
				break;
				
			case 2:
				m= new Manager();
				id = v.IDassignement(cd.Read());
				v.selectObject(m, id);
				
				cm.Create(cd.Read(), m);
				break;
				
			case 3:
				dir= new Dirigente();
				id = v.IDassignement(cd.Read());
				v.selectObject(dir, id);
				
				cdir.Create(cd.Read(), dir);
				break;
			default:
				break;
			
		   }
			
		}
		
		break;
		
		case 2:	 //READ
			v.readObjectAll(cd.Read());
			break; 
			
		case 3: // UPDATE
			int indexU=v.search_delete(cd.Read());
			v.updateObject(cd.Read().get(indexU));
			cd.Update(cd.Read(), indexU, cd.Read().get(indexU));	
			break;
			
		case 4: //DELETE
			int indexD=v.search_delete(cd.Read());
			v.deleteObject(cd.Read().get(indexD));
			cd.Delete(cd.Read(), indexD);	
			break;
			
		case 5: // END
			v.endProgramm();
			break;		
			
		default:
			break;
					
		}
		
		risposta=v.leggiStringa("Vuoi Ripetere qualche Operazione?? ");
		
		}while(risposta.equals("Si"));
		
	
		
	
	}

}
