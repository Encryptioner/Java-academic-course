package Socket_Programming;

import java.net.*;
import java.io.*;

public class Receiver{
    
    public static void main(String args[]){
    try{  
        System.out.println("Waiting for connection.......\n\n");
        ServerSocket con = new ServerSocket(2589);
        Socket r=con.accept();
        
        ObjectOutputStream out=new ObjectOutputStream(r.getOutputStream());
        ObjectInputStream in=new ObjectInputStream(r.getInputStream());
        
        String packet="",msg,nop;
        int i,j=1,seq,rseq;
        nop=(String)in.readObject();
        System.out.println(nop+" packet will be received\n\n");
        
        while(j<=Integer.valueOf(nop)){
            
        System.out.println("Receiving packet "+j+" : ");
        i=0;seq=0;
        while(1==1)
        {
            packet=(String)in.readObject();
            
            if(packet.equals("end"))
            {
                out.writeObject("ended");
                System.out.println("\npacket fully received.\n\n");
                break;
            }
            rseq=Integer.parseInt(packet.substring(0,1));
            if(rseq==seq)
            {
                System.out.println("\nreceived > "+packet);
                if(seq==0)
                {
                    seq=1;
                }
                else
                {
                    seq=0;
                }
                msg=String.valueOf(seq);
                out.writeObject(msg);
            }
        }
        j++;
        }
        r.close();
        con.close();
        System.out.println("All packet Received. Connection closed");
    }catch(Exception e){System.out.println(e);}  
    }   
}