public class RotateMatrixBy90UsingOtherArray {
    public static void main(String[] args) {

        int[][] input = new int[][]{{1,2,3,4},
                                    {5,6,7,8},
                                    {9,10,11,12},
                                    {13,14,15,16}};

        rotateMatrixBy90(input);


    }

    // 0,0 =>0,3
    // 0,1 => 1,3
    // 0,2 =>2,3
    // 0,3 => 3,3

    // 1,0 => 0,2
    // 1,1 => 1,2
    // 1, 2=> 2,2
    // 1,3 => 3,2

    // .. so on

    private static void rotateMatrixBy90(int[][] input) {

        //
        //int j=input[0].length;
        int output[][]=new int[4][4];
        for(int i=0 ; i<input[0].length ; i++)
        {
         for(int j=0;j<input[0].length ; j++) {
             int k = (input[i].length -1)-i;

             output[j][k]=input[i][j];

         }


        }

        for(int i=0 ; i<output[0].length ; i++)
        {
            for(int j=0 ; j<output[0].length ; j++)
            {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
