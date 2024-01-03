package org.learning.chait.interval._252_MeetingRoom;

import org.junit.Test;
import org.learning.chait.interval._252_MeetingRoom.*;

import static org.assertj.core.api.Assertions.assertThat;

public class MeetingRoomTest {

    @Test
    public void Test1() {
        Interval[] intervals = {
                new Interval( 0, 30),
                new Interval( 5, 10),
                new Interval(15, 20)
        };
        assertThat(MeetingRoom.canAttendMeetings(intervals)).isFalse();

    }

    @Test
    public void Test2() {
        Interval[] intervals = {
                new Interval( 5, 10),
                new Interval(15, 20)
        };
        assertThat(MeetingRoom.canAttendMeetings(intervals)).isTrue();
    }

}