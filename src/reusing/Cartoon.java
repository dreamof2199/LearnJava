package reusing;
import static chapter03.Print.*;

class Art {
	  Art() { print("Art constructor"); }
	}

	class Drawing extends Art {
	  Drawing() { print("Drawing constructor"); }
	}

	public class Cartoon extends Drawing {
//	  public Cartoon() { print("Cartoon constructor"); }
	  @SuppressWarnings("unused")
	public static void main(String[] args) {
	    Cartoon x = new Cartoon();
	  }
	}
