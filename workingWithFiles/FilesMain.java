package workingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesMain {
	
	public static void main(String[] args) {
// dosya oluturma için fonksiyon.
		createFile();
		getFileInfo();
		System.out.println(" ");
		readFile();
		System.out.println(" ");
        writeFile();
        readFile();
	
	}
	
	public static void createFile(){
//dosya oluþturma iþlemi.	
//dosyanýn yolunu yazýyoruz.		
		File file = new File("C:\\Users\\Ýsmail Can Varlý\\OneDrive"
			+ "\\Masaüstü\\ders\\2. yýl\\nyp java\\BTKwork"
			+ "\\src\\WorkingWithFiles\\student.txt");

//Dosya oluþtururken bunu try catch içinde yazmak zorundayýz.		
		try {
			if(file.createNewFile()){
				System.out.println("Dosya oluþturuldu");
			}else{
				System.out.println("Dosya zaten var.");
			}
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

    public static void getFileInfo(){
    	File file = new File("C:\\Users\\Ýsmail Can Varlý\\OneDrive"
    			+ "\\Masaüstü\\ders\\2. yýl\\nyp java\\BTKwork"
    			+ "\\src\\WorkingWithFiles\\student.txt");

//exits metodu dosya var mý yok mu diye kontrol eder.    	
    	if (file.exists()) {
			System.out.println("Dosya adý: " + file.getName());
			System.out.println("Dosya yolu: " + file.getAbsolutePath());
			System.out.println("Dosya yazýlabilir mi?: " + file.canWrite());
			System.out.println("Dosya okunabilir mi?" + file.canRead());
			System.out.println("Dosya boyutu: " + file.length());
    	}
    	
    	
    }
    
    public static void readFile(){
    	File file = new File("C:\\Users\\Ýsmail Can Varlý\\OneDrive"
    			+ "\\Masaüstü\\ders\\2. yýl\\nyp java\\BTKwork"
    			+ "\\src\\WorkingWithFiles\\student.txt");
    	try {
			Scanner reader = new Scanner(file);

//Satýr boþ dönene kadar bu while devam edecek.			
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

//burada da dosyaya bir þeyler yazmayý gösteriyoruz. 
//Eðer kodun sonuna true demez isek dosyanýn içindekileri siler ve üstüne yazar    
    public static void writeFile(){
    	try {
			FileWriter file = new FileWriter("C:\\Users\\Ýsmail Can Varlý\\OneDrive"
	    			+ "\\Masaüstü\\ders\\2. yýl\\nyp java\\BTKwork"
	    			+ "\\src\\WorkingWithFiles\\student.txt",true);

			file.write(" Ahmet");
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }



}
