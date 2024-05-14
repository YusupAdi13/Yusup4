public class TwiceAsOld{

  public static int TwiceAsOld(int dadYears, int sonYears){
    int ageDifference = Math.abs(dadYears - 2 * sonYears);
        return ageDifference;
    }

    public static void main(String[] args) {
        int dadYearsOld = 40;
        int sonYearsOld = 15;
        int yearsAgoOrInFuture = TwiceAsOld(dadYearsOld, sonYearsOld);
        System.out.println(yearsAgoOrInFuture);
}
}