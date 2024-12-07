public class ArrayDimension {
    public static void main(String[] args) {
        // the number of [] after the datatype defines dimension of array
        // 1. one dimension 
        // int[] oneDarray = new int[2];
        // 2. two dimension
        int[][]twoDarray = new int[2][4];
        //3. three dimension
        // int [][][] threeDarray = new int[2][1][2];

        // two dimension representation
        // int [2][4] -> first 2 is the number of array /row
        // second 4 is the number of element in each innner array
        //[0  1  2  3
        //[20 0 40 0] -> 0 (arr[0])
        //[ 0 0 30 0]-> 1
        //]

        twoDarray [0][0]=20;
        twoDarray [0][2]=40;
        twoDarray [1][2]=30;

        System.out.println("first element of first arr is"+twoDarray[0][0]);
        

        // Task
        // make a 20 aray called colors with the following data
        //[
        //[255,244,0]
        //[233,40,255]
        //[0,  0,  0]
        //[244,211,121]
        //[255,255,255]
        //]

        int[][] colors= new int[5][3];
        colors [0][0]=255;
        colors [0][1]=244;
        colors [0][2]=0;
        colors [1][0]=233;
        colors [1][1]=40;
        colors [1][2]=255;
        colors [2][0]=0;
        colors [2][1]=0;
        colors [2][2]=0;
        colors [3][0]=244;
        colors [3][1]=211;
        colors [3][2]=121;
        colors [4][0]=255;
        colors [4][1]=255;
        colors [4][2]=255;

        System.out.println("first element of first arr is"+colors[0][0]);
        

        int [][] colour = {
        {255,244,0},
        {233,40,255},
        {0,  0,  0},
        {244,211,121},
        {255,255,255}

        };

        // looping 2D Array

        for(int row=0; row<colour.length;row++){
            for(int column=0; column<colour [row].length; column++){
                System.out.print(colour[row][column]+" ");
            }
            System.out.println();
        }
        

        




    }
    
}
