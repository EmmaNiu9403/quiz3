/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */

package pMap.phaseB;

import java.util.Map;

/**
 * Map.Entry. Assume that key is an integer and value is a string.
 */

public class MyEntry implements Map.Entry<Integer,String> {
	private Integer key;
	private String value;
	
	public MyEntry()
	{
		this.key = 0;
		this.value = null;
	}
	
	public MyEntry(Integer key, String value)
	{
		this.key = key;
		this.value = value;
	}
	
	@Override
	public Integer getKey() {
		return key;
	}
	
	@Override
	public String getValue(){
		return value;
	}
	
	@Override
	public String setValue(String value) {
		this.value = value;
		return value;
	}
	
	


}
