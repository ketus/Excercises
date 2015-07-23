package pl.maciejoleksa.excercises;

<<<<<<< HEAD
import java.io.IOException;
import java.util.ArrayList;
=======
>>>>>>> 9cbc0cf6728627ad3cafda698366afd0fa92b730

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
<<<<<<< HEAD
			FileOperation nowy = new FileOperation();
			ArrayList<String> tempList = new ArrayList<>();
			
			tempList = nowy.listFilesinDir("/home/ketus");
					
				
				
			nowy.serializeToFile(tempList);
//				
//				System.out.println(tempList);
//				
//				nowy.serializeFromFile("tempData.wat");
//				
//			for(String el : tempList){
//				System.out.println(el);
//			}
				long startTime = System.currentTimeMillis();
				System.out.println(tempList.size());
				long endTime   = System.currentTimeMillis();
				long totalTime = endTime - startTime;
				System.out.println(totalTime);
=======
			
>>>>>>> 9cbc0cf6728627ad3cafda698366afd0fa92b730
	}
}
