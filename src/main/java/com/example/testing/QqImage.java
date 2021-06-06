package com.example.testing;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;


import java.io.File;
import java.io.IOException;

public class QqImage {
    public static final String DEST = "./target/sandbox/objects/hl_pic.pdf";

    public static void main(String[] args) throws IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        manipulatePdf(DEST);
        System.out.println("Operation success");
    }

    public static void manipulatePdf(String dest) throws IOException {
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document doc = new Document(pdfDoc, new PageSize(60, 140));
        doc.setMargins(5, 5, 5, 5);


        String imFile = "C:/Users/Dellumiel/Desktop/logo.png";
        ImageData data = ImageDataFactory.create(imFile);
        Image image = new Image(data);
        image.setRotationAngle(Math.toRadians(45));
        doc.add(image);


        doc.close();
    }
}
