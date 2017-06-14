/**
 * Created by kimmejares on 08/06/2017.
 */
public class Loops {

    public static void main (String[] args){

        int i =1;

        do{
            System.out.println("Number is :" +i);
            i++;
        }while(i<=10);

        //or
        i=0;
        while(i<=10){
            System.out.println("Number is >>:" +i);
            i++;
        }
        //or

        for(int x=2;x<=20;x=x+2){
            System.out.println("Number is ->>:" +x);
        }
        //Table of 2
        for(int x=1;x<=10;x++){
            System.out.println("Table of 3 ->>:" +3*x);
        }
    }
}
