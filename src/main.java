
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalleClasse classe1 = new SalleClasse("Terminal S1 A","Terminal"); 
		
		Eleve eleve1 = new Eleve("Sow","alpha","pikine","77-273-33-55",19,"12-05-2019",'M',SalleClasse.getNomDeClasse());
		System.out.println(" Vos Information : "+ eleve1.infosEleve());
		eleve1.setClasse("Terminal S2 C");
		System.out.println(" Vos Information : "+ eleve1.infosEleve());
		
		
		//System.out.println("votre classe c'est : "+ SalleClasse.getNomDeClasse());

	}

}
