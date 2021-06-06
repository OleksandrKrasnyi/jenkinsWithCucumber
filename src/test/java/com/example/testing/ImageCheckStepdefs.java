package com.example.testing;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

public class ImageCheckStepdefs {

    String dest = "/hl_pic.pdf";
    PdfWriter writer;
    PdfDocument pdfDoc;
    Document document;
    Image image;
    ImageData data;
    String imageLocation = "C:/Users/Dellumiel/Desktop/logo.png";



    @Given("^a new PDF-document \"([^\"]*)\"$")
    public void aNewPDFDocument(String dest) throws Throwable {
        writer = new PdfWriter(dest);
        pdfDoc = new PdfDocument(new PdfWriter(dest));
        document = new Document(pdfDoc);
        data = ImageDataFactory.create(imageLocation);
        image = new Image(data);
        document.add(image);


//        preProcessImage(imageLocation);
//        document.add(image);
    }

    @When("^\"([^\"]*)\" is preprocessed$")
    public void preProcessImage(String imageLocation) throws Throwable {
        data = ImageDataFactory.create(imageLocation);
        image = new Image(data);
        document.add(image);
    }




    @Then("^the PDF-document is closed$")
    public void thePDFDocumentIsClosed() {
        document.close();
    }


}
