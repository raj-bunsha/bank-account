import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample1{
	public static void main(int account,String str) {
        final String FILENAME = "C:/Users/Raj/Desktop/bank account/"+account+".txt";
		BufferedWriter bw = null;
		FileWriter fw = null;
		String data=str;
		try {
			File file = new File(FILENAME);
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			EnglishtoMorse raj=new EnglishtoMorse();
			data=raj.takeEnglish(str);
			bw.write(data+"\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}