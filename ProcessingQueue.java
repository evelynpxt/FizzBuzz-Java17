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
     * Complete the 'findMinOperations' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING processingQueue as parameter.
     */

    public static int findMinOperations(String processingQueue) {
        int operations = 0;
        
        // Enquanto encontrar "abc", remove e conta
        while (processingQueue.contains("abc")) {
            processingQueue = processingQueue.replace("abc", "");
            operations++;
        }
        
        return operations;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String processingQueue = bufferedReader.readLine();

        int result = Result.findMinOperations(processingQueue);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
