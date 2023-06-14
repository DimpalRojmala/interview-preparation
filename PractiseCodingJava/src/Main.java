public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        int[] inputArray = {7,3,5,2,9};
        int target = 7;



         for(int i=0 ; i<inputArray.length;i++)
         {
             for(int j=0 ; j<inputArray.length;j++)
             {
                 if(target-inputArray[i]==inputArray[j])
                 {
                     System.out.println(i);
                     System.out.println(j);
                     return;
                 }
             }
         }


    }
}