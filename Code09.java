package dataStructure;

import java.util.Scanner;
/* 사용자로부터 정수 n을 입력받아 중복된 정수쌍을 구하는 방법 */

public class Code09 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int[] data=new int[n];
        for(int i=0; i<n; i++){
            data[i]=scanner.nextInt();
        }
        scanner.close();

        int count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(data[i]==data[j])
                    count++;
            }
        }
        System.out.println(count);
    }
}
