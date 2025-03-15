package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> prod = new ArrayList<>();

		System.out.println("Enter the file path: ");

		String filePathstr = sc.nextLine();

		File filePath = new File(filePathstr);
		String folderPath = filePath.getParent();

		boolean sucess = new File(folderPath + "\\out").mkdir();

		String createdFile = folderPath + "\\out\\summary.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line = br.readLine();
			System.out.println("------------------------");
			System.out.println("in.cvs file: ");
			System.out.println("-----------------");
			System.out.println("PRODUCT | PRICE  | QUANTITY ");
			while (line != null) {

				String[] sepLinha = line.split(",");

				String name = sepLinha[0];
				Double price = Double.parseDouble(sepLinha[1]);
				Integer quantity = Integer.parseInt(sepLinha[2]);
				
				
				System.out.println(line);

				prod.add(new Product(name, price, quantity));

				line = br.readLine();

			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(createdFile))) {
				System.out.println("------------------------");
				System.out.println("summary.cvs file: <3 ");
				System.out.println("------------------------");
				System.out.println("PRODUCT | PRICE ");
				System.out.println("update file with ");
				for (Product list : prod) {
					bw.write(list.getName());
					bw.write(list.toString());
					bw.newLine();
					
					System.out.println(list.getName() + list.toString());
					

				}

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
