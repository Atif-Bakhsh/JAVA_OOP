package FileHandling;
//Practice on File Handling.
import java.io.*;
import java.util.*;
public class Driver {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("Test.txt");
//        f.createNewFile();
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("This is line six \n");
        bw.close();
        fw.close();
  /*      File f = new File("Car.txt");
        f.createNewFile();
        Car car = new Car("Lexus", "LFA", 2011);

//        FileWriter fw = new FileWriter(f, true);
//        BufferedWriter bw = new BufferedWriter(fw);
        FileOutputStream outtxt = new FileOutputStream(f,true);
        ObjectOutputStream outBjtxt = new ObjectOutputStream(outtxt);
        outBjtxt.writeObject(car);

        outBjtxt.close();
        outtxt.close();
//*/
        File s = new File("Car.ser");
        s.createNewFile();
        Car car = new Car("Lexus", "LFA", 2011);

        FileOutputStream out = new FileOutputStream(s);
        ObjectOutputStream outBj = new ObjectOutputStream(out);
        outBj.writeObject(car);
        outBj.close();
        out.close();

        Car deserializedCar = null;

        FileInputStream in = new FileInputStream(f);
        ObjectInputStream inBj = new ObjectInputStream(in);
        deserializedCar = (Car) inBj.readObject();
        inBj.close();
        in.close();

        if (deserializedCar != null) {
            System.out.println("Deserialized Car:");
            System.out.println("Make: " + deserializedCar.getMake());
            System.out.println("Model: " + deserializedCar.getModel());
            System.out.println("Year: " + deserializedCar.getYear());
        }

    }
}
