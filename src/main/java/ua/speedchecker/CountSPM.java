package ua.speedchecker;

public class CountSPM {
    public double countSpm(int lengthOfPhrase, double timeElapsed) {
        return (lengthOfPhrase / timeElapsed) * 60;
    }

    public double timeElapsed(long startTime, long endTime) {
        return (endTime - startTime) / 1000.0;
    }
}
