// FacePanel Class
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Random;

public class FacePanel extends JPanel {
   private static final long serialVersionUID = 1L;
   private ArrayList<Face> FaceList = new ArrayList<Face>();
   private Face myFaces;

   public int locationGen() {
	   Random rnd = new Random();
	   int x = rnd.nextInt(200)+50;
	   return x;
   }

   public int sizeGen() {
	   Random rnd2 = new Random();
	   int y = rnd2.nextInt(200)+50;
	   return y;
   }

   public FacePanel() {
	   	for (int i = 1; i < FaceDrawMain.faceCount; i++) {
		   myFaces = new Face(locationGen(), locationGen(), sizeGen(), sizeGen());
		   FaceList.add(myFaces);
	   	}
   }

   public void paintComponent(Graphics g) {
	   super.paintComponent(g);

	   for(Face face: FaceList) {
		   face.paintComponent(g);
	   }
	myFaces.paintComponent(g);
   }
}