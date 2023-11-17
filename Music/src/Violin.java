
public class Violin extends MusicalInstrument{
	Violin(){
		super.type = "string instrument";
	}
	@Override
	void play() {
		System.out.println("play a " + type);
	}
}
