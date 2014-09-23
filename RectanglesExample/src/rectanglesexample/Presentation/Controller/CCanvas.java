/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglesexample.Presentation.Controller;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import rectanglesexample.Clases.Box;
import rectanglesexample.Clases.BoxList;

/**
 *
 * @author Usuario
 */
public class CCanvas {

    ICanvas view;
    int W, H, X, Y, Wi, Hi, Xi, Yi, lastHeight;
    BoxList boxes;

    public CCanvas(ICanvas _view) {
        view = _view;
        X = 200;
        Y = 50;
        Xi = 200;
        Yi = 50;
        boxes = new BoxList();
    }

    public void paintDefault(int type) {
        if (type == 1) {
            Wi = 122;
            Hi = 244;
            W = 122;
            H = 244;
            view.graphics().setColor(Color.red);
        } else {
            Wi = 183;
            Hi = 244;
            W = 183;
            H = 244;
        }
        System.out.println("width: " + W + " height: " + H);
        view.graphics().drawRect(200, 50, W, H);

    }
    
    private void paintBox(Box box){
        view.graphics().drawRect(box.getX(), box.getY(), box.getWidth(), box.getHeight());
    }
    
    private void fill(int w, int h){
        List<Integer> ys = boxes.getYs();
        for(Integer i: ys){
            List<Box> list = boxes.getBoxByY(i);
            int twidth = boxes.getWidthOfBoxes(list);
            int swidth = Wi - twidth;
            if (w <= swidth){
                int newX = Xi + twidth;
                int newY = i;
                Box box = new Box(w, h, newX, newY);
                boxes.addBox(box);
                paintBox(box);
                break;
            } 
        }
    }

    public void paint() {
        int width = Integer.parseInt(view.width().getText());
        int heigth = Integer.parseInt(view.height().getText());
        if ((heigth > H)) {
            System.out.println("error h > H");
            fill(width, heigth);
            System.out.println("here");
        } else {
            if (width > W) {
                Y = Y + (lastHeight);
                H = H - (lastHeight);
                W = Wi;
                X = Xi;
            }
            if (!(heigth > H)) {
                W = W - width;
                Box box = new Box(width, heigth,X,Y);
                boxes.addBox(box);
                paintBox(box);
                int Xaux = X;
                X = X + width;
                lastHeight = heigth;
                if (X > (Xaux + W)) {
                    H = H - heigth;
                    Y = Y + heigth;
                    W = Wi;
                    X = Xi;
                }
            }
        }


    }
}
