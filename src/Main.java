import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        Integer[] array = new Integer[30];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(-30, 30);
//        }
//        System.out.println(Arrays.toString(array));
//
//        long count = Arrays.stream(array).filter(x -> x > 0)
//                .count();
//
//        System.out.println("count : "+ count);
//

                Stream<Programmer> programmerStream = Stream.of(
                new Programmer("Asan", 41000, Programmers.FRONTEND),
                new Programmer("Nurik", 34000, Programmers.ANDROID),
                new Programmer("Bernur", 32000, Programmers.PYTHON),
                new Programmer("Oljaz", 45000, Programmers.FRONTEND),
                new Programmer("Isa", 34000, Programmers.BACKEND),
                new Programmer("Illogic", 32000, Programmers.ANDROID)
        );


//                programmerStream.sorted(Comparator.comparing(Programmer::getName)).forEach(System.out::println);
//        programmerStream.filter(s -> s.getName().startsWith("A")).forEach(System.out::println);
//        System.out.println(programmerStream.max(Comparator.comparing(Programmer::getSalary)).get());
//        System.out.println(programmerStream.min(Comparator.comparing(Programmer::getSalary)).get());
//        System.out.println(programmerStream.count());
        programmerStream.skip(3).forEach(System.out::println);
//        System.out.println(programmerStream.map(Programmer::getName).toList());
//        System.out.println(programmerStream.map(Programmer::getSalary).reduce((double) 0, (a, b) -> a + b));
//        System.out.println(programmerStream.findFirst());
//        System.out.println(programmerStream.findAny());





//        List<String> name = Arrays.asList("Madina", "Damir","Bek","Alina","Aigerim");
//        name.stream().peek(System.out::print)
//    .map(String::length).forEach(s -> System.out.println(": "+s+ " tamga\n"));


    }
}