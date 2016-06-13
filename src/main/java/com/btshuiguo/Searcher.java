package com.btshuiguo;

import java.util.List;

/**
 * Created by rock on 16/6/13.
 */
public interface Searcher {

    List<Record> findList(String keyword,int pageIndex);
}
