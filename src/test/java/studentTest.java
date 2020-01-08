import static org.junit.Assert.assertEquals;

public class studentTest {
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void belowZero() throws Exception {
        student std = new student();

        std.getAttendanceGrade(-1);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void muchBelowZero() throws Exception {
        student std = new student();
        std.getAttendanceGrade(-42);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void above100() throws Exception {
        student std = new student();
        std.getAttendanceGrade(101);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void muchAbove100() throws Exception {
        student std = new student();
        std.getAttendanceGrade(142);
    }

    @org.junit.Test
    public void absent() {
        student std = new student();
        assertEquals(student.AttendanceGrade.ABSENT, std.getAttendanceGrade(0));
    }
    @org.junit.Test
    public void lowVeryPoor() {
        student std = new student();
        assertEquals(student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(1));
    }

    @org.junit.Test
    public void highVeryPoor() {
        student std = new student();
        assertEquals(student.AttendanceGrade.VERY_POOR, std.getAttendanceGrade(29));
    }

    @org.junit.Test
    public void lowAverage() {
        student std = new student();
        assertEquals(student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(30));
    }

    @org.junit.Test
    public void highAverage() {
        student std = new student();
        assertEquals(student.AttendanceGrade.AVERAGE, std.getAttendanceGrade(69));
    }

    @org.junit.Test
    public void lowGood() {
        student std = new student();
        assertEquals(student.AttendanceGrade.GOOD, std.getAttendanceGrade(70));
    }

    @org.junit.Test
    public void highGood() {
        student std = new student();
        assertEquals(student.AttendanceGrade.GOOD, std.getAttendanceGrade(89));
    }

    @org.junit.Test
    public void lowVeryGood() {
        student std = new student();
        assertEquals(student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(90));
    }

    @org.junit.Test
    public void highVeryGood() {
        student std = new student();
        assertEquals(student.AttendanceGrade.VERY_GOOD, std.getAttendanceGrade(100));
    }

}