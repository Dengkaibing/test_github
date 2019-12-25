package com.example.demo.Config;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class Page implements Pageable {
    private  int size;
    private int page;

    public Page() {
    }

    public Page(int size, int page) {
        this.size = size;
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public boolean isPaged() {
        return true;
    }

    @Override
    public int getPageNumber() {
        return this.getPage();
    }

    @Override
    public int getPageSize() {
        return this.getSize();
    }

    @Override
    public long getOffset() {
        return 0;
    }

    @Override
    public Sort getSort() {
        return null;
    }

    @Override
    public Pageable next() {
        return null;
    }

    @Override
    public Pageable previousOrFirst() {
        return null;
    }

    @Override
    public Pageable first() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }
}
