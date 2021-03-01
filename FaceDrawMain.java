import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

public class FaceDrawMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private static Random rnd;

	public static int minfaces = 3;
	public static int maxfaces = 10;
	public static int faceCount =(int)(Math.random() * (maxfaces - minfaces + 1) + minfaces);

	/**
	The randomFace function uses the Face constructor to create faces at random locations, 
	of a random size and with a random smile type.
	*/
	public static Face randomFace() {
		return new Face(rnd.nextInt(400),rnd.nextInt(400),50+rnd.nextInt(100),rnd.nextInt(3));
	}

	// The printFaces function prints all the necessary information about each face.
	public static void printFaces(ArrayList<Face> FaceList) {
		for (Face myFaces : FaceList) {
			System.out.println(myFaces);
		}
	}

	/**
	The main function allows the user to specify a number of faces, 
	creates an array list of random faces, prints the faces, and creates/opens the 
	frame that draws the faces.
	*/	

	public static void main(String[] args) {
		ArrayList<Face> FaceList = new ArrayList<Face>();
		rnd = new Random();
		for (int i = 0; i < faceCount; i++) {
			FaceList.add(randomFace());
		}

        JFrame myFrame = new JFrame("FaceDraw");
        myFrame.setBounds(100,100,800,600);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.print("FaceDraw is Loading " + faceCount + " faces!");

        FacePanel FaceDrawMain = new FacePanel();
        myFrame.add(FaceDrawMain);

        myFrame.setVisible(true);
		// This makes FacePanel visible!
	}
} 