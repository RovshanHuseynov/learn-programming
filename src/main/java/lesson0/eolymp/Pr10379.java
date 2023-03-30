package lesson0.eolymp;

import java.util.*;

public class Pr10379 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command;
        int curObject, cntCurObject, max = 0, sizeOfMax, poppedObject;
        Map<Integer, Integer> mapCntObject = new HashMap<>();
        Map<Integer, List<Integer>> listAccordingToCount = new HashMap<>();
        while(in.hasNext()){
            command = in.next();
            if(command.equals("push")){
                curObject = in.nextInt();
                cntCurObject = mapCntObject.getOrDefault(curObject, 0) + 1;
                mapCntObject.put(curObject, cntCurObject);
                max = Math.max(max, cntCurObject);
                List<Integer> integers = listAccordingToCount.getOrDefault(cntCurObject, new ArrayList<>());
                integers.add(curObject);
                listAccordingToCount.put(cntCurObject, integers);
            } else {
                List<Integer> maxCntObjects = listAccordingToCount.get(max);
                sizeOfMax = maxCntObjects.size();
                poppedObject = maxCntObjects.get(maxCntObjects.size()-1);
                mapCntObject.put(poppedObject, mapCntObject.get(poppedObject)-1);
                listAccordingToCount.get(max).remove((Object)poppedObject);
                if(sizeOfMax == 1) max--;
                System.out.println(poppedObject);
                //System.out.println(mapCntObject);
                //System.out.println(listAccordingToCount);
            }
        }
    }
}
/*
push 5
push 4
push 5
push 3
push 4
push 2
push 5
pop
*/
