package MODEL;

import java.util.ArrayList;

public class CRUD_Manager {
	
	Repository r= Repository.getInstance();
	
// 1 - CREATE
	
	public void Create(ArrayList<Dipendente> a, Dipendente d)
	{
		a.add(d);
	}
	
// 2 - READ
	
	public ArrayList<Dipendente> Read()
	{
		return r.getArrayList();
	}

// 3 - UPDATE
	
	public void Update(ArrayList<Dipendente>a, int i, Dipendente d)
	{
		a.set(i, d);
	}
	
// 4 - DELETE
	
	public void Delete(ArrayList<Dipendente> a,int i)
	{
		a.remove(i);
	}
}
