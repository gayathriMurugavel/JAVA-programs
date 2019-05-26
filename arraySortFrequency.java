import java.util.*;
public class arraySortFrequency{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),cnt;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		ArrayList<Integer> output=new ArrayList<>();
		for(int temp:arr){
			int count=map.getOrDefault(temp,0);
			map.put(temp,count+1);
			output.add(temp);
		}
		//compare the map by value
		SortComparator cmp=new SortComparator(map);
		//sort the map using collections class
		Collections.sort(output,cmp);
		for (Integer i : output) { 
            System.out.print(i + " "); 
        } 
	}
}
class SortComparator implements Comparator<Integer> { 
    private final Map<Integer, Integer> freqMap; 
  
    // Assign the specified map 
    SortComparator(Map<Integer, Integer> tFreqMap) 
    { 
        this.freqMap = tFreqMap; 
    } 
  
    // Compare the values 
    @Override
    public int compare(Integer k1, Integer k2) 
    { 
  
        // Compare value by frequency 
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1)); 
  
        // Compare value if frequency is equal 
        int valueCompare = k1.compareTo(k2); 
  
        // If frequency is equal, then just compare by value, otherwise - 
        // compare by the frequency. 
        if (freqCompare == 0) 
            return valueCompare; 
        else
            return freqCompare; 
    } 
} 