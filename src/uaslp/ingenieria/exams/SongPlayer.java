package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;
import java.util.LinkedList;

public class SongPlayer{

    public void play(Song song, Instrumento instrumento) {
        LinkedList<Instrumentos> instrumentos =new LinkedList<>();

        Iterator<Nota> notas = song.getSongIterator();
        /*Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        Violin violin = new Violin();
        Flauta flauta = new Flauta();*/




        while (notas.hasNext()) {
            Nota nota = notas.next();

            instrumentos.add(new Piano(nota));
            instrumentos.add(new Guitarra(nota));
            instrumentos.add(new Violin(nota));
            instrumentos.add(new Flauta(nota));

            for(Instrumentos ins : instrumentos){
                ins.tocar(nota);
            }

            /*switch (instrumento) {
                case PIANO -> piano.tocar(nota);
                case FLAUTA -> flauta.tocar(nota);
                case VIOLIN -> violin.tocar(nota);
                case GUITARRA -> guitarra.tocar(nota);
                default -> System.out.println("Instrumento no soportado");
            }*/
        }
    }
}
