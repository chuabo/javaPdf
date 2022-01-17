package com.tlsoft;//用freemaker框架读取模板，并把map值注入
//String htmlStr = HtmlGenerator.generate(htmlName, map);

//po出我工具类的代码
import com.tlsoft.Constant;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class HtmlGenerator {

    public static String generate(String template, Map<String,Object> variables) throws IOException, TemplateException, IOException {
        //Configuration config = FreemarkerConfiguration.getConfiguation();
        Configuration config = new Configuration(Configuration.VERSION_2_3_21);
        //读取模板文件地址
        config.setDirectoryForTemplateLoading(new File(Constant.templatePath));
        config.setDefaultEncoding("UTF-8");
        //获取模板文件
        Template tp = config.getTemplate(template);
        StringWriter stringWriter = new StringWriter();
        BufferedWriter writer = new BufferedWriter(stringWriter);
        tp.setEncoding("UTF-8");
        //把map数据写入
        tp.process(variables, writer);
        String htmlStr = stringWriter.toString();
        writer.flush();
        writer.close();
        return htmlStr;
    }

    public static void main(String[] args) throws Exception {
        Map <String, Object> map = new HashMap<>();
        //String htmlStr = HtmlGenerator.generate("", map);
        //byte[] bytes = PdfDocumentGenerator.pdfgenerate(htmlStr);
    }
}