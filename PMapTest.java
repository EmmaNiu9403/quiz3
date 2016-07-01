/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */
package pMap.phaseB;

import java.util.Collection;
import java.util.Set;

import org.junit.Test;

public class PMapTest {

	@Test
	public void test1() {
		PMap pmap = new PMap();
		pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		//pmap.containsKey(1);
		
		System.out.println(pmap.size());
		Set<Integer> keys = pmap.keySet();
		for (Integer i : keys) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collection<String> values = pmap.values();
		for (String i : values) {
			System.out.print(i + " ");
		}
		System.out.println(pmap.size());
	}
}
