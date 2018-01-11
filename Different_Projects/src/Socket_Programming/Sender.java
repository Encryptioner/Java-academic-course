package Socket_Programming;

import java.net.*;
import java.io.*;
import java.util.*; 

public class Sender{
    
    String packet,ack, msg;
    int n,i,j=1,nop,seq,l;
        
    public static void main(String args[]) throws IOException, ClassNotFoundException{
    try{ 
        Socket s=new Socket("localhost",2589);
        
        ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream in=new ObjectInputStream(s.getInputStream());
        Scanner sc=new Scanner(System.in);  
        
        String packet,ack="", msg;
        int n,i,j=1,nop,seq,l;
        
        System.out.println("Connection Established");
        System.out.println("How many packet u wanna send : ");
        nop=sc.nextInt();
        msg=String.valueOf(nop);
        out.writeObject(msg);
        
        while(j<=nop){
            
        i=0;seq=0;
        System.out.println("Enter the data of packet "+j+" : ");
        packet=sc.next();
        l=packet.length();
        again:
        
        while(i<l)
        {
            msg=String.valueOf(seq);
            msg=msg.concat(packet.substring(i,i+1));
            System.out.println("Sending "+msg);
            out.writeObject(msg);
            
            if(seq==0)
            {
                seq=1;
            }
            else
            {
                seq=0;
            }
            try{
            s.setSoTimeout(10);
            ack=(String)in.readObject();
            }catch(Exception e){
            System.out.println("Time out.");
            }
            
           
            if(ack!=null && ack.equals(String.valueOf(seq)))
            {
                i++;
                System.out.println("receiver > "+msg+" recieved, Acknowledgement sent "+ack+".\n");
                if(i==l)
                {
                    msg="end";
                    out.writeObject(msg);
                    System.out.println("\n\npacket "+j+" sent.\n\n");
                    break;
                }
            }
            else
            {    
                System.out.println("ack is not ok. Resending data.\n\n");
                if(seq==0)
                {
                    seq=1;
                }
                else
                {
                    seq=0;
                }
            }
        }
        j++;
        }
        s.close();
        System.out.println("\n\nAll packet sent. Connection closed");
    }catch(Exception e){
        System.out.println(e);
        
        
        } 
    }
}
