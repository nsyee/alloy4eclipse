package fr.univartois.cril.alloyplugin.core;

import org.eclipse.jface.resource.CompositeImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;

/**
 * 
 * @author romuald druelle
 *
 */
public class OverlayImageIcon extends CompositeImageDescriptor {

	private Image baseImage;

	private Point sizeOfImage;

	private Image decoratorImage;

	public OverlayImageIcon(Image baseImage, Image decoratorImage) {
		this.baseImage = baseImage;
		this.decoratorImage = decoratorImage;
		sizeOfImage = new Point(baseImage.getBounds().width, baseImage
				.getBounds().height);
	}

	protected void drawCompositeImage(int arg0, int arg1) {
		drawImage(getBaseImage().getImageData(), 0, 0);
		ImageData imageData = getDecoratorImage().getImageData();
		drawImage(imageData, sizeOfImage.x - imageData.width, sizeOfImage.y
				- imageData.height);

	}

	protected Point getSize() {
        return sizeOfImage;
	}
    
	protected Image getBaseImage(){
		return this.baseImage;
	}
	
	protected Image getDecoratorImage(){
		return this.decoratorImage;
	}
	
	public Image getImage() {
		return createImage();
	}

}
