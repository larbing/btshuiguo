package com.btshuiguo.search;

import com.btshuiguo.search.Record;


/**
 * Created by rock on 16/6/13.
 */
public interface Searcher {

    Page<Record> findList(String keyword,int pageIndex);
}
