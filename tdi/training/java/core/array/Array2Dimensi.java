package tdi.training.java.core.array;

public class Array2Dimensi
{
    public static void main (String[] args)
    {
        Integer[][] values = {{1,2,3}, {2,3,5}, {3,4,5}};

        System.out.println(values[0][2]);

        for(int i=0; i<values.length; i++){
            for(int j=0; j<values[i].length; j++){
                System.out.print(values[i][j]);
            }
            System.out.println();
        }
    }
}