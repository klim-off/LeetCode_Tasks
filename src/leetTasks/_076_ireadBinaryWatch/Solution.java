package leetTasks._076_ireadBinaryWatch;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int turnedOn = 3;
        System.out.println(readBinaryWatch(turnedOn).toString());

    }

    public  static List<String> readBinaryWatch(int turnedOn) {
        List <String> times = new ArrayList<>();

        for (int hour = 0; hour <12 ; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn )
                    times.add(String.format("%d:%02d", hour,minute));
            }
        }
        return times;
    }
}
