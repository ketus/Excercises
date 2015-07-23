package pl.maciejoleksa.excercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class FileOperation {
	
	 ArrayList<HashMap<String, Path>> lista = new ArrayList<HashMap<String,Path>>();
	 
	 
	 public FileOperation(){
		 
	 }
	 /***
	  * 
	  * @param toSave - choose which ArrayList to serialize and save in root dir in file tempData.wat
	  */
	 public void serializeToFile(ArrayList<?> toSave){
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
	public ArrayList<?> serializeFromFile(String theFile) throws ClassNotFoundException {
		 ArrayList<?> tempList = new ArrayList<HashMap<String,Path>>();
		 
		 try {
			 FileInputStream inStream = new FileInputStream(theFile);
			 ObjectInputStream ois = new ObjectInputStream(inStream);
			 tempList = (ArrayList<?>) ois.readObject();
			 ois.close();
		} 
		 catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return tempList;		 
	 }
	
	 // API only available from Java 1.8
	 public ArrayList<String> listFilesinDir(String dir) throws IOException{
		 
		 ArrayList<String> temp = new ArrayList<>();
		 
		 Files.walk(Paths.get(dir)).forEach(filePath -> {
			    if (Files.isRegularFile(filePath)) {
			        temp.add(filePath.toString());
			    }
			});
		 
		 return temp;
	 }

}
