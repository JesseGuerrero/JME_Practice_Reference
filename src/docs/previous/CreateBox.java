package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.light.Light;
import com.jme3.light.SpotLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class CreateBox extends SimpleApplication {      
    public static void main(String[] args) {
        CreateBox app = new CreateBox();
        app.start();
    }
    
    @Override
    public void simpleInitApp() {                    
        Box box = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", box);
        
        //No idea where this asset came from??
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        
        //But we can color it
        mat.setColor("Color", ColorRGBA.Cyan);
        geom.setMaterial(mat);
        
        //If you wanted to scale, rotate
        geom.rotate(0, 0, 0);
        geom.scale(1.0f, 1.0f, 1.0f);
        
        //Make the box appear in top-level scene                
        rootNode.attachChild(geom);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
        
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
