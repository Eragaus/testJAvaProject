/**
 * 
 */
package testProjectModel.map;


import testProjectModel.Element.Element;
import testProjectModel.MotionlessElement.MotionlessElementFactory;

/**
 * @author Bryan
 *
 */
public class Map {
	
	private int height;
	private int width;
	private Element[][] onTheMap;

	public Map(int HEIGHT, int WIDTH) {
		// TODO Auto-generated constructor stub
		this.height=HEIGHT;
		this.width=WIDTH;
		this.onTheMap= new Element[this.height][this.width];
		this.fillonTheMap();
	}

	private void fillonTheMap() {
		// TODO Auto-generated method stub
		for(int y=0; y < getHeight(); y++){
			
			
			for(int x=0; x < getWidth(); x++){
				
					if ((x==0) || (x==getWidth()-1)) {							// A test to know if one is on the edge to put a ditch or not //
					this.setOnTheMapXY(MotionlessElementFactory.createWall(), x, y);			// We put a ditch on this road //
	// An obstacle is placed on the road //
				}
					else{
					
					this.setOnTheMapXY(MotionlessElementFactory.createDirt(), x, y);	// We just put macadam on the road //
				}
			}
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Element getOnTheMapXY(int x, int y) {
		return this.onTheMap[y][x];
	}

	public void setOnTheMapXY(Element element, int x, int y) {
		this.onTheMap[y][x] = element;
	}

}
