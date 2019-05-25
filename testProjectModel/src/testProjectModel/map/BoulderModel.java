/**
 * 
 */
package testProjectModel.map;

/**
 * @author Bryan
 *
 */
public class BoulderModel {
	
	private IMap map;
	private final int MAP_HEIGHT=9;
	private final int MAP_WIDTH=5;
	
	
	public BoulderModel()
	{
		this.map=new Map(this.MAP_HEIGHT, this.MAP_WIDTH);
		
	}
	
	public IMap getMap() {
		return this.map;
	}

	public void setMap(IMap map) {
		this.map = map;
	}

public void play()
{
	
}

public void show()
{
	for (int y = 0; y < this.MAP_HEIGHT; y++) {
        for (int x = 0; x < this.MAP_WIDTH; x++) {

                System.out.print(this.getMap().getOnTheMapXY(x, y).getSprite());
            }
        System.out.println("");
        }
        
        
    }
}

