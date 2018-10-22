import java.util.List;
import java.util.Random;
public class ComputerPlayer {
    public  ComputerPlayer() { }

    public int computeNewPlay(List<Integer> alreadyFilledCells){
        System.out.println("Lista de celulas preenchidas: \n" + alreadyFilledCells);
        int i = 1;
        while(alreadyFilledCells.contains(i)){
            Random generator = new Random();
            i = generator.nextInt(9) + 1;
        }
        return i;
    }
}