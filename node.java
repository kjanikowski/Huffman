
public class node {
	
	node ojciec = null;


	node lewy = null;
	node prawy = null; 


	int wartosci;
	String litera;
	

	public Boolean sztuczny = false;
	Boolean maLiscL = false;
	Boolean maLiscP = false;
	
	/////
	
	node(int liczba, String litera){
		this.wartosci = liczba;
		this.litera = litera;
	}
	
	node(int liczba, String litera, node ojciec){
		this.wartosci = liczba;
		this.litera = litera;
		this.ojciec = ojciec;
	}
	
	/////
	
	
	public void setWartosc (int wartosci) {
		this.wartosci=wartosci;
	}
	
	public void setLitera (String litera) {
		this.litera=litera;
	}
	
	public int getWartosci() {
		return wartosci;
	}
	
	public Boolean getMaLiscL() {
		return maLiscL;
	}

	public void setMaLiscL(Boolean maLiscL) {
		this.maLiscL = maLiscL;
	}
	
	public Boolean getMaLiscP() {
		return maLiscP;
	}

	public void setMaLiscP(Boolean maLiscP) {
		this.maLiscP = maLiscP;
	}

	public String getLitera() {
		// TODO Auto-generated method stub
		return this.litera;
	}

	public void inc() {
		this.wartosci++;
		
	}

	
	
	public void setlewy(node lewy){
		this.lewy=lewy;
		this.maLiscL=true;
	}

	public void setprawy(node prawy){
		this.prawy=prawy;
		this.maLiscP=true;
	}
	
	public void setojciec(node ojciec){
		this.ojciec=ojciec;
	}
	
	public node getLewy() {
		return lewy;
	}
	
	public node getPrawy() {
		return prawy;
	}



	
	
	
	
	
	
	
	
	
	
	
	
}
