package lesson0.eolymp;

import java.util.*;

public class Pr8515 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s;
        int val,ind,freq;
        boolean homogeneous = false, heterogeneous = false;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            s = in.next();
            val = in.nextInt();

            if(s.equals("insert")) {
                if(list.contains(val)) {
                    homogeneous = true;
                }
                else if(list.size() > 0)
                    heterogeneous = true;
                list.add(val);
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
            else {
                ind = list.indexOf(val);
                if(ind != -1){
                    list.remove(ind);
                    map.put(val, map.get(val)-1);

                    if(list.size() <= 1){
                        homogeneous = false;
                        heterogeneous = false;
                    } else {
                        if(map.values().stream().noneMatch(element -> element > 1)) {
                            homogeneous = false;
                        } else {
                            heterogeneous = true;
                        }
                    }
                }
            }

            if(homogeneous && heterogeneous) System.out.println("both");
            else if(!homogeneous && !heterogeneous) System.out.println("neither");
            else if(homogeneous) System.out.println("homo");
            else System.out.println("hetero");
        }
    }
}
