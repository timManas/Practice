package Strings.MeetingRooms;

import java.util.*;

public class MeetingRooms {
    public static void main(String [] args) {
        int [][] intervals = {{0,30}, {5,10}, {15,20}};
        System.out.println("AttendAllMeetings: " + canAttendMeetings(intervals));

        int [][] intervals2 = {{7,10}, {2,4}};
        System.out.println("AttendAllMeetings: " + canAttendMeetings(intervals2));

        int [][] intervals3 = {{13,15}, {1,13}};
        System.out.println("AttendAllMeetings: " + canAttendMeetings(intervals3));
    }

    public static boolean canAttendMeetings(int[][] intervals) {

        // Step1 - Create set to store the intervals
        Set<int[]> set = new LinkedHashSet<>();

        // Step2 - Sort the interput array
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });


        // Step3 - Traverse the sorted intervals
        for (int i=0; i<intervals.length; i++) {
            int [] meeting = intervals[i];
            int meetingStart = meeting[0];
            int meetingEnd = meeting[1];

            // Step4 - Fetch the list of sorted intervals and compare to current
            List<int[]> setList = new ArrayList<>(set);
            for (int x=0; x < setList.size(); x++) {
                int startTime = setList.get(x)[0];
                int endTime = setList.get(x)[1];

                // Step5 - Check if within range. If within range, return false
                if (startTime <= meetingStart && meetingStart < endTime)
                    return false;
                if (startTime <= meetingEnd && meetingEnd < endTime)
                    return false;
            }

            set.add(meeting);
        }


        return true;
    }
}
