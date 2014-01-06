package chapter09;

import polymorphism.music.Note;
import static net.mindview.util.Print.*;

interface Instrument {
	int VALUE = 5;


	void ajust();
}

interface Playable{
	void play(Note n);
}

class Wind implements Instrument, Playable{

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

class Percussion implements Instrument, Playable{

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

class Stringed implements Instrument, Playable {

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

public class Exercise10 {
	static void tune(Playable i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e) {
		for (Playable i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Playable[] orchestra = { new Wind(), new Percussion(),
				new Stringed(), new Brass(), new WoodWind() };
		tuneAll(orchestra);
	}
}
