package race.car;

public class WrongSectorTimer2{
    private int[] sectorTimes;

    public WrongSectorTimer2(int[] sectorTimes){
        int[] xd = {1,2,3};
        this.sectorTimes = xd;
    }

    public int getLapTime(int idx){
        return idx;
    }

    public int getSectorTime(int idx){
        return idx;
    }

    public void setSectorTimes(int[] idx){
        this.sectorTimes = idx;
    }

    public int[] getSectorTimes(){
        return sectorTimes;
    }


}