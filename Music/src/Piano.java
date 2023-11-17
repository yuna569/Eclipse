
public class Piano extends MusicalInstrument {
	Piano(){
		super.type = "keyboard instrument";
	}
	@Override
	void play() {
		System.out.println("play a "+ type);
	}	
}
