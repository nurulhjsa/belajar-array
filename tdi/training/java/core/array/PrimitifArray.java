package tdi.training.java.core.array;

public class PrimitifArray
{
    public static void main (String[] args)
    {
        String[] pesertaBootcamp ={
            "Melody",
            "Nabila",
            "Nurul",
            "Yusuf"
        };

        System.out.println(
            "peserta bootcamp index ke 2 adalah "+pesertaBootcamp[2]
        );

        for(int i=0; i < pesertaBootcamp.length; i++){
            System.out.print(pesertaBootcamp[i]+",");
        }
        System.out.println();
    }
}