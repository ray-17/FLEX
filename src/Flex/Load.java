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
      run();
    }
    
    public static void run(){
          Loader loader = new Loader();
        Login login = new Login();
        loader.setVisible(true);
        try {
            for(int i = 0; i<=100; i++){
                Thread.sleep(100);
                loader.lblLoad.setText(Integer.toString(i)+"%");
                if(i == 100){
                    loader.setVisible(false);
                    login.setVisible(true);
                    System.out.println("Done!");
                }
            }
        } catch (Exception e) {
        }
        
    }
}
