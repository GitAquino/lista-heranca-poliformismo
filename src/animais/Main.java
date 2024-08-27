package animais;

import animais.Animal;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Timão", 5, "cachorro");
        Animal cavalo = new Cavalo("Mosqueteiro", 8, "cavalo");
        Animal preguica = new Preguica("Fiel", 3, "preguiça");
        Animal cachorro2 = new Cachorro("Gavião", 4, "cachorro");
        Animal cavalo2 = new Cavalo("Corinthiano", 7, "cavalo");
        Animal preguica2 = new Preguica("Alvinegro", 2, "preguiça");
        Animal cachorro3 = new Cachorro("Mosqueteiro Jr.", 6, "cachorro");
        Animal cavalo3 = new Cavalo("Neo Química Arena", 5, "cavalo");
        Animal preguica3 = new Preguica("Torcida Fiel", 4, "preguiça");
        Animal cachorro4 = new Cachorro("Pacaembu", 3, "cachorro");
        Animal cachorro5 = new Cachorro("Corinthians", 2, "cachorro");
        Animal cavalo4 = new Cavalo("Coringão", 9, "cavalo");


        Veterinario veterinario = new Veterinario();
        System.out.println("Consultando animais:");
        veterinario.examine(cachorro);
        veterinario.examine(preguica);
        veterinario.examine(cavalo);

        Zoologico zoologico = new Zoologico();
        System.out.println();
        System.out.println("Verificação das jaulas:");
        zoologico.addAnimal(0, cachorro);
        zoologico.addAnimal(1, cavalo);
        zoologico.addAnimal(2, preguica);
        zoologico.addAnimal(3, cachorro2);
        zoologico.addAnimal(4, cavalo2);
        zoologico.addAnimal(5, preguica2);
        zoologico.addAnimal(6, cachorro3);
        zoologico.addAnimal(7, cavalo3);
        zoologico.addAnimal(8, preguica3);
        zoologico.addAnimal(9, cachorro4);
        zoologico.addAnimal(10, cachorro5);
        zoologico.addAnimal(11, cavalo4);

        zoologico.sweepCage();
    }
}
