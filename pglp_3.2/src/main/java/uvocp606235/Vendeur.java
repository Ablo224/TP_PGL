package uvocp606235;

public class Vendeur extends Employes{
	
	public Vendeur(int nbY) {
		super(nbY);
		// TODO Auto-generated constructor stub
	}

	private int commission;
	
	public double salaireVendeur()
	{
		return super.calculsalaire() + commission;
	}

}
