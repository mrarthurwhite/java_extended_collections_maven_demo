import org.apache.commons.collections4.*;
import org.apache.commons.collections4.map.HashedMap;
/**
 * @author Numa
 *
 */
public class IterableMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* 
		 1. see example code & paste it
		 1.1 https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/index.html
		 2. see API at: https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/index.html
		 3. get dependency information https://commons.apache.org/proper/commons-collections/dependency-info.html
		 4. add to pom file.
		 5. build
		 */
		// from https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/index.html
		 IterableMap<String,Integer> map = new HashedMap<String,Integer>();
		 map.put("Arthur", 99);
		 MapIterator<String,Integer> score = map.mapIterator();
		 while (score.hasNext()) {
		   String key = score.next();
		   Integer value = score.getValue();
		   System.out.println("Before: " + key + ":" + value);
		   score.setValue(value + 1);
		   System.out.println("After: " +score.getKey() + ":" + score.getValue());
		 }
	
		
	}

}
