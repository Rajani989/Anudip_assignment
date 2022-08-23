import java.util.Arrays;

//This is a project using by for each method to sort the fruits.
public class Sort_fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] fruits= {"Mango","Apple","Grapes","banana","Cherry"};//initialization and declaration
   Arrays.sort(fruits);//sort the array
   for(String x: fruits) 
     { 
	    System.out.println(x);//print fruits name
      }
	}

}

