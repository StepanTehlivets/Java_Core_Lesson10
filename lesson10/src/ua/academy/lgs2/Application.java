package ua.academy.lgs2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Car[][] arrayCars = new Car[getRandomValue(1, 10)][getRandomValue(1, 10)];
		for (int i = 0; i < arrayCars.length; i++) {
			for (int j = 0; j < arrayCars[i].length; j++) {
				arrayCars[i][j] = new Car(getRandomValue(10, 100), getRandomValue(2000, 2020));
			}
		}
		while (true) {
			Menu.menu();
			Scanner sc = new Scanner(System.in);

			switch (sc.next()) {
			case "1": {
				System.out.println(Arrays.deepToString(arrayCars));
				break;
			}
			case "2": {
				Car car = new Car(getRandomValue(10, 100), getRandomValue(2000, 2020));
				for (int i = 0; i < arrayCars.length; i++) {
					Arrays.fill(arrayCars[i], car);

				}
				System.out.println(Arrays.deepToString(arrayCars));
				break;
			}
			default: {
				System.out.println("Sorry, wrong input");

			}
			}
		}

	}

	private static int getRandomValue(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value can't be bigger than max value");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;

	}

}
