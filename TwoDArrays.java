/**
 * Created by kimmejares on 08/06/2017.
 */
public class TwoDArrays {

    public static void main (String[] args){
        int rows = 3;
        int cols = 3;

        int table[][] = new int[rows][cols];

        //assign 1st values in rows
        table[0][0]= 10;
        table[0][1]= 11;
        table[0][2]= 12;

        //assign 2nd values in rows
        table[1][0]= 20;
        table[1][1]= 21;
        table[1][2]= 22;

        //assign 3rd values in rows
        table[2][0]= 30;
        table[2][1]= 31;
        table[2][2]= 32;

        System.out.println(table.length );      //row length
        System.out.println(table[0].length );   //col length
        System.out.println(table[0][0]);        //value for first dimension

        //print data in rectagular format
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("  "+table[i][j]);
            }System.out.println(" ");
        }
    }
}
