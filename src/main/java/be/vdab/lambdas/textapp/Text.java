package be.vdab.lambdas.textapp;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Text {

	private String sentence;
	
	public Text(String sentence) {
		this.sentence = sentence;
	}
	
	public void printFilteredWords(Predicate<String> filter) {
		Arrays.stream(sentence.split(" "))
			.filter(filter)
			.forEach(System.out::println);
	}
	
	public void printProcessedWords(Function<String,String> process) {
		Arrays.stream(sentence.split(" "))
		.map(process)
		.forEach(System.out::println);
	}
}
