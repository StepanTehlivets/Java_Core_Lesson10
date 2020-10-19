package ua.academy.lgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Integer[] array = { getRandomValue(1, 20), getRandomValue(1, 20), getRandomValue(1, 20), getRandomValue(1, 20),
				getRandomValue(1, 20), getRandomValue(1, 20), getRandomValue(1, 20), getRandomValue(1, 20),
				getRandomValue(1, 20) };
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
		
		
	}

	private static int getRandomValue(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value can't be bigger than max value");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;

	}
}
