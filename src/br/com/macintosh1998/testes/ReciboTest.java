package br.com.macintosh1998.testes;

import br.com.macintosh1998.classes.Recibo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ReciboTest {


    public static void main(String[] args) {
        Recibo r1 = new Recibo(1, 22.2d);
        Recibo r2 = new Recibo(2, 23.2d);
        Recibo r3 = new Recibo(3, 24.2d);

        Set<Recibo> recibos = new LinkedHashSet<>();
        recibos.add(r1);
        recibos.add(r2);
        recibos.add(r3);

        Iterator<Recibo> iterador = recibos.iterator();
        while(iterador.hasNext()){
            Recibo proximo = iterador.next();
            System.out.println(proximo);
        }
    }
}
