public class SumofNatNum {
    public static void main(String[] args) {
        //for loop
        int sum=0;
       for(int i=1;i<=10;i++){
           System.out.print(i);
           sum+=i;
       }
        System.out.println();
        System.out.println(sum);
        //while loop
       int j=1;
       int summ=0;
       while(j<=10){
           System.out.print(j);
           summ+=j;
           j++;
       }
        System.out.println();
        System.out.println(summ);
        //do while loop
       int k=1;
       int suum=0;
       do{
           System.out.print(k);
           suum+=k;
           k++;
       }while(k<=10);
        System.out.println();
        System.out.println(suum);
        }
    }
