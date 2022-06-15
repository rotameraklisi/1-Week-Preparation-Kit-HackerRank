import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        /*
        long sum = arr.stream().reduce(0, Integer::sum);
        arr = arr.stream().sorted().collect(Collectors.toList());
        System.out.println(sum-arr.get(arr.size()-1)+" "+ (sum-arr.get(0)));
        */

        long max = arr.get(0), min = arr.get(0), sum = 0;
        for(int i: arr){
            sum += i;
            if(max < i) max = i;
            if(min > i) min = i;
        }
        
        System.out.println((sum - max) + " " + (sum - min));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
