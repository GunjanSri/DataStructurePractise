package com.example.gunjansrivastava.arraysandstring;

public class ZeroMatrix {

    public static void main(String[] args){
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        int[][] matrix = {
                {1,2,3,4},
                {5,0,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] result = zeroMatrix.getZeroMatrix(matrix);
        for(int i = 0 ; i< matrix.length;i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    public int[][] getZeroMatrix(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0 ){
                    row[i]= true;
                    column[j] = true;
                }
            }
        }
        for(int i = 0 ; i < row.length ; i++){
            if(row[i]){
                for(int j = 0 ; j < matrix[0].length ; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 0 ; j < column.length ; j++){
            if(column[j]){
                for(int i = 0 ; i < matrix.length ; i++){
                    matrix[i][j] = 0 ;
                }
            }
        }
        return matrix;
    }
}
