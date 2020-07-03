package tiket.bioskop;
public class modelreg
{
    
    public register07065[] reg = new register07065[100];
    public int index=0;
    public String temp;
    
       
       public void insert_reg(int id,int kodereg,String nama,String alamat,String telp,String gender,String username,String pass)
       {
           reg[index] = new register07065(id,kodereg,nama,alamat,telp,gender,username,pass);
           index++;
       }

       public void cari(String username,String pass)
       {
            
            for (int i=0; i<index; i++)
            {
                if (username.equals(reg[i].username) && pass.equals(reg[i].pass))
                {
                    temp = reg[i].nama;
                }
            }
       }            
        
       public register07065 cari(String user)
       {
            register07065 temp1 = null;
            for (int i=0; i<index; i++)
            {
                if (user.equals(reg[i].nama))
                {
                    int a=reg[i].id;
                    int b=reg[i].kodereg;
                    String c=reg[i].nama;
                    String d=reg[i].alamat;
                    String e=reg[i].telp;
                    String f=reg[i].gender;
                    String g=reg[i].username;
                    String h=reg[i].pass;
                    temp1=new register07065(a,b,c,d,e,f,g,h);
                }
            }
            return  temp1;
       }  
}
