/**
 * 
 */
package testProjectModel.Element;

/**
 * @author Bryan
 *
 */
public abstract class Element implements IElement {
	
	private Permeability permeability;
	private char sprite;
	
	
	public Element(Permeability permeability, char sprite)
	{
		this.permeability=permeability;
		this.sprite=sprite;
	}
	
	
	public Permeability getPermeability() {
		return permeability;
	}
	
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
	public char getSprite() {
		return sprite;
	}
	
	public void setSprite(char sprite) {
		this.sprite = sprite;
	}
	
	

}
