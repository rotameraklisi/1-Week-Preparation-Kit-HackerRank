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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     *-Plus-Minus -
     *Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.
     *Sample Input
     *arr = [-4, 3, -9, 0, 4, 1]
     *Sample Output
     *0.500000
     *0.333333
     *0.166667

     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        NumberFormat formatter = new DecimalFormat("#0.000000");
    
        System.out.println(formatter.format((double)(arr.stream().filter(predicate->predicate>0).count())/arr.size()));
        System.out.println(formatter.format((double)(arr.stream().filter(predicate->predicate<0).count())/arr.size()));
        System.out.println(formatter.format((double)(arr.stream().filter(predicate->predicate==0).count())/arr.size()));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
