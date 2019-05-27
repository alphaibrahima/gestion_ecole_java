
public class Eleve {
	

		private String nom;
		private String prenom;
		private String adresse;
		private String telphone;
		private Integer ages;
		private String dateInscription;
		private char genre;
		private String classe = SalleClasse.getNomDeClasse();
		


		public Eleve(String nom,String prenom,String adresse,String telphone,Integer ages,String dateInscription,char genre,String classe) {
			// TODO Auto-generated constructor stub
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.telphone = telphone;
			this.ages = ages;
			this.dateInscription = dateInscription;
			this.genre = genre;
			this.classe = classe;
		}
		
		public String infosEleve()
		{
			return nom +'\n' + prenom +'\n'+ adresse + '\n'+ telphone +'\n'+ ages + '\n' + dateInscription + '\n' + genre + '\n' + classe;
		}
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		/**
		 * @return the prenom
		 */
		public String getPrenom() {
			return prenom;
		}
		/**
		 * @param prenom the prenom to set
		 */
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getTelphone() {
			return telphone;
		}
		public void setTelphone(String telphone) {
			this.telphone = telphone;
		}

		public String getDateInscription() {
			return dateInscription;
		}
		public void setDateInscription(String dateInscription) {
			this.dateInscription = dateInscription;
		}
		
		public char getGenre() {
			return genre;
		}

		public void setGenre(char genre) {
			this.genre = genre;
		}

		public Integer getAges() {
			return ages;
		}

		public void setAges(Integer ages) {
			this.ages = ages;
		}

		public String getClasse() {
			return classe;
		}

		public void setClasse(String classe) {
			this.classe = classe;
		}
		

}

