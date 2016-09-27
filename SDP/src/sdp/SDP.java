/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdp;

import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author sony
 */
public class SDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int follower_num = Integer.parseInt(showInputDialog(null, "How many followers"));
        for (int i = 0; i <= follower_num; i++) {
            String follower_names = showInputDialog(null, "Follower number " + i);
            List<String> follow = new ArrayList<>();
            follow.add(follower_names);
            System.out.println(follow);
        }
        int following_num = Integer.parseInt(showInputDialog(null, "How many following"));
        for (int i = 0; i <= following_num; i++) {
            String follower_names = showInputDialog(null, "Following number " + i);
            List<String> following = new ArrayList<>();
            following.add(follower_names);
            System.out.println(following);
            System.out.println("test");        

        }
    }
    
}
