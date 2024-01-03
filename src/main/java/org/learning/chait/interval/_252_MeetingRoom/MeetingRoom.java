package org.learning.chait.interval._252_MeetingRoom;

import java.util.*;

/**
 * Description:
 *
 * Given an array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
 *
 * For example,
 * Given [[0, 30],[5, 10],[15, 20]],
 * return false.
 *
 */
public class MeetingRoom {

    /**
     * Sort the interval array on their end time.
     * Scan through the interval array.
     * If end time of an element is not less than or equal to the start of the next, return false.
     */
    public static boolean canAttendMeetings(Interval[] intervals) {
        Comparator<Interval> comparator = (i1, i2) -> i1.getStart() != i2.getStart() ?
                i1.getStart() - i2.getStart() : i1.getEnd() - i2.getEnd();
        Arrays.stream(intervals).sorted(comparator);
        for (int i = 1; i < intervals.length - 1; i++) {
            if( intervals[i-1].getEnd() > intervals[i].getStart() ) {
                return false;
            }
        }
        return true;
    }


}
