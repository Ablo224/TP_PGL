package uvocp606235;

import java.util.ArrayList;
import java.util.List;

public class SalaireOfAllEmployes {
	
	private List<Employes> listEmployes;
	
	public  SalaireOfAllEmployes()
	{
		listEmployes = new ArrayList<Employes>();
	}
	
	public double salaireTotal()
	{
		double som=0;
		for(Employes e: listEmployes)
			som += e.calculsalaire();
		return som;
	}
	
	
}
