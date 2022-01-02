package logic.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import logic.Gift;
import logic.Person;
import logic.Travel;

public abstract class FileUtil {

	public static void loadFileClients(String fileName,
			List<Person> clientsList) {

		String line;
		String[] personData = null;

		try {
			BufferedReader file = new BufferedReader(new FileReader(fileName));
			while (file.ready()) {
				line = file.readLine();
				personData = line.split("@");
				clientsList.add(new Person(personData[0], personData[1],
						returnPersonCanPlay(Integer.parseInt(personData[2]))));
			}
			file.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found.");
		} catch (IOException ioe) {
			new RuntimeException("I/O Error.");
		}
	}

	public static void loadFileGifts(String fileName, List<Gift> giftsList) {

		String line;
		String[] giftData = null;

		try {
			BufferedReader file = new BufferedReader(new FileReader(fileName));
			while (file.ready()) {
				line = file.readLine();
				giftData = line.split("@");
				giftsList.add(new Gift(giftData[0], giftData[1], giftData[2],
						giftData[3], Integer.valueOf(giftData[4])));
			}
			file.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found.");
		} catch (IOException ioe) {
			new RuntimeException("I/O Error.");
		}
	}

	public static void saveToFile(String fileName, String client,
			List<Gift> gifts, List<Travel> travels) {
		try {
			BufferedWriter file = new BufferedWriter(
					new FileWriter("resources/files/" + fileName + ".dat"));
			String line = "--- GIFTS ---\n";
			for (Gift gift : gifts) {
				line += client + "@" + gift.toStringFile() + "\n";
			}
			String line2 = "--- TRAVELS ---\n";
			for (Travel travel : travels) {
				line2 += client + "@" + travel.toStringComplete() + "\n";
			}
			file.write(line);
			file.write(line2);
			file.close();
		}

		catch (FileNotFoundException fnfe) {
			System.out.println("The file could not be saved.");
		} catch (IOException ioe) {
			new RuntimeException("I/O Error.");
		}
	}

	public static String setFileName() {
		String code = "";
		String base = "0123456789abcdefghijklmnopqrstuvwxyz";
		int length = 8;
		for (int i = 0; i < length; i++) {
			int numero = (int) (Math.random() * (base.length()));
			code += base.charAt(numero);
		}
		return code;
	}

	private static boolean returnPersonCanPlay(Integer value) {
		if (value == 0) {
			return false;
		} else {
			return true;
		}
	}
}
