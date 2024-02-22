package ie.tudublin;

public class Cat extends Animal {
    private int numLives;

    public void speak()
    {
        System.out.println("Meaow: " + getName());
    }

    public Cat(String name)
    {
        setName(name);
        numLives = 9;
    }
    
    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int newNumLives) {
        numLives = newNumLives;
    }

    public void kill() {
        if (numLives <= 0) {
            System.out.println("Dead");
            return;
        }

        numLives--;
        System.out.println("Ouch");
    }
}
