import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer[] arr = new Integer[10];

        for (int i=0;i<10;i++){
            arr[i] = Integer.parseInt(br.readLine())%42;
        }

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));

        int n = set.size();
        System.out.println(n);
    }
}