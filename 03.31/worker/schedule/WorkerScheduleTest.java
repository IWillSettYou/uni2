
package worker.schedule;

import module java.base;


import static org.junit.jupiter.api.Assertions.*;
import module org.junit.jupiter;
import module java.base;
import java.util.*;

public class WorkerScheduleTest{

    WorkerSchedule wtw = new WorkerSchedule();

    @Test
    public void emptySchedule(){
        HashSet<String> workers = new HashSet<String>();

        workers.add("w");
        wtw.add(3, workers);
        assertTrue(wtw.isWorkingOnWeek("w", 3));
        assertFalse(wtw.isWorkingOnWeek("w", 5));
    }

}