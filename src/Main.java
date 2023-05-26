import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i=N;i>0;i--) {
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=N-i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}