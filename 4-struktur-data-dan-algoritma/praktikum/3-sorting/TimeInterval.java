public class TimeInterval
{
    private long startTime, endTime;
    private long elapsedTime;

    public TimeInterval()
    {

    }

    public void startTiming()
    {
        elapsedTime = 0;
        startTime = System.currentTimeMillis();
    }

    public void endTiming()
    {
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
    }

    public double getElapsedTime()
    {
        return (double) elapsedTime / 1000.0;
    }
}