package pl.maciejoleksa.excercises;


import java.io.IOException;
import java.util.ArrayList;


public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

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

	}
}
