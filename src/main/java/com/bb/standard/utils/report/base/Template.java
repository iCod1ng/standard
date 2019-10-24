package com.bb.standard.utils.report.base;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

public abstract class Template {

    /**
     * 读取内容
     * @param inputStream
     * @return
     * @throws Exception
     */
    public abstract List<Serializable> read(InputStream inputStream) throws  Exception;

    /**
     * 写入内容
     * @param data
     * @throws Exception
     */
    public abstract void write(List<Serializable> data) throws  Exception;


}
