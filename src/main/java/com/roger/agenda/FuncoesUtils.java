package com.roger.agenda;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class FuncoesUtils {
    
    public ByteArrayInputStream imageToBlob(Image foto) throws IOException{
        BufferedImage bi = new BufferedImage(foto.getWidth(null), foto.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            ImageIO.write(bi, "png", baos);
        } finally {
            try {
                baos.close();
            } catch (Exception e) {
            }
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        return bais;
    }
}
