
import java.awt.Color;
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
public class Separator {
    BufferedImage img=null;
    
    BufferedImage test1=null;
    BufferedImage test1_1=null;
    BufferedImage test1_2=null;
         
    
    BufferedImage test2=null;
    BufferedImage test3=null;
    BufferedImage test4=null;
    BufferedImage test5=null;
  
    
    int w,h;
     public Separator(){
         
     }
     
     public void setImage(BufferedImage img ){
        this.img= img;
        w= img.getWidth();
        h=img.getHeight();
     }
     
     public void process(){
         Color black = Color.BLACK;
         int a = (int) (w*0.2);
         int x=0;
         test1= new BufferedImage(a, h, BufferedImage.TYPE_INT_RGB);
         
          //huruf pertama
         for (int i = 0; i < a; i++) {
             for (int j = 0; j < h; j++) {
                 test1.setRGB(i, j, img.getRGB(i, j));
             }
             // System.out.print("koordinar 1:"+i +"\n");
         }
         
         // System.out.print("koordinar 1:"+ a +"\n");
         int b= (int) (w*0.05);
         test2= new BufferedImage(b, h, BufferedImage.TYPE_INT_RGB);
         //int a= b+b;
         //huruf ke dua
          for (int i = 0; i < b; i++) {
             for (int j = 0; j < h; j++) {
                 test2.setRGB(i, j, img.getRGB(i+a, j));
             }
              if (i==b-1) {
                  //System.out.print("koordinar 2:"+i +"\n");
              }
         }
           
           
         int c = (int) (w*0.4);
         test3= new BufferedImage(c, h, BufferedImage.TYPE_INT_RGB);
        //huruf ke empat
        for (int i = 0; i < c; i++) {
             for (int j = 0; j < h; j++) {
                 test3.setRGB(i, j, img.getRGB(i+(b+a),j));
             } 
             //System.out.print("koordinar 3:"+(i+(a+b)) +"\n");
         }
        
         int d = (int) (w*0.05);
         test4= new BufferedImage(d, h, BufferedImage.TYPE_INT_RGB);
        //huruf ke empat
        for (int i = 0; i < d; i++) {
             for (int j = 0; j < h; j++) {
                 test4.setRGB(i, j, img.getRGB(i+(b+a+c),j));
             } 
             //System.out.print("koordinar 4:"+(i+(a+b+c)) +"\n");
         }
        
         int e = (int) (w*0.3);
         test5= new BufferedImage(e, h, BufferedImage.TYPE_INT_RGB);
        //huruf ke empat
        for (int i = 0; i < e; i++) {
             for (int j = 0; j < h; j++) {
                 test5.setRGB(i, j, img.getRGB(i+(a+b+c+d),j));
             } 
             //System.out.print("koordinar 5:"+(i+(a+b+c+d)) +"\n");
         }
        
        process2();
     }
     
     public void process2(){
         int w1=test1.getWidth();
         int a = (int) (w1*0.5);
         int x=0;
         test1_1= new BufferedImage(a, h, BufferedImage.TYPE_INT_RGB);
         
          //huruf pertama
         for (int i = 0; i < a; i++) {
             for (int j = 0; j < h; j++) {
                 test1_1.setRGB(i, j, test1.getRGB(i, j));
             }
              //System.out.print("koordinar 1:"+i +"\n");
         }
         int b = (int) (w1*0.5);
         test1_2= new BufferedImage(a, h, BufferedImage.TYPE_INT_RGB);
         
          //huruf pertama
         for (int i = 0; i < a; i++) {
             for (int j = 0; j < h; j++) {
                 test1_2.setRGB(i, j, test1.getRGB(i+a, j));
             }
         }
         
         
     }
     
     //huruf kedua 
     
     
     public BufferedImage getImage(){
         return test1;
     }
     public BufferedImage getImage2(){
         return test2;
     }
     public BufferedImage getImage3(){
         return test3;
     }
     public BufferedImage getImage4(){
         return test4;
     }
     public BufferedImage getImage5(){
         return test5;
     }
     
     public BufferedImage getImage1_1(){
         return test1_1;
     }
     public BufferedImage getImage1_2(){
         return test1_2;
     }
     
    
}
