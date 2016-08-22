package java8.features.basic;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Fitur ini tersedia di java 8 */

public class StreamBasic {

	public void asList() {
		/* Mengisikan list secara langsung dengan metode AsList*/
		List<Integer> listData = Arrays.asList(5, 4, 88, 76, 55, 23, 7, 20, 45);
		listData.stream()
			.filter(p -> p % 2 == 1)
			.forEach(i -> System.out.print(i + " "));

	}

	public void filterList() {
		List<Integer> listData = Arrays.asList(5, 4, 88, 76, 55, 23, 7, 20, 45);

		Stream<Integer> s = listData.stream()
				.filter(p -> {
					System.out.println("Menyaring " + p);
					return p % 2 == 1;
				});

		System.out.println("Data sudah disaring tinggal dicetak");
		s.forEach(i -> System.out.println(">>>" + i));
	}

	public void findFirst() {
		List<Integer> l = Arrays.asList(5, 4, 88, 76, 55, 23, 7, 20, 45);

		Stream<Integer> s = l.stream().filter(p -> {
			System.out.println("Menyaring " + p);
			return p % 2 == 1;
		});

		Optional<Integer> result = s.findFirst();
		System.out.println(result.get());
	}
	
	public void paralelStream() {
		/* Sample 1 */
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);
		
		/* Sample 2 */
		List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		long count = strings2.parallelStream().filter(string -> string.isEmpty()).count();	
		System.out.println(count);
	}
	
	public void randomLimit() {
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}
	
	public void map() {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
	}
	
	public void filter() {
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
	}
	
	public void randomInts() {
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}
	
	public void collectors() {
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
	}
	
	public void statistics() {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
	}
	

	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	

	public static void main(String[] args) {
		StreamBasic streamBasic = new StreamBasic();
//		streamBasic.asList();
//		streamBasic.findFirst();
//		streamBasic.filterList();
// 		streamBasic.paralelStream();
//		streamBasic.randomLimit();
//	    streamBasic.map();
		streamBasic.statistics();
		/* Dan lainnya silahkan dicoba satu persatu metodenya
		yang sudah tertulis diatas atau didalam class ini */
		
	}
}
