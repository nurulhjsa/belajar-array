package tdi.training.java.core.array;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class ArrayFwlist
{
    public static void main (String[] args){
        List values = new ArrayList();
        values.add("Nurul Hasanah");
        values.add(1);
        values.add(false);
        values.add(true);
        values.add('A');
        values.add(100f);
        values.add(0.1d);
        values.add(new BigDecimal(1000000));

        for(int i=0; i<values.size(); i++)
            System.out.println(values.get(i));
    }
}