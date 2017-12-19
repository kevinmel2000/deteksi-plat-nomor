
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nanda-PC
 */
public class Controller {
    BufferedImage image=null;
    BufferedImage grayscale =null;
    BufferedImage binary = null;
    BufferedImage canny=null;
    BufferedImage medianfilter=null;
    BufferedImage test1=null;
    BufferedImage test1_1=null;
    BufferedImage test1_2=null;
         
    BufferedImage test2=null;
    BufferedImage test3=null;
    BufferedImage test4=null;
    BufferedImage test5=null;
    public Controller(BufferedImage original){
        this.image = original;
    }
    
    public void setGrayscale(){
        Grayscale gray = new Grayscale(image);
        gray.process();
        grayscale = gray.getGrayScale();
    }
    
    public BufferedImage getGrayScale(){
        return grayscale;
    }
    
    public void setBinary(BufferedImage image){
        Binary biner = new Binary(image);
        biner.process();
        binary= biner.getBinary();
    }
    
    public BufferedImage getBinary(){
        return binary;
    }
    
    public void setCanny(BufferedImage image){
        CannyDetector cany = new CannyDetector();
        //low;200ratio=24
        cany.setImage(image,200,24);
        cany.processEdge();
        canny= cany.getImage(); 
    }
    
    public BufferedImage getCanny(){
        return canny;
    }
    
    public void setMedian(BufferedImage image){
        MedianFilter median = new MedianFilter();
        median.setImage(image);
        median.medianFilter(5, 5);
        medianfilter= median.getImage();
        setBinary(medianfilter);
        medianfilter=binary;
    }
    
    public BufferedImage getMedian(){
        return medianfilter;
    }
    
    public void setSeparator(BufferedImage image){
       Separator s = new Separator();
       s.setImage(image);
       s.process();
       test1_1= s.getImage1_1();
       test1_2 = s.getImage1_2();
       test1=s.getImage();
       test2=s.getImage2();
       test3=s.getImage3();
       test4=s.getImage4();
       test5=s.getImage5();
    }
    
    public BufferedImage getSeparator1(){
        return test1;
    }
    
    public BufferedImage getSeparator2(){
        return test2;
    }
    
    public BufferedImage getSeparator3(){
        return test3;
    }
    
    public BufferedImage getSeparator4(){
        return test4;
    }
    
    public BufferedImage getSeparator5(){
        return test5;
    }
    
    public BufferedImage getSeparator1_1(){
         return test1_1;
     }
     public BufferedImage getSeparator1_2(){
         return test1_2;
     }
    
    
}
