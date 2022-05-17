package workingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesMain {
	
	public static void main(String[] args) {
// dosya oluturma i�in fonksiyon.
		createFile();
		getFileInfo();
		System.out.println(" ");
		readFile();
		System.out.println(" ");
        writeFile();
        readFile();
	
	}
	
	public static void createFile(){
//dosya olu�turma i�lemi.	
//dosyan�n yolunu yaz�yoruz.		
		File file = new File("C:\\Users\\�smail Can Varl�\\OneDrive"
			+ "\\Masa�st�\\ders\\2. y�l\\nyp java\\BTKwork"
			+ "\\src\\WorkingWithFiles\\student.txt");

//Dosya olu�tururken bunu try catch i�inde yazmak zorunday�z.		
		try {
			if(file.createNewFile()){
				System.out.println("Dosya olu�turuldu");
			}else{
				System.out.println("Dosya zaten var.");
			}
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

    public static void getFileInfo(){
    	File file = new File("C:\\Users\\�smail Can Varl�\\OneDrive"
    			+ "\\Masa�st�\\ders\\2. y�l\\nyp java\\BTKwork"
    			+ "\\src\\WorkingWithFiles\\student.txt");

//exits metodu dosya var m� yok mu diye kontrol eder.    	
    	if (file.exists()) {
			System.out.println("Dosya ad�: " + file.getName());
			System.out.println("Dosya yolu: " + file.getAbsolutePath());
			System.out.println("Dosya yaz�labilir mi?: " + file.canWrite());
			System.out.println("Dosya okunabilir mi?" + file.canRead());
			System.out.println("Dosya boyutu: " + file.length());
    	}
    	
    	
    }
    
    public static void readFile(){
    	File file = new File("C:\\Users\\�smail Can Varl�\\OneDrive"
    			+ "\\Masa�st�\\ders\\2. y�l\\nyp java\\BTKwork"
    			+ "\\src\\WorkingWithFiles\\student.txt");
    	try {
			Scanner reader = new Scanner(file);

//Sat�r bo� d�nene kadar bu while devam edecek.			
			while(reader.hasNextLine()){
		    	String line = reader.nextLine();
		    	System.out.println(line);
		    }
    	    reader.close();
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

//burada da dosyaya bir �eyler yazmay� g�steriyoruz. 
//E�er kodun sonuna true demez isek dosyan�n i�indekileri siler ve �st�ne yazar    
    public static void writeFile(){
    	try {
			FileWriter file = new FileWriter("C:\\Users\\�smail Can Varl�\\OneDrive"
	    			+ "\\Masa�st�\\ders\\2. y�l\\nyp java\\BTKwork"
	    			+ "\\src\\WorkingWithFiles\\student.txt",true);

			file.write(" Ahmet");
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }



}
