import java.util.List;
import java.util.Random;
public class ComputerPlayer {
    public  ComputerPlayer() { }

    public int computeNewPlay(List<Integer> alreadyFilledCells){
        int i = 1;
        while(alreadyFilledCells.contains(i)){
            Random generator = new Random();
            i = generator.nextInt(10) + 1;
        }
        return i;
    }
}