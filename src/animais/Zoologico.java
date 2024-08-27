package animais;

public class Zoologico {

    private Animal[] cages;

    public Zoologico() {
        cages = new Animal[10];
    }

    public void addAnimal(int index, Animal animal) {
        if (index >= 0 && index < cages.length) {
            cages[index] = animal;
        } else {
            System.out.println("O índice informado é inválido!");
        }
    }

    public void sweepCage() {
        for (int i = 0; i < cages.length; i++) {
            Animal animal = cages[i];
            if (animal != null) {
                System.out.println("Jaula " + (i + 1) + ", "+ animal.getName() +":");
                animal.emitSound();

                if (animal instanceof Cachorro || animal instanceof Cavalo) {
                    if (animal instanceof Cachorro) {
                        ((Cachorro) animal).run();
                    } else if (animal instanceof Cavalo) {
                        ((Cavalo) animal).run();
                    }
                }
            } else {
                System.out.println("A Jaula " + (i + 1) + " está vazia!");
            }
            System.out.println();
        }
    }
}

