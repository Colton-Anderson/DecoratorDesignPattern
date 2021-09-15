import java.util.ArrayList;

public abstract class CharacterDecorator extends Character{
	
	protected Character character;
	ArrayList<String> sec2 = sections;

	public CharacterDecorator(Character character) {
		super();
		this.character = character;
		for (String originalSection : character.sections) {
			sections.add(originalSection);
		}
		customize();
	}
	
	public abstract void customize(); 

}
