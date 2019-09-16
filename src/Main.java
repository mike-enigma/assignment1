import com.enigma.model.Direction;
import com.enigma.model.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Input coordinate x,y,DIRECTIONS : ");
        String coordinate= reader.readLine();
        String[] posts = coordinate.split(",");

        Robot optimus = new Robot(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]), Direction.valueOf(posts[2]));

        System.out.print("Input Commends : ");
        String commends = reader.readLine();
        optimus.setCommends(commends);
        optimus.run();
        System.out.println(optimus.print());

    }
}
