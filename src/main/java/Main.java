import javax.imageio.metadata.IIOMetadataFormat;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Scanner liczbaPierwsza = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbę: ");
    double x = liczbaPierwsza.nextDouble();
    Scanner liczbaDruga = new Scanner(System.in);
    System.out.println("Podaj drugą liczbę: ");
    double y = liczbaDruga.nextDouble();
    Scanner liczbaTrzecia = new Scanner(System.in);
    System.out.println("Podaj trzecią liczbę: ");
    double z = liczbaTrzecia.nextDouble();
    if(x>y && x>z){
      System.out.println("Największa liczba to: " + x);
    }else{
      if(y>x && y>z){
        System.out.println("Największa liczba to: " + y);
      }else{
        System.out.println("Największa liczba to: " + z);
      }
    }

   }

}
