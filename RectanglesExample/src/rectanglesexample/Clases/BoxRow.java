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
public class BoxRow {
    
    private int width;
    private int height;
    private int actualWidth;
    private int actualHeight;
    private List<Box> boxes;

    public BoxRow(int width, int height) {
        this.width = width;
        this.height = height;
        this.actualWidth = width;
        this.actualHeight = height;
        boxes = new ArrayList<Box>();
    }
    
    public boolean canAddBox (Box box) {
        boolean response = false;
        if ((actualWidth - box.getWidth()) >= 0) {
            if ((actualHeight - box.getHeight()) >= 0) {
                response = true;
            }
        }
        return response;
    }
    
    public void addBox(Box box) {
        if (canAddBox(box)) {
            boxes.add(box);
            actualWidth = actualWidth - box.getWidth();
            
        }
    }
    
    
    
}
