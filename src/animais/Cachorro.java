package animais;

public class Cachorro extends Animal {

    public Cachorro(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void emitSound() {
        System.out.println("Emitiu um som");
    }

    public void run() {
        System.out.println("O cachorro está correndo");
    }
}

