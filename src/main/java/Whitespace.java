import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Whitespace {

    public static void main(String[] args) throws IOException {
        Whitespace wspc = new Whitespace();

        // for each file "testdata{1,2,3}.txt
        // read in all the text and
        // send it to countBoth

        wspc.countBoth("a b c d e"); // should print 4, 5

    }

    private void countBoth(String testdata) {

        // count the number of whitepace chars and non-whitspace chars.
        int whiteSpace = 0;
        int nonWhiteSpace = 0;
        // need to use a FOR loop.
        for(int i =0; i <= testdata.length()-1;i++){
            if(testdata.charAt(i) == ' '){
                whiteSpace++;
            }else{
                nonWhiteSpace++;
            }
        }
        // print the results simply on a line #whitespaces, #ofnonwhitespacechars for each file.
        System.out.println(whiteSpace + ", " + nonWhiteSpace);

    }


    // what you CANNOT do is use `Character.isWhitespace()`
    // you have to "write your own" by checking the char against what you think is whitespace
    // you should also USE a FOR loop to step thru each char in the String.
//    private void cannotDoThis(String input) {
//        long wspc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> Character.isWhitespace(c)).count();
//        long nwpsc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> !Character.isWhitespace(new Character(c))).count();
//
//        System.out.printf("%d, %d\n", wspc, nwpsc);
//    }
}
