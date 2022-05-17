package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadingDemoMain {
	public static void main(String[] args) {
		
//burada dosya okuma ile ilgili iþlemler yapacaðýz ancak þöyle bir
//durum varki dosya ile ilgili iþlemleri try catch içinde yapmamýz
//gerekiyor.		
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\Ýsmail Can Varlý"
					+ "\\OneDrive\\Masaüstü\\ders\\2. yýl\\nyp java\\BTKwork"
					+ "\\src\\ReadingFileDemo\\numbers.txt"));
			String line = null;
		    
			while((line = reader.readLine())!= null){
//dosyadaki string ifadeyi int'e çevirdi. Yani cast iþlemi.				
				total += Integer.valueOf(line);
				
			}
			System.out.println("Toplam: " + total);
			
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (Exception e) {
// bu while döngüsünde oluþturduðumuz reader içindi.
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
