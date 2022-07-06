import java.awt.*;

public class Main {

    public static void main(String[] args){
        Build build = new Build();
        HistroyOne histroyOne = new HistroyOne();
        HistoryTwo historyTwo = new HistoryTwo();

        build.PrintMenu();

        historyTwo.PlayGame2();

        histroyOne.playGame();
    }

    }
