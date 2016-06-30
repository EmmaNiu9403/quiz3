/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */

package pMap.phaseA;

/**
 * Map.Entry, assume that the key and value are both integers.
 */
public class Entry {
	private int key;
	private int value;
	// TODO
	public int GetKey(){
		return key;
	}
	public int GetValue(){
		return value;
	}
	public void SetKey(int k){
		key=k;
	}
	public void SetValue(int v){
		value=v;
	}
	public Entry()
	{
		key=0;
		value=0;
	}
	public Entry(int key, int value){
		this.key=key;
		this.value=value;
		
	}
}
