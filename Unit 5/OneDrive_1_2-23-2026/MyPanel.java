import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    public MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setSize(500, 500);
    }

    Color light_grey = new Color(211, 211, 211);
    Color oakwood = new Color(105, 72, 8);
    Color brick = new Color(89, 16, 3);

    public void paint(Graphics g) {
        // to-do: draw the house!

        // Adds shapes to an ArrayList, converting them all to Polygons
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        // building
        shapes.add(new Rectangle(125, 125, 250, 250));
        shapes.get(0).setFillColor(oakwood);
        shapes.get(0).setStrokeColor(Color.black);
        shapes.get(0).setStrokeWidth(4);

        // door
        shapes.add(new Rectangle(175, 250, 50, 125));
        shapes.get(1).setFillColor(Color.orange);
        shapes.get(1).setStrokeColor(Color.black);
        shapes.get(1).setStrokeWidth(2);

        // chimney
        shapes.add(new Rectangle(150, 50, 50, 75));
        shapes.get(2).setFillColor(brick);
        shapes.get(2).setStrokeColor(Color.black);
        shapes.get(2).setStrokeWidth(4);

        // roof
        shapes.add(new Triangle(new int[] { 125, 250, 375 }, new int[] { 125, 75, 125 }));
        shapes.get(3).setFillColor(Color.orange);
        shapes.get(3).setStrokeColor(Color.black);
        shapes.get(3).setStrokeWidth(6);

        // window
        shapes.add(new Rectangle(275, 175, 50, 50));
        shapes.get(4).setFillColor(Color.cyan);
        shapes.get(4).setStrokeColor(Color.black);
        shapes.get(4).setStrokeWidth(4);

        // sun
        shapes.add(new Oval(50, 25, 50, 50));
        shapes.get(5).setStrokeColor(Color.black);
        shapes.get(5).setFillColor(Color.yellow);
        shapes.get(5).setStrokeWidth(2);

        // moon
        shapes.add(new Circle(50, 125, 50));
        shapes.get(6).setStrokeColor(Color.black);
        shapes.get(6).setFillColor(light_grey);

        // rain
        shapes.add(new Oval(400, 25, 20, 100));
        shapes.get(7).setStrokeColor(Color.black);
        shapes.get(7).setFillColor(Color.cyan);

        // rain 2
        shapes.add(new Oval(450, 25, 20, 100));
        shapes.get(8).setStrokeColor(Color.black);
        shapes.get(8).setFillColor(Color.cyan);

        // rain 3
        shapes.add(new Oval(425, 150, 20, 100));
        shapes.get(9).setStrokeColor(Color.black);
        shapes.get(9).setFillColor(Color.cyan);

        // Draws all the shapes in the ArrayList using that shape's draw method
        for (Shape p : shapes) {
            p.draw(g);
        }

    }

}
