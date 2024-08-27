package animais;

public class Preguica extends Animal {

    public Preguica(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void emitSound() {
        System.out.println("Emitiu um som");
    }

    public void walk() {
        System.out.println("A preguiça está andando");
    }
}

