package mini.reto;

import java.util.List;

public class CosteProductos {

	public static void main(String[] args) {
		
		List<Product> lp = List.of(new Product("Camiseta Roja",15.5),new Product("Pantalon vaquero",22.7),
				new Product("Sudadera gris",39.75),new Product("Zapatos negros",45.5));
		
		Double suma = lp.stream().mapToDouble(l->l.getPrice()).sum();
		System.out.println(suma+"€");
	}

}
