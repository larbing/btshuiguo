package com.btshuiguo.search;

import java.util.List;

/**
 * Created by rock on 16/6/13.
 */
public class Page<E> {

    private List<E> results;
    private int count;

    public Page(List<E> results, int count) {
        this.results = results;
        this.count = count;
    }

    public List<E> getResults() {
        return results;
    }

    public void setResults(List<E> results) {
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
