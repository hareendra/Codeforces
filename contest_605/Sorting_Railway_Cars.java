import java.io.*;

class Main {
	public static void main(String[] args)
					throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pr = new PrintWriter("output.txt", "UTF-8");
		try {
    			String line = br.readLine();
			while (line != null) {
				pr.println(doOperation(line));
			}    
		}
		finally {
   			 br.close();
   			 pr.close();
		}	
	}
	
	public static String doOperation(String input) {
		return input;
	}
}
