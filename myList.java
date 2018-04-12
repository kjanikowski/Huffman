import java.util.LinkedList;

public class myList extends LinkedList<node> {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4075683156586056359L;
	//zbior z;
	


	myList(){
		
	}
	
	node loadMin(myList list){
		
		node min = new node(Integer.MAX_VALUE,"pusto");
		int index = 0;
		
		for(int i = 0; i < list.size(); i++ ) {
			if(list.get(i).getWartosci()<min.getWartosci()) {
				min=list.get(i);
				index=i;
			}
		}
		
		list.remove(index);

		return min;	
	}
	
	
}
