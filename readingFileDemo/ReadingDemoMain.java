package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadingDemoMain {
	public static void main(String[] args) {
		
//burada dosya okuma ile ilgili i�lemler yapaca��z ancak ��yle bir
//durum varki dosya ile ilgili i�lemleri try catch i�inde yapmam�z
//gerekiyor.		
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\�smail Can Varl�"
					+ "\\OneDrive\\Masa�st�\\ders\\2. y�l\\nyp java\\BTKwork"
					+ "\\src\\ReadingFileDemo\\numbers.txt"));
			String line = null;
		    
			while((line = reader.readLine())!= null){
//dosyadaki string ifadeyi int'e �evirdi. Yani cast i�lemi.				
				total += Integer.valueOf(line);
				
			}
			System.out.println("Toplam: " + total);
			
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (Exception e) {
// bu while d�ng�s�nde olu�turdu�umuz reader i�indi.
			e.printStackTrace();
		} finally{
			try {
				reader.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	
	
	
	
	
	}
}
