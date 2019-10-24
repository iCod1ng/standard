package com.bb.standard.utils.report;

import com.bb.standard.utils.report.base.Template;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExcelTemplate extends Template {

    @Override
    public List<Serializable> read(InputStream inputStream) throws Exception {
        List<Serializable> list = new ArrayList<>();
        return list;
    }

    @Override
    public void write(List<Serializable> data) throws Exception {

    }
}
