public class RotateMetrixBy90withSameArray {

    public static void main(String[] args) {
        int[][] input = new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        rotateMatrixBy90(input);


    }

    private static void rotateMatrixBy90(int[][] input) {
      input =  transpose(input);

      //now have to swap column

        //0,0 <=> 0,3
        //1,0 <=> 1,3
        //2,0 <=> 2,3
        //3,0 <=> 3,3

        //0,1 <=> 0,2
        // 1,1 <=> 1,2
        //2,1<==> 2,2
        //3,1<==>3,2
       // int j=0;
        for(int j=0;j<input[0].length/2;j++) {
            for (int i = 0; i < input[0].length; i++) {

                int k = input[0].length - 1 - j;
                //now swap
                int temp = input[i][k];
                input[i][k] = input[i][j];
                input[i][j] = temp;
                // j++;
            }
        }

        for(int i=0 ; i<input[0].length ; i++)
        {
            for(int k=0 ; k<input[0].length ; k++)
            {

                System.out.print(input[i][k]+" ");
            }
            System.out.println();
        }


    }
// 0,0 <=>0,0 -we dont need this
 // 0,1 <=>1,0
// 0,2 <=>2,0
// 0,3 <=>3,0

    // 1,0 <=>0,1 --we dont need this
    // 1,1 <=>1,1 we dont need this
    // 1,2 <=>2,1
    // 1,3 <=>3,1

    // 2,0 <=>0,2 -- we dont need this
    // 2,1 <=>1,2 --we dont need this
    // 2,2 <=>2,2 we dont need this
    // 2,3 <=>3,2

    // 3,0 <=>0,3 -- we dont need this
    // 3,1 <=>1,3 -- we dont need this
    // 3,2 <=>2,3 -- we dont need this
    // 3,3 <=>3,3 we dont need this
    // This is just for transpose the metrix

    //o/p
    // 1 5 9 13
    //2 6 10 14
    //3 7 11 15
    //4 8 12 16
    private static int[][] transpose(int[][] input) {

        for(int i=0;i<input[0].length;i++)
        {
            for(int j=i+1;j<input[0].length;j++)
            {
                //now swap
                int temp = input[j][i];
                input[j][i]=input[i][j];
                input[i][j] = temp;


            }
        }

        for(int i=0 ; i<input[0].length ; i++)
        {
            for(int j=0 ; j<input[0].length ; j++)
            {
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
     return input;
    }

}
