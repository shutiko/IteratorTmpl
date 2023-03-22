package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    int min;
    int max;
    protected Random random;


    public int getRandom(int min, int max) {
        return (int) ((Math.random() * (max + 1 - min)) + min);
    }

    public Randoms(int min, int max) {
        //...
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    return getRandom(min, max);
                }
                return null;
            }
        };
    }
}
