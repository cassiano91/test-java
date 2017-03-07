package main;

import java.util.Random;

public class Teste2 {
	public Integer teste = 0;

	public static void main(String[] args) {

		for (Integer i = 0; i < 10; i++) {
			Runnable r = () -> {
				Integer x = new Random().nextInt(10);

				Programa p1 = new Programa();
				p1.setId(x);
				p1.testar();
			};

			Thread t = new Thread(r);
			t.start();
		}

	}

}
