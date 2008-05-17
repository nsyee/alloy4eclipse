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

	/**
	 * Base image of the object
     */ 
	private Image baseImage;

	/**
     * Size of the base image 
     */ 
	private Point sizeOfImage;

	/**
	 * Decorator image
	 */
	private Image decoratorImage;

	/**
	 * Constructor for overlayImageIcon.
     */
	public OverlayImageIcon(Image baseImage, Image decoratorImage) {
		this.baseImage = baseImage;
		this.decoratorImage = decoratorImage;
		sizeOfImage = new Point(baseImage.getBounds().width, baseImage
				.getBounds().height);
	}

	protected void drawCompositeImage(int arg0, int arg1) {
		// draw the base image
		drawImage(getBaseImage().getImageData(), 0, 0);
		ImageData imageData = getDecoratorImage().getImageData();
		// draw the decorator image on bottom right corner
		drawImage(imageData, sizeOfImage.x - imageData.width, sizeOfImage.y
				- imageData.height);

	}

    /**
     * Get the size of the base image
     * @return Point
     */
	protected Point getSize() {
        return sizeOfImage;
	}
    
	/**
	 * Get the base image
	 * 
	 * @return Image
	 */
	protected Image getBaseImage(){
		return this.baseImage;
	}

	/**
	 * Get the decorator image
	 * 
	 * @return Image
	 */
	protected Image getDecoratorImage(){
		return this.decoratorImage;
	}
	
	/**
	  * Get the image formed by overlaying the decorator image on the base image
	  * 
	  * @return composite image
     */ 
	public Image getImage() {
		return createImage();
	}

}
