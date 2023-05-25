import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[2];
        int index = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt((st.nextToken()));
            index++;
        }

        int num0 = arr[0];
        int num1 = arr[1];

        int answer0 = 0;
        int answer1 = 0;

        while(num0!=0){
            answer0 = answer0*10+num0%10;
            num0 /= 10;
        }
        while(num1!=0){
            answer1 = answer1*10+num1%10;
            num1 /= 10;
        }

        if(answer0<answer1){
            System.out.println(answer1);
        }else{
            System.out.println(answer0);
        }
    }
}