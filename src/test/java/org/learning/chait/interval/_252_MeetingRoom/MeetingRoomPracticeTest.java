package org.learning.chait.interval._252_MeetingRoom;

import org.junit.*;
import org.junit.rules.*;

import static org.junit.Assert.*;

public class MeetingRoomPracticeTest {

    MeetingRoomPractice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new MeetingRoomPractice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        Interval[] intervals = {
                new Interval( 0, 30),
                new Interval( 5, 10),
                new Interval(15, 20)
        };
        assertTrue(!solution.canAttendMeetings(intervals));
    }

    @Test
    public void Test2() {
        Interval[] intervals = {
                new Interval( 5, 10),
                new Interval(15, 20)
        };
        assertTrue(solution.canAttendMeetings(intervals));
    }

}