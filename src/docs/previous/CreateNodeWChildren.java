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
public class CreateNodeWChildren extends SimpleApplication {      
    public static void main(String[] args) {
        CreateNodeWChildren app = new CreateNodeWChildren();
        app.start();
    }
    
    @Override
    public void simpleInitApp() {                           
        Node theNode = new Node();
        
        /*--Sphere Child--*/
        Sphere sphere = new Sphere(20, 20, 1);
        Geometry geomSphere = new Geometry("Sphere", sphere);       
        Material matSphere = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matSphere.setColor("Color", ColorRGBA.Pink);
        geomSphere.setMaterial(matSphere);
        geomSphere.setLocalTranslation(2, 0, 0);
        
        /*--Box Child--*/
        Box box = new Box(1, 1, 1);
        Geometry geomBox = new Geometry("Box", box);                
        Material matBox = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");                
        matBox.setColor("Color", ColorRGBA.Cyan);
        geomBox.setMaterial(matBox);
                
        //Place geometry spatials inside the node
        theNode.attachChild(geomSphere);
        theNode.attachChild(geomBox);
        
        //Scale, rotate node
        theNode.scale(1);
        theNode.rotate(0.4f, 0.4f, 0.4f);
        
        //Make the Node appear in top-level scene                
        rootNode.attachChild(theNode);
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
