//File io
import java.io.File;
import java.io.FileNotFoundException;
//Imagework
import java.awt.image;

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

		for(File file : files)
			System.out.println(file.getPath());
	}
	public static void printArray(String[] arr)
	{
		for(String temp : arr)
			System.out.println(temp);
	}

}
