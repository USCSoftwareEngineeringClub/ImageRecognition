package net.sourceforge.tess4j.example;
//File io
import java.io.File;
import java.io.FileNotFoundException;
//Imagework
import net.sourceforge.tess4j.*;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String[] pathToFiles = new String[args.length];

		for(int i=0; i<args.length; i++)
			pathToFiles[i] = args[i];

		printArray(pathToFiles);
		interpretImages(pathToFiles);
	}


	public static void interpretImages(String[] paths) throws FileNotFoundException
	{
		File[] files = new File[paths.length];
		for(int i = 0; i < paths.length; i++)
		{
			String temp = paths[i];
				files[i] = new File(temp);
		}

		// ITesseract instance = new Tesseract();
		ITesseract instance = new Tesseract1();
		for(File file : files)
		{
			// System.out.println(file.getPath());
			try{
			String result = instance.doOCR(file);
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	}
	public static void printArray(String[] arr)
	{
		for(String temp : arr)
			System.out.println(temp);
	}

}
