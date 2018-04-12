public class tree {

	private myList lista = new myList();
	node root = null;
	
	
	tree(myList lista){
		this.lista=lista;
		buildTree();
		prePrint();
	}
	
	
	
	
	public void buildTree() {
		

		
		int i = 1;
		
		while(lista.size()>1) {
	
			
			node min = lista.loadMin(lista);
			node min2 = lista.loadMin(lista);
			node tempRoot = new node(min.getWartosci()+min2.getWartosci(), "Z"+i);
			lista.add(tempRoot);
			tempRoot.sztuczny=true;
			root= tempRoot;
			
			tempRoot.setlewy(min);
			tempRoot.setprawy(min2);
			min.setojciec(tempRoot);
			min2.setojciec(tempRoot);
			i++;
			
			
			
			
//			zbior min = lista.loadMin(lista);
//			zbior min2 = lista.loadMin(lista);
//			zbior nowy = new zbior(min.getWartosc()+min2.getWartosc(), "Z"+i);
//			lista.add(nowy);
//
//			
//			//System.out.println(min.getWartosc() + " oraz " + min2.getWartosc());
//			drzewo.put(nowy.getWartosc(), nowy.getLitera());
//			drzewo.put(min.getWartosc(), min.getLitera());
//			drzewo.put(min2.getWartosc(), min2.getLitera());
			
			
		}
		

		
		
		
	}
	
	String kod = "";
	
	int bityPo=0;
	int czestosc=0;
	int licznik=1;
	
	public void prePrint() {
		
		System.out.println("-----------------------------------------");
		System.out.println("LP| znak | czestosc |   kod Huffmana    |");
		
		System.out.println("-----------------------------------------");
	
		print(root);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Bity przed: " + czestosc*8 + " Bity po: " + bityPo);
		
		
	}
	
	
	public void print(node korzen) {
		
		
		
		if(korzen.maLiscL) {
			kod=kod+"0";
			print(korzen.getLewy());
		}
		if(korzen.maLiscP) {
			kod=kod+"1";
			print(korzen.getPrawy());
		}
		
		if(!(korzen.sztuczny)) {
		System.out.print(String.format("%2d", licznik));
		System.out.print("|");
		System.out.print(String.format("%7s", korzen.getLitera() + "|"));
		System.out.print(String.format("%11s",  korzen.getWartosci() + "|"));
		System.out.println(String.format("%20s",   kod + "|"));
		bityPo = bityPo + korzen.getWartosci() * kod.length();
		czestosc = czestosc + korzen.getWartosci();
		licznik++;
		}
		
		if(!(kod.isEmpty()))
		kod = kod.substring(0, kod.length()-1);
		
		
		
	}
	
	
	
	
}
