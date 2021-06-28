/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flex;

/**
 *
 * @author SHARON
 */
public class Splashclass {
    
    public static void main(String[] args) {
        Splash splash = new Splash();
        Load load = new Load();
        splash.setVisible(true);
        try {
            Thread.sleep(4000);
            splash.dispose();
        } catch (Exception e) {
        }
        load.run();
    }
    
}
