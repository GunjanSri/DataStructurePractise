package com.example.gunjansrivastava.arraysandstring;

public class RotationMatrix {

    public static void main(String[] args){
        RotationMatrix rotationMatrix = new RotationMatrix();
        int matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] result = rotationMatrix.rotateAntiMatrix(matrix);
        for(int i = 0 ; i < 4 ; i ++){
            for(int j = 0 ; j < 4 ; j ++){
                System.out.println(result[i][j]);
            }
        }
    }

    private int[][] rotateAntiMatrix(int[][] matrix){
        //Find number of layer in a matrix
        int n = matrix.length; // Matrix length is 4 , and layer is n/2

        //iterate through each layer at a time
        for(int layer = 0 ; layer < n/2 ; layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i = first ; i< last ; i++){
                int offset = i - first;
                int top = matrix[first][last-offset];
                matrix[first][last-offset] = matrix[last-offset][last];
                matrix[last-offset][last] = matrix[last][i];
                matrix[last][i] = matrix[i][first];
                matrix[i][first] = top;
            }
        }

        return matrix;
    }

    private int[][] rotateMatrix(int[][] matrix){
        //Find number of layer in a matrix
        int n = matrix.length; // Matrix length is 4 , and layer is n/2

        //iterate through each layer at a time
        for(int layer = 0 ; layer < n/2 ; layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i = first ; i< last ; i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }

        return matrix;
    }
}
