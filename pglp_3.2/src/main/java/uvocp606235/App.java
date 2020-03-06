package uvocp606235;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendeur v1 = new Vendeur(5,100);
		System.out.println("Salaire vendeur: " +v1.salaireVendeur());
		
		Employes e1 = new Employes(2);
		System.out.println("Salaire emplyé simple: " +e1.calculsalaire());

	}

}
