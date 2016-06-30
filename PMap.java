/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */
package pMap.phaseA;

/**
 * PMap stands for Paired Map. A map is a collection of key value pairs, e.g.,
 * (1, 2) (2, 3) (3, 4) are all pairs with a key that's a integer and a value
 * that's an integer
 */
public class PMap {
	private Entry[] map = new Entry[100];
	private int size = 0;

	public int size() {
		// TODO Auto-generated method stub

		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}

	public boolean containsKey(int key) {

		for (int i = 0; i < size; i++) {
			if (map[i].GetKey() == key) {
				return true;
			}
		}
		return false;
	}

	public boolean containsValue(int value) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			if (map[i].GetValue() == value)
				return true;
		}
		return false;
	}

	public int get(int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			if (map[i].GetKey() == key) {
				return map[i].GetValue();
			}
		}
		return 0;
	}

	public int put(int key, int value) {
		for (int i = 0; i < size; i++) {
			if (map[i].GetKey() == key) {
				int temp = map[i].GetValue();
				map[i].SetValue(value);
				return temp;
			}
		}
		if (size >= map.length)
			return 0;
		else {
			Entry temp = new Entry(key,value);
			map[size] = temp;
			size++;
			return 0;

		}

	}

	public int remove(int key) {
		// TODO return value
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (map[i].GetKey() == key) {
				index = i;
				if (i == map.length - 1) {
					size--;
					return map[i].GetValue();
				} else {
					int temp = map[i].GetValue();
					for (int j = i + 1; j < size; j++) {
						map[j - 1].SetKey(map[j].GetKey());
						map[j - 1].SetValue(map[j].GetValue());
					}
					size--;
					return temp;
				}
			}
		}
		return 0;
	}

	public void putAll(int[] keys, int[] values) {
		// TODO Auto-generated method stub
		for (int i = 0; i < keys.length; i++) {
			boolean flag = false;
			for (int j = 0; j < size; j++) {
				if (keys[i] == map[j].GetKey()) {
					map[j].SetValue(values[i]);
					flag = true;
				}
			}
			if (flag == false) {
				Entry temp = new Entry(keys[i],values[i]);
				map[size] = temp;
				size++;
			}

		}
	}

	public void clear() {
		// TODO Auto-generated method stub
		size = 0;

	}

	public int[] keys() {
		// TODO Auto-generated method stub
		int[] keys = new int[size];
		for (int i = 0; i < size; i++) {
			keys[i] = map[i].GetKey();
		}
		return keys;
	}

	public int[] values() {
		// TODO Auto-generated method stub
		 int [] values = new int[size];
		    for(int i=0;i<size;i++){
		    	values[i]=map[i].GetValue();}
		return values;
	}

	public Entry[] entrys() {
		// TODO Auto-generated method stub
		Entry [] entries =new Entry[size];
		for(int i=0;i<size;i++){
			entries[i] = new Entry(map[i].GetKey(),map[i].GetValue());
			
		}
		return entries;
	}

}
