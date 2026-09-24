import java.util.ArrayList;
import java.util.Timer;

public class question73 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int[][] matrix = {{1,2,3},{4,0,6},{7,8,9},{10,11,12}};
        ArrayList<rowandcolumns> zeros = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0){
                        rowandcolumns rowandcolumns = new rowandcolumns(i, j);
                        zeros.add(rowandcolumns);
                    }
            }
        }


        for (int i = 0; i < zeros.size(); i++) {
            int a=zeros.get(i).row,b=zeros.get(i).column,num=0;
            while (true){
                num++;
                if (b-num>=0){
                    matrix[a][b-num] = 0;
                }
                if (b+num<matrix[0].length){

                    matrix[a][b+num] = 0;
                }
                if (a-num>=0){
                    matrix[a-num][b] = 0;
                }
                if (a+num<matrix.length){
                    matrix[a+num][b] = 0;
                }
                if ((a-num<0)&&(b-num<0)&&(a+num>matrix.length)&&(b+num>matrix[0].length)){
                    break;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+",");
            }
            System.out.print("]");
        }
        long end = System.currentTimeMillis();

        System.out.println(end-startTime);

    }


    public static class  rowandcolumns{
        int row;
        int column;
        rowandcolumns(int row,int column){
            this.row = row;
            this.column = column;
        }


    }
}
