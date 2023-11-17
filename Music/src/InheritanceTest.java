
public class InheritanceTest {

	public static void main(String[] args) {
		MusicalInstrument [] playing = new MusicalInstrument[3];
		playing[0] = new Piano();
		playing[1] = new Violin();
		playing[2] = new Drum();
		
		for (int i=0; i<3; i++) {
			playing[i].play();
		}
		System.out.println("202312377 정윤아");
	}
	
}
