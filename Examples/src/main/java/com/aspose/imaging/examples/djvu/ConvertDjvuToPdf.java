package com.aspose.imaging.examples.djvu;

import com.aspose.imaging.Image;
import com.aspose.imaging.IntRange;
import com.aspose.imaging.examples.Utils;
import com.aspose.imaging.fileformats.djvu.DjvuImage;
import com.aspose.imaging.fileformats.pdf.PdfDocumentInfo;
import com.aspose.imaging.imageoptions.DjvuMultiPageOptions;
import com.aspose.imaging.imageoptions.PdfOptions;

public class ConvertDjvuToPdf {

    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(ConvertDjvuToPdf.class) + "djvu/";
        //ExStart:ConvertDjvuToPdf 
        //Load a DjVu image
        DjvuImage image = (DjvuImage) Image.load(dataDir + "Sample.djvu");

        //Create an instance of PdfOptions
        PdfOptions exportOptions = new PdfOptions();

        //Initialize the metadata for Pdf document
        exportOptions.setPdfDocumentInfo(new PdfDocumentInfo());
        
        //Create an instance of IntRange and initialize it with the range of DjVu pages to be exported
        IntRange range = new IntRange(0, 3); //Export first 3 pages
        
        //Initialize an instance of DjvuMultiPageOptions with range of DjVu pages to be exported 
        exportOptions.setMultiPageOptions(new DjvuMultiPageOptions(range));
        
        //Save the result in PDF format
        image.save(dataDir + "ConvertDjvuToPdf_out.pdf", exportOptions);

        // Display Status.
        System.out.println("File conveted");
    
        //ExEnd:ConvertDjvuToPdf 
    }
}

