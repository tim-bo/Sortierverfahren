package algorithm;
import java.util.*;

//Die Klasse Sort stellt verschiedene Methoden zur Sortierung eines Felds von int-Werten zur Verfügung...
public class Sort 
{
	public static String toString(int[] list, int start, int end) throws IllegalArgumentException
	{
		//falls übergebene Parameter außerhalb d. Feldgrenzen o. start>end werfe Exception
		if ((start > end) || (end >= list.length) || (start < 0))
        {
            throw new IllegalArgumentException("Ungueltiger Start- bzw. Endwert");
        }
       
        int[] listone = new int[end-start+1];
        int i = start;
        for(int j=0; i<= end; i++, j++)
        {
            int tmp = list[i];
            int[] tmp2 = new int[] {tmp};
            System.arraycopy(tmp2, 0, listone, j, 1);
        }
        return toString(listone);
	}
	
	public static String toString(int[] list)
	{
		return Arrays.toString(list);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] list = new int[] {123, 140, 150, 160, 100000};
		System.out.println(toString(list) + " <-- int-Array als String");
	}

}
