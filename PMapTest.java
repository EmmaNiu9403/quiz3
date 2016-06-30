/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */
package pMap.phaseA;

import static org.junit.Assert.*;

import org.junit.Test;

public class PMapTest {

	@Test
	public void test1() {
    	System.out.println("Test put:");
		PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		System.out.println("\n" + pmap.size());
		int[] keys = pmap.keys();
		for (int i : keys) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] values = pmap.values();
		for (int i : values) {
			System.out.print(i + " ");
		}
		System.out.println(pmap.size());
	}

	@Test
	public void testRemoveMiddle() {
    	System.out.println("Test remove in the middle:");
		PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		System.out.println(pmap.size());
		int[] keys = pmap.keys();
		for (int i : keys) {
			System.out.print(i + " ");
		}
		pmap.remove(1);
		System.out.println("\n" + pmap.size());
		int[] keyss = pmap.keys();
		for (int i : keyss) {
			System.out.print(i + " ");
		}

	}

	@Test
	public void testPutall() {
		System.out.println("TEST PUTALL");
		PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		int[] keys = { 5, 4, 3, 2 };
		int[] values = { 6, 5, 4, 10 };
		pmap.putAll(keys, values);
		System.out.println(pmap.size());
		Entry[] entry = pmap.entrys();
		for (int i = 0; i < entry.length; i++) {
			System.out.println("[" + entry[i].GetKey() + "," + entry[i].GetValue() + "]");
		}

	}

	@Test
	public void testRemoveBeginning() {
		System.out.println("TEST remove beginning");
		PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		Entry[] entry = pmap.entrys();
		for (int i = 0; i < entry.length; i++) {
			System.out.println("[" + entry[i].GetKey() + "," + entry[i].GetValue() + "]");
		}
pmap.remove(0);
Entry[] entry2 = pmap.entrys();
for (int i = 0; i < entry2.length; i++) {
	System.out.println("[" + entry2[i].GetKey() + "," + entry2[i].GetValue() + "]");
}

	}
	
	@Test
	public void testRemoveend() {
		System.out.println("TEST remove end");
		PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		Entry[] entry = pmap.entrys();
		for (int i = 0; i < entry.length; i++) {
			System.out.println("[" + entry[i].GetKey() + "," + entry[i].GetValue() + "]");
		}
pmap.remove(2);
Entry[] entry2 = pmap.entrys();
for (int i = 0; i < entry2.length; i++) {
	System.out.println("[" + entry2[i].GetKey() + "," + entry2[i].GetValue() + "]");
}

	}
	
    @Test
    public void testClear(){
    	System.out.println("Test clear:");
    	PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		pmap.clear();
		Entry[] entry = pmap.entrys();
		for (int i = 0; i < entry.length; i++) {
			System.out.println("[" + entry[i].GetKey() + "," + entry[i].GetValue() + "]");
		}
		
    }
    
    @Test
    public void testIsEmpty(){
    	System.out.println("Test empty:");
    	PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		pmap.clear();
		Entry[] entry = pmap.entrys();
		for (int i = 0; i < entry.length; i++) {
			System.out.println("[" + entry[i].GetKey() + "," + entry[i].GetValue() + "]");
		}
		System.out.println("Is pmap empty? " + pmap.isEmpty());
		assertEquals(true, pmap.isEmpty());

    }
    @Test
    public void testContainsKey1(){
    	System.out.println("contains key test:");
    	PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		assertEquals(true, pmap.containsKey(0));

    	
    }
	
    @Test
    public void testContainsKey2(){
    	System.out.println("contains key test:");
    	PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		assertEquals(false, pmap.containsKey(7));

    	
    }
    
    @Test
    public void testContainsValue(){
    	System.out.println("contains value test:");
    	PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		assertEquals(true, pmap.containsValue(1));

    	
    }
    
    @Test
    public void testContainsValue2(){
    	System.out.println("contains value test:");
    	PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		assertEquals(false, pmap.containsValue(7));

    	
    }
    @Test
    public void testGetValue(){
    	System.out.println("gete test:");
    	PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		assertEquals(1,pmap.get(0));
    	
    }
    @Test
    public void testGetValue2(){
    	System.out.println("gete test:");
    	PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		assertEquals(0,pmap.get(7));
    	
    }
    
}
