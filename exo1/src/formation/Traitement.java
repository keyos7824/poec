package formation;

public class Traitement {

	public int somme (int i, int j){
		
		return i + j;
		
	}
	
	public int produit (int i, int j){
		
		return i * j;
		
	}
	
	public static void main(String[] args) {
		
		Traitement m = new Traitement();
		
		System.out.println (m.somme (10,20));
		System.out.println (m.produit (10,20));
		
	}

}
