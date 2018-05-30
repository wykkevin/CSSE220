import java.util.HashMap;

public class MapAnd2DArrayProblems {
	
	/**
	 * Update the given array by increasing each item
	 * by it's row's index value.
	 * 
	 * For example, the array 
	 * {{0, 1},
	 *  {2, 3}}
	 *  
	 *  would become:
	 *  
	 *  {{0, 1},
	 *   {3, 4}}
	 *   
	 * The items on the first row don't change, as the index
	 * for that row is zero. The items on the second row are
	 * increased by 1, as the index of that row is one.
	 *   
	 * Example #2:
	 * 
	 * {{1, 2, 3, 4, 5},
	 * 	{0, 0, 0, 0, 0},
	 *  {1, 1, 1, 1, 1}}
	 *  
	 *  would become:
	 *  
	 * {{1, 2, 3, 4, 5},
	 * 	{1, 1, 1, 1, 1},
	 *  {3, 3, 3, 3, 3}}
	 *  
	 * @param data - The data array to update
	 */
	public static void increaseByRowIndex(int[][] data) {
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				data[i][j]=data[i][j]+i;
			}
		}
	}
	
	/**
	 * Given an array of characters, determine with characters have been seen 
	 * three or more times, and return a HashMap containing each character
	 * and indicating if the character was seen 3 or more times.
	 * 
	 * For full credit on this problem, you may use ONE ONE FOR LOOP. You may use 
	 * as many HashMaps as you would like.
	 * 
	 * @param grades
	 * @return A HashMap including all characters seen, with a true/false value. True 
	 * if the character was seen 3 or more times, false otherwise.
	 */
	public static HashMap<Character, Boolean> seen3Times(char[] characters) {
		HashMap<Character, Integer> charintMap=new HashMap<Character, Integer>();
		HashMap<Character, Boolean> charboolMap=new HashMap<Character, Boolean>();
		for (char chars:characters){
			if (!charintMap.containsKey(chars)){
				charintMap.put(chars,1);
				charboolMap.put(chars, false);
			}else{
				charintMap.put(chars,charintMap.get(chars)+1);
				if (charintMap.get(chars)>=3){
					charboolMap.put(chars, true);
				}
			}
		}
		
		return charboolMap;
	}
}
