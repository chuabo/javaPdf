package com.tlsoft;//用刚刚得到的html String流 生成pdf
//byte[] bytes = PdfDocumentGenerator.pdfgenerate(htmlStr);






//po出代码
import com.lowagie.text.pdf.BaseFont;
import com.tlsoft.Constant;

//import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.xhtmlrenderer.pdf.ITextRenderer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;

//@Slf4j
public class PdfDocumentGenerator {
    private final static Logger logger = Logger.getLogger(PdfDocumentGenerator.class);

    private final static HtmlGenerator htmlGenerator;
    static {
        htmlGenerator = new HtmlGenerator();
    }


    /*
     *
     * 根据html的内容生成pdf
     *
     */
    public static byte[] pdfgenerate(String htmlContent)throws Exception{

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(new ByteArrayInputStream(htmlContent.getBytes("UTF-8")));
        ITextRenderer iTextRenderer = new ITextRenderer();
        // classpath 路径
        //String outputFileClass = ResourceLoader.getPath("");
        //log.info("Resource Path =====> {}",outputFileClass);
        //添加字体，以支持中文
        iTextRenderer.getFontResolver().addFont(Constant.templatePath + "/fonts/simsun.ttc", BaseFont.IDENTITY_H,BaseFont.NOT_EMBEDDED);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        iTextRenderer.setDocument(doc, null);
        iTextRenderer.layout();
        iTextRenderer.createPDF(out);
        byte[] bytes = out.toByteArray();
        out.close();
        return bytes;
    }

//    public genPdfFile(byte[] bytes) {
//        //用生成的字节流
//        FileOutputStream fout = new FileOutputStream(bytes);
//        //将字节写入文件
//        fout.write(b);
//        fout.close();
//    }
}