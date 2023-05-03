package uml;

import java.time.LocalDateTime;

public class Crew {
    public String getScheduleToFormat(Schedule schedule) {
        LocalDateTime time = schedule.getLocalDateTime();
        // something...
        // 원하는 날짜 포맷으로 변환
        return time.toString();
    }
}

class Schedule {
    private LocalDateTime localDateTime;

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}

