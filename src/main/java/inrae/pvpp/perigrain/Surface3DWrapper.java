/**
 * 
 */
package inrae.pvpp.perigrain;

import ij.IJ;
import ij.plugin.PlugIn;
import imago.app.ImagoApp;
import imago.gui.ImagoEmptyFrame;
import imago.gui.ImagoFrame;
import imago.gui.ImagoGui;
import imago.plugin.plugin.crop.CreateSurface3DPlugin;

/**
 * @author dlegland
 *
 */
public class Surface3DWrapper implements PlugIn
{

    @Override
    public void run(String arg)
    {
        IJ.log("Run the Crop3D plugin");
        
        ImagoFrame parentFrame = new ImagoEmptyFrame(new ImagoGui(new ImagoApp()));
        CreateSurface3DPlugin plugin = new CreateSurface3DPlugin();

        plugin.run(parentFrame, null);
    }

}
