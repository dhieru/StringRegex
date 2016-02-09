package com.isu.project;

import java.io.*;

public class CanData1 {

	/**
	 * @param args the command line arguments
	 * @throws java.io.IOException
	 */
	public static void main(String[] args){
		FileInputStream fstream;
		PrintStream pw;
		//String strInputFileName;
		//String StrOutputFileName;
		try {
			pw = new PrintStream("C:\\Users\\dheeru\\Desktop\\Karthik\\Output\\newTestData.txt");
			fstream = new FileInputStream("C:\\Users\\dheeru\\Desktop\\Karthik\\Input\\Testdata.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			String strLine2;

			//Read File Line By Line
			while ((strLine = br.readLine()) != null)   {
				// remove spaces from beginning and end of the string 
				strLine2 = strLine.trim();
				strLine2 = strLine2.replaceAll("\\s+", ",");
				//strLine2 = Integer.toHexString(Integer.parseInt("0C"));
				if(!strLine2.contains("Errorframe")){
					System.out.println (strLine2);	
					StringBuilder sb = new StringBuilder(strLine2);
					sb.insert(0, "newTestData.txt,");
					pw.println(sb.toString());
					System.out.println("Writing comleted.");
				}
				// Print the content on the console

			}
			pw.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception occured.");
		}catch (IOException e) {
			System.out.println("IO exception occured.");
		}
	}

}