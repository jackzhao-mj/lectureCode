/* We want to make our Dog class into something
 * that can be usefully instantiated. 
 * Each Dog will have its own attributes. */
public class Dog {
    public int size;

    /* This is a CONSTRUCTOR */
    public Dog(int currentSize) {
        size = currentSize;
    }

    /* We take away static, because it is a
     * particular dog that is making noise.
     * Be patient! */
    public void makeNoise() {
        if (size < 10) {
            double[] sound = StdAudio.read("annoying.wav");
            StdAudio.play(sound);
            //System.out.println("yipyipyip.");
        } else if (size < 30) {
            System.out.println("bark!");
        } else {
            double[] sound = StdAudio.read("malamute.wav");
            StdAudio.play(sound);
            //System.out.println("woof. woof.");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.size > d2.size) 
            return d1;
        return d2;
    }
} 

// public Dog thing is equivalent to
// __init__(self, currentSize)