package Java_interview.Java_interview;

import java.util.HashMap;
import java.util.Map;

public class countOfWords {

	public static void main(String[] args) {
		
		String str ="I am am using java java java programming";
		
		String[] arr = str.split(" ");
		
		Map<String, Integer> wordCountMap = new HashMap();
		
		for(String word : arr){
			
			if(wordCountMap.containsKey(word)){
				wordCountMap.put(word, wordCountMap.get(word)+1);
			}
			else{
				wordCountMap.put(word, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
