/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectanglesexample.Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leo10
 */
public class BoxList {
    
    private List<Box> boxes;
    
    public BoxList(){
        boxes = new ArrayList<Box>();
    }
    
    public void addBox(Box box){
        boxes.add(box);
    }
    
    public List<Box> getBoxByX(int x) {
        List<Box> result = new ArrayList<Box>();
        for(Box box: boxes){
            if (box.getX() == x) {
                result.add(box);
            }
        }
        return result;
    }
    
    public List<Box> getBoxByY(int y) {
        List<Box> result = new ArrayList<Box>();
        for(Box box: boxes){
            if (box.getY() == y) {
                result.add(box);
            }
        }
        return result;
    }
    
    public int getWidthOfBoxes (List<Box> theBoxes) {
        int result = 0;
        for (Box box: theBoxes){
            result = box.getWidth() + result;
        }
        return result;
    }
    
    public int getHeightOfBoxes (List<Box> theBoxes) {
        int result = 0;
        for (Box box: theBoxes){
            result = box.getHeight() + result;
        }
        return result;
    }
    
    public List<Integer> getXs() {
        List<Integer> result = new ArrayList<Integer>();
        for (Box box: boxes){
            int x = box.getX();
            int cont = 0;
            for(Integer i: result){
                if (i == x){
                    cont++;
                }
            }
            if (cont == 0) {
                result.add(x);
            }
        }
        return result;
    }
    
    public List<Integer> getYs() {
        List<Integer> result = new ArrayList<Integer>();
        for (Box box: boxes){
            int y = box.getY();
            int cont = 0;
            for(Integer i: result){
                if (i == y){
                    cont++;
                }
            }
            if (cont == 0) {
                result.add(y);
            }
        }
        return result;
    }
    
}
