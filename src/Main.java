import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[] arr = new int[count];

        for(int i=0;i<count;i++){
            arr[i] = in.nextInt();
        }

        in.close();
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[count-1]);
    }
} // 10818