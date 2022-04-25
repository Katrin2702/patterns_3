package com.company;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }

    public int getRandom() {
        return random.nextInt((max - min) + 1) + min;
    }
}

class RandomsIterator implements Iterator<Integer> {
    private Randoms rand;

    public RandomsIterator(Randoms rand) {
        this.rand = rand;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return rand.getRandom();
    }
}

