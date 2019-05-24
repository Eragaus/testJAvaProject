package testProjectModel.MotionlessElement;

import testProjectModel.Element.Permeability;

public class Wall extends MotionlessElement{
	
	public Wall()
	{
		super(Permeability.Blocking, 'H');
	}

}
