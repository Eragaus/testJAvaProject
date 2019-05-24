/**
 * 
 */
package testProjectModel.map;

/**
 * @author Bryan
 *
 */
public class BoulderModel {
	
	private Map map;
	private final int MAP_HEIGHT=3;
	private final int MAP_WIDTH=3;
	
	public BoulderModel()
	{
		this.map=new Map(this.MAP_HEIGHT, this.MAP_WIDTH);
		
	}
	
	public Map getMap() {
		return this.map;
	}

	public void setMap(Map map) {
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

