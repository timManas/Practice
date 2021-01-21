package Math.TransposeMatrix;

public class TransposeMatrix {

   public static void main(String [] args) {
//       int [][] input = {{1,2,3}, {4,5,6}, {7,8,9}};
       int [][] input = {{1,2,3}, {4,5,6}};
       int [][] output = transpose(input);

       System.out.println("Output");
       for (int i=0; i < output.length; i++) {
           for (int j=0; j < output[i].length; j++) {
               System.out.print(output[i][j] + " ");
           }
           System.out.println();
       }
   }

    public static int[][] transpose(int[][] input) {
       if (input.length == 0)
           return input;
       int [][] output = new int[input[0].length][input.length];


       for (int i=0; i < input.length; i++) {
           for (int j=0; j < input[i].length; j++) {
               output[j][i] = input[i][j];
           }
       }
       return output;
    }


}
