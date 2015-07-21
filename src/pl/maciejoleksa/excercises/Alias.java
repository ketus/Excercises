package pl.maciejoleksa.excercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.*;

class Alias {
	
	 ArrayList<HashMap<String, Path>> lista = new ArrayList<HashMap<String,Path>>();
	 
	 
	 public Alias(){
		 
	 }
	 /***
	  * 
	  * @param toSave - choose which ArrayList to serialize and save in root dir in file tempData.wat
	  */
	 void serializeToFile(ArrayList<HashMap<String, Path>> toSave){
		 try {
			 FileOutputStream outStream = new FileOutputStream("tempData.wat");
			 ObjectOutputStream oos = new ObjectOutputStream(outStream);
			 oos.writeObject(toSave);
			 oos.close();
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}		 
	 }
	 /***
	  * 
	  * @param theFile
	  * @return
	  * @throws ClassNotFoundException
	  */
	ArrayList<HashMap<String, Path>> serializeFromFile(String theFile) throws ClassNotFoundException, ClassCastException{
		 ArrayList<HashMap<String, Path>> tempList = new ArrayList<HashMap<String,Path>>();
		 
		 try {
			 FileInputStream inStream = new FileInputStream(theFile);
			 ObjectInputStream ois = new ObjectInputStream(inStream);
			 tempList = (ArrayList<HashMap<String, Path>>) ois.readObject();
			 ois.close();
		} 
		 catch (IOException e) {
			e.printStackTrace();
		}
		return tempList;		 
	 }

}
