package org.learning.chait.interval._252_MeetingRoom;

import java.util.*;

public class MeetingRoomPractice {
    /**
     * Sort based on end time
     * iterate over intervals and check if ith and ith+1 terms end and start time overlap
     */
    public boolean canAttendMeetings(Interval[] intervals) {
        Comparator<Interval> comparator = (i1, i2) -> i1.getStart() != i2.getStart() ?
                i1.getStart() - i2.getStart() : i1.getEnd() - i2.getEnd();
        Arrays.stream(intervals).sorted(comparator);

        for (int i = 1; i < intervals.length; i++) {
            if( intervals[i-1].getEnd() > intervals[i].getStart() ) {
                return false;
            }
        }

        return true;
    }

}
