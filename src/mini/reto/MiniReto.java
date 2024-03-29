package mini.reto;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class MiniReto {

	public static void main(String[] args) {
	
		List<String> list = List.of("Juan Garcia", "Pepe Jimenez", "Juan Jimenes", "Pepe Garcia");
		
		List<String> ls = list.stream().filter(p->p.endsWith("a")).collect(Collectors.toList());
		System.out.println(ls);
		
		DoubleStream stream = DoubleStream.of(5.2, 4.2, 6.3).map(p->p +2.5);
		stream.forEach(System.out::println);
	}
}
