/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class ÖDEV {
    

    

  
    public static void main(String[] args) throws IOException {
    
        LINKEDLIST liste=new LINKEDLIST();
        String line;
        
        BufferedReader br = new BufferedReader(new FileReader("Sporcu.txt"));
        line = br.readLine();
        
        while((line=br.readLine())!=null){
            line.split(",");
            
               
        }
        
        
    } 
        
    }
 
