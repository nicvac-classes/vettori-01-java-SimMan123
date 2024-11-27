
import java.util.Scanner;


class Esercizio {
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        String v[] = new   v[5]; 
        v[0]= "g";
        v[1]= "m";
        v[2]= "h";
        v[3]= "f";
        v[4]= "d";
      String w[] = new  w[5];
      int i=0;
      for (i=0;i<=4;i++) {
        System.out.print("inserire nome cantante");
        w[i]= in.nextLine();
      }
      int x[] = new x[10];
      for ( i=0; i<=9; i++) {
        x[i]=i+1;
      }
      int y[]= new y[10];
      for (i=0;i<10;i++) {
        y[i]= (i+1)*2;
      }
      System.out.print("visuallizzare solo 3 elementi del vettore v" + v[0] + v[2] + v[4]);
      System.out.print("visuallizzre tutti gli elementi del vettore w,v,y,x");
      System.out.println("v:");
      for(i=0;i<=4;i++) {
        sYSTEM.OUT.println(v[i]) ;
        System.out.prinln("w:");
        for(i=0;i<=4;i++) {
            sYSTEM.OUT.println(w[i]) ;
      }
      System.out.println("y:");
      for(i=0;i<=9;i++) {
        System.out.println(y[i]);
      }
      System.out.println("x:");
      while (i<=9) {
        System.out.println(x[i]);
        i=i+2;
      }
      i=1;
      while (i<=9) {
        System.out.println(x[i]);
        i=i+2;
      }
      while (i<=9) {
        if (x[i]%2==0) {
        System.out.println(x[i]);
        }
        i=i+1;
      }
    }
}

