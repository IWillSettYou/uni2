package race.car;

public class SectorTimer{
    private int[] sectorTimes;

    public SectorTimer(int[] sectorTimes){
        this.sectorTimes = sectorTimes;
    }

    public SectorTimer(boolean yesOrNo, int[] array){
        this.sectorTimes = array;
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