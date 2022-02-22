package ro.ase.classes;

public class Utils {
	
	
	// nr. occurences of min value in an array?
	public static int countOccurMin(int[] array) {
		int min = 0;
		int occur = 0; 
		for (int i = 0; i < array.length ; i++)
		{
			if(array[i] < min)
			{
				occur = 1;
				min = array[i];
			}
			else if (array[i] == min)
			{
				occur++;
			}
		}
		
		return occur;
	}
	
}
