/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */
package pMap.phaseB;

import java.util.*;

/**
 * PMap stands for Paired Map. A map is a collection of key value pairs, e.g.,
 * (1, "one") (2, "two") (3, "three") are all pairs with a key that's a integer and a value
 * that's an string.
 */

public class PMap implements Map<Integer,String> {
	private ArrayList<MyEntry> map = new ArrayList<MyEntry>();
	
	@Override
	public int size() 
	{
		return map.size();
	}

	@Override
	public boolean isEmpty() 
	{
		return (map.isEmpty());
	}

	@Override
	public boolean containsKey(Object key) 
	{
		if(!(key instanceof Integer))
		{
			return false;
		}
		Integer keys = (Integer)key;
		for(int i = 0;i < map.size();i++)
		{
			if(map.get(i).getKey()==keys)
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		if(!(value instanceof String))
		{
			return false;
		}
		String values = (String)value;
		for(int i = 0;i < map.size();i++)
		{
			if(map.get(i).getValue().equals(values))
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String get(Object key) {
		if(!(key instanceof Integer))
		{
			return null;
		}
		
		for(int i = 0;i<map.size();i++)
		{
			if(map.get(i).getKey() == key)
			{
				return map.get(i).getValue();
			}
		}
		return null;
	}

	@Override
	public String put(Integer key, String value) {
		for(int i = 0;i<map.size(); i++)
		{
			if(map.get(i).getKey() == key)
			{
				String temp = map.get(i).getValue();
				map.get(i).setValue(value);
				return temp;
			}
		}
		MyEntry temp = new MyEntry(key,value);
		map.add(temp);
		return value;
	}

	@Override
	public String remove(Object key) {
		if(!(key instanceof Integer))
		{
			return null;
		}
		
		for(int i = 0;i<map.size();i++)
		{
			if(map.get(i).getKey() == key)
			{
				String temp = map.get(i).getValue();
				map.remove(i);
				return temp;
			}
		}
		return null;
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends String> m) {
		ArrayList<Integer> keys = (ArrayList<Integer>) m.keySet();
		for(int i = 0;i < keys.size();i++)
		{
			boolean flag = false;
			for(int j = 0;j < map.size();j++)
			{
				if(map.get(j).getKey() == keys.get(i))
				{
					flag = true;
					map.get(i).setValue(m.get(keys.get(i)));
				}
			}
			if(flag == false)
			{
				MyEntry temp = new MyEntry(keys.get(i),m.get(keys.get(i)));
				map.add(temp);
			}
		}
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public Set<Integer> keySet() {
		Set<Integer> keySet = new HashSet<Integer>();
		
		for(int i = 0; i < map.size(); i++)
		{
			keySet.add(map.get(i).getKey());
		}
		
		return keySet;
	}

	@Override
	public Collection<String> values() {
		ArrayList<String> valueSet = new ArrayList<String>();
		
		for(int i = 0;i <map.size();i++)
		{
			valueSet.add(map.get(i).getValue());
		}
		
		return valueSet;
	}

	@Override
	public Set<Entry<Integer, String>> entrySet() {
		Set<Entry<Integer, String>> entrySet = new HashSet<Entry<Integer, String>>();
		for(int i = 0;i < map.size();i++)
		{
			MyEntry temp = new MyEntry(map.get(i).getKey(),map.get(i).getValue());
			entrySet.add(temp);
		}
		
		return entrySet;
	}

	

}
