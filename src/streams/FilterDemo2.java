package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("cat", "forest", null, "sky", null, "book", "theatre", null);

		List<String> result = new ArrayList<String>();

		result= words.stream().filter(w -> w != null).collect(Collectors.toList());
		System.out.println(result);

	}

}
