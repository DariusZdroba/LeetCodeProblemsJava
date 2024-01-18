package TimeMap;

import java.util.*;

public class TimeMap {
    ArrayList<Triple> triples = new ArrayList<>(10);

    public TimeMap() {
        }

    public void set(String key, String value, int timestamp) {
    Triple triple = new Triple(key,value,timestamp);
        triples.add(triple);

    }

    public String get(String key, int timestamp) {
        Triple temp = new Triple("","",0);
        Iterator<Triple> iterator = triples.iterator();
        while(iterator.hasNext())
        {
            Triple i = iterator.next();
            if(i.key.equals(key) && i.timestamp == timestamp) return i.value;
            if(i.key.equals(key))
            {
                if(i.timestamp >= temp.timestamp && i.timestamp < timestamp) temp = i;
            }

        }
        if(!temp.key.equals("")) return temp.value;
        return "";
    }
}
