import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        String result = "";

        for(int i=0;i<arr.length-1;i++){
            if(Integer.parseInt(arr[i])==Integer.parseInt(arr[i+1])-1){
                result = "ascending";
            } else if (Integer.parseInt(arr[i])==Integer.parseInt(arr[i+1])+1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        System.out.print(result);
    }
}