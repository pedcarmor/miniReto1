package mini.reto;

import java.util.List;

public class Mayores10 {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(18,6,4,15,55,78,12,9,8);
		
		Long mayores10 = numbers.stream().filter(l->l.intValue()>10).count();
		System.out.println(mayores10);
	}
}
