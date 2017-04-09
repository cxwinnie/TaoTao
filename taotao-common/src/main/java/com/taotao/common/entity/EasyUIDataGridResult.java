package com.taotao.common.entity;

import java.util.List;

/**
 * Created by Xianda Xu on 2017/4/6.
 */
public class EasyUIDataGridResult {

    /**
     * total:总记录数
     */
    private long total;

    /**
     * rows：当前页的记录
     */
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
