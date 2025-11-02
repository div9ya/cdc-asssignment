public class Main
{
	static void findRepeatingElements(int arr[]) {
	    Map<Integer,Integer> mpp= new HashMap<>();
	    
	    for(int i:arr) {
	        if(mpp.get(i) == null) mpp.put(i,1);
	        else mpp.put(i,mpp.get(i)+1);
	    }
	    System.out.print("The repeating elements are: ");
	    for(Entry<Integer,Integer> entry: mpp.entrySet()) {
	        if(entry.getValue()>1)
	            System.out.print(entry.getKey()+" ");
	    }
	    
	}
