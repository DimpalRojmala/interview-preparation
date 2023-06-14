public class PrintSpiralMetrix {

    public static void main(String[] args) {
        int input[][] = new int[][]{{1,2,3,4},
                                    {5,6,7,8},
                                    {9,10,11,13}};
        //o/p should be
        // 1,2,3,4,8,13,11,10,9,5,6,7
        // imagine this as multiple frames ..print outer frame first then inner frame and so on
        //for that we are starting with four index
        int rowMin =0;
        int rowMax = input.length-1;
        int colMin = 0;
        int colMax = input[0].length-1;

        // now we have print first top boundry, then right ,then bottom boundry then left
        int n=input.length;
        int m=input[0].length;
        int count =0;
        while(count<(n*m))
        {

            // print top boundry
            for(int col=colMin;col<=colMax&&count<(n*m);col++)
            {
                System.out.print(input[rowMin][col]);
                count++;
            }
            rowMin++;
            System.out.println();
            //print right boundry
            for(int row=rowMin;row<=rowMax&&count<(n*m);row++)
            {
                System.out.print(input[row][colMax]);
                count++;
            }
            colMax--;
            System.out.println();
            //bottom boundry
            for(int col=colMax;col>=colMin&&count<(n*m);col--)
            {
                System.out.println(input[rowMax][col]);
                count++;
            }
            System.out.println();
            rowMax--;
            //left boundry
            for(int row=rowMax;row>=rowMin&&count<(n*m);row--)
            {
                System.out.println(input[row][colMin]);
                count++;
            }
            colMin++;

        }

    }
}
