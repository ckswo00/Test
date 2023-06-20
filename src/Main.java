import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());
        String arr[] = new String[test];

        for(int i=0;i<test;i++){
            arr[i] = br.readLine();
        }

        for(int i=0;i<test;i++){
            int cnt = 0;
            int sum = 0;

            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)=='O'){
                    cnt++;
                } else{
                    cnt=0;
                }
                sum+=cnt;
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }
}