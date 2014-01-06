package interfaces.music5;

import polymorphism.music.Note;
import static net.mindview.util.Print.*;

interface Instrument {
	int VALUE = 5;

	void play(Note n);

	void ajust();
}

class Wind implements Instrument {

	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	@Override
	public void ajust() {
		print(this + ".ajust()");
	}

	@Override
	public String toString() {
		return "Wind";
	}
}

class Percussion implements Instrument {

	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	@Override
	public void ajust() {
		print(this + ".ajust()");
	}

	@Override
	public String toString() {
		return "Percussion";
	}
}

class Stringed implements Instrument {

	@Override
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	@Override
	public void ajust() {
		print(this + ".ajust()");
	}

	@Override
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class WoodWind extends Wind {
	public String toString() {
		return "WoodWind";
	}
}

public class Music5 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new WoodWind() };
		tuneAll(orchestra);
	}
}
