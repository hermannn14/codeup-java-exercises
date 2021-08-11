import java. util. Random;
public class ServerNameGenerator {

    public static void main(String[] args) {
        String [] Adjectives={"fat", "loser", "tall", "young", "old", "mean", "brave", "silly", "stout", "weak"};
        String [] Noun={"Oscar", "Eli", "Ozzy", "Herman", "Sam", "Ry", "John", "victor", "larry", "peter"};

        String[] arr={"fat", "loser", "tall", "young", "old", "mean", "brave", "silly", "stout", "weak"};
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
        System.out.println(arr[randomNumber]);



    }

}
