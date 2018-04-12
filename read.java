import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


public class read  {
	
//	LinkedHashMap<String,Integer> lista = new LinkedHashMap<>();
	private myList lista = new myList();
	private final File testFile = new File("tekst.txt");
	
	//static int ilosc_bitow=0;
	
	
	public myList getLista() {
		return lista;
	}

	


	void load() {
			
	try {	
		
	    

		
	BufferedReader reader = new BufferedReader(
		    new InputStreamReader(
		        new FileInputStream(testFile),Charset.forName("UTF-8")
		        ));
		int chara;
		reader.read();
		while(( chara = reader.read()) != -1) {
		  //ilosc_bitow= ilosc_bitow+8;
		  String character = Character.toString((char)chara);
		 // System.out.println(".");
		  boolean znal = false;
		  for(int i = 0; i < lista.size(); i++) {
			  if(lista.get(i).getLitera().equals(character)) {
				  lista.get(i).inc();
				  znal=true;
				  break;
			  }
			  
			  
		  }
		  
		  if(znal==false)
			  if(!(character.equals("\n")) & !(character.equals("\r"))) {
				  
			  lista.add(new node(1,character));
		  	znal=true;}
		}
		
		
		reader.close();
		
	}catch(Exception e){
		System.out.println("Blad odczytu");
		e.printStackTrace();
	}
	
	}
	
//	void print() {
//		for(String s :  ) {
//			System.out.println(s + " " +lista.get(s));
//			
//		}
//	}

}
