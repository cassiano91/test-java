package main;

import java.util.Date;

public class Programa implements Runnable {

	private Integer id;
	// colocar getter e setter pro atributo id

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("----" + i + "----");
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("++++" + i + "++++");
		}
	}
	
	public void testar() {
		for (int x = 1; x <= 100; x++) {
			Date data = new Date();
			String str = getIdStr();
			
			System.out.println(str + "(" + x + ")" + data);
		}
	}

	public Integer getId() {
		return id;
	}
	
	public String getIdStr() {
		String str = "Vazio";
		
		switch (this.getId()) {
			case 0:
				str = "Zero";
				break;

			case 1:
				str = "Um";
				break;
				
			case 2:
				str = "Dois";
				break;
				
			case 3:
				str = "Tres";
				break;
				
			case 4:
				str = "Quatro";
				break;
				
			case 5:
				str = "Cinco";
				break;
				
			case 6:
				str = "Seis";
				break;
				
			case 7:
				str = "Sete";
				break;
				
			case 8:
				str = "Oito";
				break;
				
			case 9:
				str = "Nove";
				break;
				
			case 10:
				str = "Dez";
				break;
				
			default:
				break;
		}
		
		return str;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}