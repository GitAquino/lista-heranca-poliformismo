package animais;

public class Cavalo extends Animal {

    public Cavalo(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void emitSound() {
        System.out.println("Emitiu um som");
    }

    public void run() {
        System.out.println("O cavalo está cavalgando");
    }
}

