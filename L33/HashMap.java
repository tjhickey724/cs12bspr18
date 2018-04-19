public class HashMap
{
  int size;
  ArrayList<MapEntry>[] hashtable;
	public HashMap(int size)
	{
    this.size = size;
    this.hashtable = new ArrayList<MapEntry>[this.size];
	}

	public String get(String key)
	{
		int h = key.hashcode() % this.size;
    ArrayList<MapEntry> z = hashtable[h];
    // look through this to see if there is a MapEntry
    // containing key as the key, if so return it ...
	}

	public String put(String key, String value)
	{
    nt h = key.hashcode() % this.size;
    ArrayList<MapEntry> z = hashtable[h];
    MapEntry me = new MapEntry(key,value);
    // check that z is not null ..
    z.add(me);
		return value;
	}

}
