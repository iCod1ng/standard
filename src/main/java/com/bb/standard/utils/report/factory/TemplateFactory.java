package com.bb.standard.utils.report.factory;

import com.bb.standard.utils.report.ExcelTemplate;
import com.bb.standard.utils.report.base.Template;
import com.bb.standard.utils.report.base.Type;

public class TemplateFactory {
    public static Template create(Type type){
        Template template = null;
        switch (type){
            case EXCEL:
                template = new ExcelTemplate();
                break;
        }
        return template;
    }

    public static void main(String[] args) {
        Template template = TemplateFactory.create(Type.EXCEL);
    }
}

