/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Vues
 */
public class TextFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file;
        JFileChooser chooser = new JFileChooser();
        String[] words = {"Vue","Carolina","Vang"};
        ArrayList<String> myList = new ArrayList<>();
        String[] splitStr={};
        String inputString = "";
        
        if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            
            file = chooser.getSelectedFile();
            Scanner sc = new Scanner(file);
            
            while(sc.hasNext()){
                inputString = sc.nextLine();
                splitStr = inputString.split(" "); 
                
                for(String s : splitStr){
                    myList.add(s);
                }   
            }
            
            for(String s: myList){
                for(String w:words){
                    if(s.contains(w)){
                    System.out.println(s);
                    }                
                }
            }
            
            sc.close();
        }else{
            System.out.println("Error");
        }
        
         
    }
}
