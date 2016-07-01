/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */
package pMap.phaseB;

import static org.junit.Assert.*;
import java.util.*;
import java.util.Map.Entry;

import org.junit.Test;

public class PMapTest {

	@Test
	public void test1() {
		System.out.println("\nTest put:");
		PMap pmap = new PMap();
		pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		System.out.println("--Size of pmap: " + pmap.size());
		Set<Integer> keys = pmap.keySet();
		for (Integer i : keys) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collection<String> values = pmap.values();
		for (String i : values) {
			System.out.print(i + " ");
		}
		System.out.println("\n--Size of pmap: " + pmap.size());
	}
	
    @Test
    public void testClear(){
    	System.out.println("\nTest clear:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.clear();
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry = pmap.entrySet();
		Iterator iterator = entry.iterator(); 
		while(iterator.hasNext())
		{
			MyEntry temp = (MyEntry) iterator.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
    }
    
    @Test
    public void testIsEmpty(){
    	System.out.println("\nTest empty:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.clear();
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry = pmap.entrySet();
		Iterator iterator = entry.iterator(); 
		while(iterator.hasNext())
		{
			MyEntry temp = (MyEntry) iterator.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
		System.out.println("--Is pmap empty? " + pmap.isEmpty());
		assertEquals(true, pmap.isEmpty());
    }
    
    @Test
    public void testPutAll(){
    	System.out.println("\nTest putAll:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry1 = pmap.entrySet();
		Iterator iterator1 = entry1.iterator(); 
		while(iterator1.hasNext())
		{
			MyEntry temp = (MyEntry) iterator1.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
		Map<Integer, String> m = new HashMap<Integer,String>();
		m.put(1, "five");
		m.put(4, "four");
		m.put(5, "five");
		m.put(6, "six");
		pmap.putAll(m);
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry2 = pmap.entrySet();
		Iterator iterator2 = entry2.iterator(); 
		while(iterator2.hasNext())
		{
			MyEntry temp = (MyEntry) iterator2.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
    }
    
    @Test
    public void testRemoveInMiddle(){
    	System.out.println("\nTest remove in the middle of the map:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.put(4, "four");
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry1 = pmap.entrySet();
		Iterator iterator1 = entry1.iterator(); 
		while(iterator1.hasNext())
		{
			MyEntry temp = (MyEntry) iterator1.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
		pmap.remove(2);
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry2 = pmap.entrySet();
		Iterator iterator2 = entry2.iterator(); 
		while(iterator2.hasNext())
		{
			MyEntry temp = (MyEntry) iterator2.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
    }
    
    @Test
    public void testRemoveInBeginning(){
    	System.out.println("\nTest remove element at the beginning of the map:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.put(4, "four");
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry1 = pmap.entrySet();
		Iterator iterator1 = entry1.iterator(); 
		while(iterator1.hasNext())
		{
			MyEntry temp = (MyEntry) iterator1.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
		pmap.remove(1);
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry2 = pmap.entrySet();
		Iterator iterator2 = entry2.iterator(); 
		while(iterator2.hasNext())
		{
			MyEntry temp = (MyEntry) iterator2.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
    }
    
    @Test
    public void testRemoveAtEnd(){
    	System.out.println("\nTest remove element at the end of the map:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.put(4, "four");
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry1 = pmap.entrySet();
		Iterator iterator1 = entry1.iterator(); 
		while(iterator1.hasNext())
		{
			MyEntry temp = (MyEntry) iterator1.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
		pmap.remove(4);
		System.out.println("--printing pmap:");
		Set<Entry<Integer, String>> entry2 = pmap.entrySet();
		Iterator iterator2 = entry2.iterator(); 
		while(iterator2.hasNext())
		{
			MyEntry temp = (MyEntry) iterator2.next();
			System.out.println("[" + temp.getKey() + "," + temp.getValue() + "]");
		}
    }
    
    @Test
    public void testContainsKey1(){
    	System.out.println("\ncontains key test:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.put(4, "four");
		assertEquals(true, pmap.containsKey(1));
    }
	
    @Test
    public void testContainsKey2(){
    	System.out.println("\ncontains key test:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.put(4, "four");
		assertEquals(false, pmap.containsKey(7));
    }
    
    @Test
    public void testContainsValue(){
    	System.out.println("\ncontains value test:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.put(4, "four");
		assertEquals(true, pmap.containsValue("two"));
    }
    
    @Test
    public void testContainsValue2(){
    	System.out.println("\ncontains value test:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.put(4, "four");
		assertEquals(false, pmap.containsValue("false"));	
    }
    
    @Test
    public void testGetValue(){
    	System.out.println("\nget test:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.put(4, "four");
		assertEquals("one",pmap.get(1));
    }
    
    @Test
    public void testGetValue2(){
    	System.out.println("\nget test:");
    	PMap pmap = new PMap();
    	pmap.put(1, "one");
		pmap.put(2, "two");
		pmap.put(3, "three");
		pmap.put(4, "four");
		assertEquals(null,pmap.get(7));
    }
}
