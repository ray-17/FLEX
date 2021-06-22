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
public class Load {
    public static void main(String[] args) {
        Loader loader = new Loader();
        Flex fx = new Flex();
        loader.setVisible(true);
        try {
            for(int i = 0; i<=100; i++){
                Thread.sleep(40);
                loader.lblLoad.setText(Integer.toString(i)+"%");
                if(i == 100){
                    loader.setVisible(false);
                    fx.setVisible(true);
                    System.out.println("Done!");
                }
            }
        } catch (Exception e) {
        }
        
    }
}
