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
public class Main extends SimpleApplication {       
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }
    
    
    //TODO: Find a way to save your code on Github
    @Override
    public void simpleInitApp() {    
        Node rot = new Node("Tester");        
        
        Sphere player = new Sphere(10, 10, 1);
        Geometry geom = new Geometry("Sphere", player);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Cyan);
        geom.setMaterial(mat);
        
        Spatial model = (Spatial)assetManager.loadModel("Scenes/newScene.j3o");    
        model.scale((float)0.1);      
      
        
        
        rot.attachChild(model);                        
        rot.attachChild(geom);        
        rot.rotate(0.4f, 0.4f, 0.4f);
        Spatial sun = rot.getChild("Sun");
        sun.scale(0.5f);
        
        sun.setMaterial(mat);
        
        
        rootNode.attachChild(rot);
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
