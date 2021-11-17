package br.senac.teste.ado1;
import java.util.Random;
public class adoPIgit {

    static double porcent(double n1){
        double n2;
        n1 = n1 * 100;
        n2 = n1 / 1000000;
        
        return n2;
}
    public static void main(String[] args) {
        int n1, f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0, f7 = 0;
        double total;
        Random rand = new Random();
        for (int i = 1; i < 1000000; i++) {
            n1 = rand.nextInt(7);
            
            if(n1 == 1){f1++;};
            if(n1 == 2){f2++;};
            if(n1 == 3){f3++;};
            if(n1 == 4){f4++;};
            if(n1 == 5){f5++;};
            if(n1 == 6){f6++;};
            if(n1 == 7){f7++;};
        }
        
        System.out.println(porcent(f1));
        System.out.println(porcent(f2));
        System.out.println(porcent(f3));
        System.out.println(porcent(f4));
        System.out.println(porcent(f5));
        System.out.println(porcent(f6));
        System.out.println(porcent(f7));
    }
    
}
