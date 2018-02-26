package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * Created by meres on 2/26/18.
 */
public class TrainTachograph {
    Table<String, Integer, Integer> t;

    public TrainTachograph(){
        t = HashBasedTable.create();
    }


    public boolean isEmpty(){
        return t.isEmpty();
    }

    public void add(String time, int position, int speed){
        t.put(time, position, speed);
    }
}
