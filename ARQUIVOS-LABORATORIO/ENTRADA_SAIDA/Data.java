import java.io.*;

class Data{
  public static void main(String[] args) throws IOException{
    FileOutputStream fs = new FileOutputStream("vendas.dat");
    DataOutputStream ds = new DataOutputStream(fs);
    ds.writeDouble(3.1415);
    ds.writeUTF("Valor de PI");
    

    ds.close();
    
    FileInputStream fi = new FileInputStream("vendas.dat");
    DataInputStream di = new DataInputStream(fi);

    System.out.println(di.readDouble());
    System.out.println(di.readUTF());
  }
}