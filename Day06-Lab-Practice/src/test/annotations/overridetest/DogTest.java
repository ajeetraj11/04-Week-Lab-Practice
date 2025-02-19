package annoations.overridetest;

import com.annotations.override.Animal;
import com.annotations.override.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


 class DogTest {

     @Test
   public void testDogMakeSound() {

        // Creating an instance of Dog and calling makeSound()
        Animal myDog = new Dog();

        // Expected output
        String expectedOutput = "Bark! Bark!\n";

        // Comparing expected and actual output
        assertTrue(expectedOutput.equals(myDog.makeSound()), "Dog's makeSound() should print 'Bark! Bark!'");
    }
}
