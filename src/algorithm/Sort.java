package algorithm;
import java.util.*;

//Die Klasse Sort stellt verschiedene Methoden zur Sortierung eines Felds von int-Werten zur Verfügung...
public class Sort 
{
    public static void bubbleSort(int[] list)
    {
        bubbleSort(list, 0, list.length-1);
    }
	
    public static void bubbleSort(int[] list, int leftIdx, int rightIdx) throws IllegalArgumentException
    {
        if ((leftIdx >= list.length) || (rightIdx >= list.length) || (leftIdx < 0) || (rightIdx < 0))
        {
            throw new IllegalArgumentException("Ungueltige Parameter");
        }
        
        for(; leftIdx < rightIdx; rightIdx--)
        {
            bubbleUp(list, leftIdx, rightIdx);
        }
        
    }
	
    
    public static void bubbleUp(int[] list, int leftIdx, int i) throws IllegalArgumentException
    {
        
        if ((leftIdx >= list.length) || (i >= list.length) || (leftIdx < 0) || (i < 0))
        {
            throw new IllegalArgumentException("Ungueltige Parameter");
        }
        
        for(int j = leftIdx; j < i; j++)
        {
            if (list[j] > list[j+1])
            {
                swap(list, j, j+1);
            }
        }
        
    }
	
	
	public static void swap(int[] list, int i, int j) throws IllegalArgumentException
    {
        if ((i >= list.length) || (j >= list.length) || (i < 0) || (j < 0))
        {
            throw new IllegalArgumentException("Ungueltige Parameter");
        }
        
        int hilf = list[i];
        list[i] = list[j];
        list[j] = hilf; 
    }
	
	
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
		int[] list = new int[] {123, 140, 150, 160, 1000, 456, 21, 45};
		System.out.println("Teste toString()");
		System.out.println(toString(list) + " <-- int-Array als String");
		
		System.out.println("Teste swap()");
		//1.Element
		int i = 2;
		//2.Element
		int j = 3;
		//Tausche 1. u. 2. Element
		swap(list, i, j);
		System.out.println(toString(list) + " <-- int-Array als String mit getauschen Elementen");
		
		System.out.println("Teste bubbleSort()");
		bubbleSort(list);
		System.out.println(toString(list) + " <-- int-Array sortiert mit BubbleSort");
	}

}
