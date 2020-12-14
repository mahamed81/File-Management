package com.business.data;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.busniess.rule.*;

public class LockersFeatures implements BusinessRuleInterface {

	String path = System.getProperty("user.dir") + "\\MainDirectory";
	Scanner sc = new Scanner(System.in);

	@Override
	public void addFile() throws IOException{
		System.out.println(" Enter the file name");
		sc.nextLine();
		String fileName = sc.nextLine();
		File f = new File(path + "/" + fileName);
		if (!f.exists()) {
				f.createNewFile();
			System.out.println(" The file " + fileName + " has been added");
		} else {
			System.out.println("File already exists");
		}
	}

	@Override
	public void createDir() {
		File theDir = new File("MainDirectory");
		if (!theDir.exists()) {
			theDir.mkdirs();
			System.out.println(" folder is created");
		}
	}

	@Override
	public void deleteFile(){
		System.out.println("Enter the file to delete");
		sc.nextLine();
		String file = sc.nextLine();

		File toDel = new File(path + "/" + file);

		if (toDel.exists()) {
			toDel.delete();

			System.out.println(" File has been deleted");
		} else {
			System.out.println("File not found ");		
		}
	}

	@Override
	public void searchFile() {
		System.out.println("Enter the file to found");
		sc.nextLine();
		String find = sc.nextLine();
		File f = new File(path);
		List<String> li = new ArrayList<String>(Arrays.asList(f.list()));

		boolean containsSearchStr = li.stream().anyMatch(find::equalsIgnoreCase);

		if (containsSearchStr) {
			System.out.println("the file " + find + " was found");
		} else {
			
			System.out.println("the file " + find + " does not exist");
		}
	}

	@Override
	public void showFiles() {
		File f = new File(path);

		List<String> li = new ArrayList<String>(Arrays.asList(f.list()));

		if (li.size() > 0) {
			li.stream().sorted().forEach(System.out::println);
		} else {
			System.out.println("Currenlty there are no files in the current directory");
		}
	}
}
