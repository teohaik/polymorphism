/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teohaik.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chaikal
 */
public class Main {
    
    
    public static void main(String[] args) {
        System.out.println("HELLO");
        
        ShapePainter s1 = new PaintCircle();
        ShapePainter s2 = new PaintSquare();
        ShapePainter s3 = new PaintTriangle();
        List<ShapePainter> shapeList = new ArrayList();
        
        shapeList.add(s1);shapeList.add(s2);shapeList.add(s3); 
        
        for(ShapePainter sp : shapeList){
            sp.paintShape();
        }
        
    }
    
}
