package com.cxytiandi.sharding.po;

/**
 * @description:
 * @author: mmc
 * @create: 2020-03-12 12:11
 **/

public class ShareDb {

    private Integer id;

    private long start;

    private long end;

    private String dbName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}
