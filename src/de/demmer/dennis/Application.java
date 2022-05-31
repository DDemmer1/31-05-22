package de.demmer.dennis;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Application {
	
		public static void main(String[] args) {
			
			
			FileUtil fileUtil = new FileUtil();
			
			fileUtil.printDirectory(new File("/home/dennis/flickr-scrape-master"), new File("scraper.py"));
			
			
		}

}
