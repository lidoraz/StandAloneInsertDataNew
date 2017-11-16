package com.xyz;

public abstract class Dto {

    public long getCreatedOnTimestamp() {
        return createdOnTimestamp;
    }

    public void setCreatedOnTimestamp(long createdOnTimestamp) {
        this.createdOnTimestamp = createdOnTimestamp;
    }

    private long createdOnTimestamp=0;



}
