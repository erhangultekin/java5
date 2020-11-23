/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev;

/**
 *
 * @author DELL
 */
public class LINKEDLIST {
    Node bas;
    Node son;

    void append(String[] txtarray) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    class Node{
        String Veri;
        Node  önceki;
        Node  sonraki;
        int size;
        Node(String v){Veri=v;}
    }
      public void kaydır(String new_veri) 
    { 
        Node new_Node = new Node(new_veri); 
        new_Node.önceki = bas; 
        new_Node.sonraki = null;
        if (bas != null) 
            bas.önceki = new_Node; 
            bas = new_Node; 
    }
      public void sıraylaekle(Node önceki_Node,String yeni_Veri){
          if (önceki_Node==null){
              System.out.println("Boş");
              return;
          }
          Node new_node=new Node(yeni_Veri);
          new_node.sonraki=önceki_Node.sonraki;
          önceki_Node.sonraki=new_node;
          if (new_node.sonraki!=null){
              new_node.sonraki.önceki=new_node;
          }
      }
    
      void append(String yeni_Veri){
          Node new_node=new Node(yeni_Veri);
          Node son=bas;
          new_node.sonraki=null;
          if (bas==null){
              new_node.önceki=null;
              bas=new_node;
              return;
          }
          while (son.sonraki!=null){
              son=son.sonraki;
              son.sonraki=new_node;
              new_node.önceki=son;
              
          }

      }
        public void listeyazdırıcı(Node node){
            Node son=null;
            while (node!=null){
                System.out.println(node.Veri+ "");
                son=node;
                node=node.sonraki;
            }
            while(son!=null){
                System.out.println(son.Veri+ "");
                son=son.önceki;
                
            }
        }
     
      
    
    
    
}
  
    

