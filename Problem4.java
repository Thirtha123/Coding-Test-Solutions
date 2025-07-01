package p5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {
	public static void main(String[] args) {
        Integer[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        List<Integer> inputList = Arrays.asList(input);

        Map<Integer, Integer> cp = new HashMap<>();

        
        for (int i = 1; i <= 9; i++) {
            int count = 0;

            
            for (int num : inputList) {
                if (num % i == 0) {
                    count++;
                }
            }

            cp.put(i, count);
        }

        System.out.println(cp);
    }

}
