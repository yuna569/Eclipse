
public class Drum extends MusicalInstrument{
	Drum(){
		super.type = "percussion instrument";
	}
	@Override
	void play() {
		System.out.println("play a " + type);
	}
}
