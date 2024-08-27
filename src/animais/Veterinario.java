package animais;

public class Veterinario {
    public void examine (Animal animal) {
        System.out.print("O " +animal.getType() +", nomeado(a) "+ animal.getName() + ", enquanto se consultava: ");
        animal.emitSound();
    }
}