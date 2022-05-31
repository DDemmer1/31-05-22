package de.demmer.dennis;

import java.io.File;

public class FileUtil {
	
	
	public void printDirectory(File dir, File search) {
		
		if(dir.exists() && dir.isDirectory()) {
			
			for(File file : dir.listFiles()) {
				
				if(file.getName().equals(search.getName())) {
					System.out.println(file.getAbsolutePath());
				}
				//System.out.println(file);
				
				if(file.isDirectory()) {
					printDirectory(file,search);
				}
			}
		} else {
			System.err.println("Pfad ist kein Verzeichnis oder existiert nicht!");
		}
		
		
	}

}
