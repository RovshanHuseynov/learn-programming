package lesson0.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr10246 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Data10246> l = new ArrayList<>(n);
        String s, team;
        int cntSolved, timePenalty;
        in.nextLine();
        for(int i=1; i<=n; i++){
            s = in.nextLine();
            team = s.split(" ")[0];
            cntSolved = Integer.parseInt(s.split(" ")[1]);
            timePenalty = Integer.parseInt(s.split(" ")[2]);
            l.add(new Data10246(team, cntSolved, timePenalty));
        }

        l.stream().sorted((o1, o2) -> {
            if (o1.cntSolved != o2.cntSolved) {
                return o2.cntSolved - o1.cntSolved;
            } else if (o1.timePenalty != o2.timePenalty) {
                return o1.timePenalty - o2.timePenalty;
            }
            return o1.team.compareTo(o2.team);
        }).forEach(val -> System.out.println(val.team + " " + val.cntSolved + " " + val.timePenalty));
    }
}

class Data10246 {
    String team;
    int cntSolved;
    int timePenalty;

    public Data10246(String team, int cntSolved, int timePenalty){
        this.team = team;
        this.cntSolved = cntSolved;
        this.timePenalty = timePenalty;
    }
}