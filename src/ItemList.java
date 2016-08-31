/**
 * Write a description of class Cloth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;

public class ItemList
{
    
    private static int count =0;
    
    public static void main(String[] args)throws IOException
    {
    	Scanner scan = new Scanner(System.in);
        Scanner filescan = new Scanner (new File("Inputdata.txt"));
        Item x;
        while (filescan.hasNext())
        {
            x = new Item(filescan.next(), filescan.next(), filescan.nextInt(), filescan.nextDouble());
            count++;
            
        }
        Item[] list=new Item[count];
        filescan = new Scanner (new File("Inputdata.txt"));
        count =0;
        while (filescan.hasNext())
        {
            x = new Item(filescan.next(), filescan.next(), filescan.nextInt(), filescan.nextDouble());
            list[count]=x;
            count++;
            
        }
        System.out.println("Choose the sort method: ");
	    System.out.println("s.selection sort");
	    System.out.println("i.insertion sort");
	    String choice = scan.next();
	    if(choice.equals("s"))
	    {
	    	System.out.println("Selection Sort");
	    	Sorting.selectionSort(list);
	    }
	    else if(choice.equals("i")){
	    	System.out.println("Insertion Sort");
	    	Sorting.insertionSort(list);
    	}else{
    		System.out.println("Wrong choice!");
    	}
	    
	    for(Item cloths : list){
	        System.out.println(cloths);
	    }
    }
}