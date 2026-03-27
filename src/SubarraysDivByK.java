import java.util.*;
public class SubarraysDivByK {
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int k=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                
                int count=0;
                for(int i=0;i<n;i++){
                        int sum=0;
                        for(int j=i;j<n;j++){
                                sum+=arr[j];
                                if(sum%k==0){
                                        count++;
                                }
                        }
                }
                System.out.println(count);
        }
        // TODO: Read n and k
        // TODO: Read array elements
        // TODO: Count and print the number of subarrays with sum divisible by k
    
}
