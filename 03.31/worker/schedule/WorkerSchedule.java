package worker.schedule;

import java.util.*;

public class WorkerSchedule{

    private HashMap<Integer, HashSet<String>> weekToWorkers = new HashMap<>();

    public void add(int week, HashSet<String> workers){
        weekToWorkers.put(week, workers);
        
    }

    public void add(HashSet<Integer> week, ArrayList<String> worker){
        HashSet<String> WOOO = new HashSet<String>();
        for(String w : worker){
            WOOO.add(w);
        }
        for(Integer wee : week){
            add(wee, WOOO);
        }
    }

    public boolean isWorkingOnWeek(String worker, int week){
        for(int day : weekToWorkers.keySet()){
            if(weekToWorkers.get(day).contains(worker) && day == week) return true;
        }
        return false;
    }

    public HashSet<Integer> getWorkWeeks(String worker){
        HashSet<Integer> NAPOK_GEC = new HashSet<Integer>();
        for(int day : weekToWorkers.keySet()){
            if(weekToWorkers.get(day).contains(worker)) NAPOK_GEC.add(day);
        }
        return NAPOK_GEC;
    }
}