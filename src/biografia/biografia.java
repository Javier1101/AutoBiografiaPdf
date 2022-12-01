
package biografia;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;
import javax.swing.JOptionPane;


public class biografia {
     
    //Esta ruta se tiene que ir cambiando para cuando lo quieras mandar
    public static final String CARA="C:\\Users\\brand\\Documents\\PEPS\\BIOGRAFIA-main";
    public static final String DEST="C:\\Users\\brand\\Documents\\PEPS\\BIOGRAFIA-main\\autobiografia.pdf";
    public static void main(String[] args) throws IOException {
        
        new biografia().crearpdf(DEST);
        
        
    }
    
    public void crearpdf(String dest) throws IOException{
    PdfWriter writer= new PdfWriter(dest);
    PdfDocument pdf =new PdfDocument(writer);
    Document document =new Document(pdf);
    Image cara =new Image(ImageDataFactory.create(CARA));   
  
    
    PdfFont font= PdfFontFactory.createFont(FontConstants.TIMES_ITALIC);
    
    
    Paragraph p = new Paragraph("Jose Javier MArtinez Bernal  ")
                    .add(cara)
                    .add("\n\"Mi nombre es José Javier Martinez Bernal tengo 19 años nací en,")
                    .add("\"Toluca de lerdo vivo en la colonia seminario 4 sección tengo 4")
                    .add("hermano 3 mas grandes que yo y uno que es menor me gusta ")
                    .add("mucho el color verde, desde chiquito me gustó mucho la ")
                    .add("tecnología como se creaba y el porqué de todas las cosas me ")
                    .add("amigable ");
                    
              
    
    document.add(p);
    document.close();
    JOptionPane.showMessageDialog(null,"Se CREO LA BIOGRAFIA ");
    
        
        
        
    }
}
