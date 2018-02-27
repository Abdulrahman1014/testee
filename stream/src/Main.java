import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import java.lang.String;

public class Main {


    public static void main(String[] args) throws IOException {
//        String [] names = {"bar","dar","aar","ffd","fff","code",
//                "gogog","fffffd","bbbvc"};
//        Arrays.stream(names)
//                .filter(x -> x.startsWith("f"))
//                .sorted()
//                .forEach(System.out::println);
/*
        ArrayList<String> people = new ArrayList<String>("Ali","Omar","Abed");
   */

//    List<String> people = Arrays.asList("bA","Bc","","cV");
//    people
//            .parallelStream()
//            .map(String::toLowerCase)
//            .filter(x -> x.startsWith("b"))
//            .forEach(System.out::println);
        try {
            Stream<String> bands = Files.lines(Paths.get("src /bands.txt"));
            bands
                    .sorted()
                    .filter(x -> x.length() > 9)
                    .forEach(x -> System.out.println(x));
            bands.close();
        }
        catch (IOException e)
        {
            System.out.println("Path is not found");
        }

    }
}
