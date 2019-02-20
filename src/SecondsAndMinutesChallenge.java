public class SecondsAndMinutesChallenge {
    public static void getDurationString(int minutes, int seconds){
        if (minutes >= 0){
            if (seconds >=0 && seconds <=59){
                int totalSeconds = (minutes * 60) + seconds;
                int totalHours = totalSeconds/3600;
                int totalMinutes = (totalSeconds/60);
                int remainMinutes = totalMinutes%60;
                int remainSeconds = totalSeconds%60;
                String paddedHours = String.format("%02d", totalHours);
                String paddedMinutes = String.format("%02d", remainMinutes);
                String paddedSeconds = String.format("%02d", remainSeconds);
                System.out.println(paddedHours+"h "+paddedMinutes+"m "+paddedSeconds+"s");

            } else {
                System.out.println("Invalid value");
            }
        } else {
            System.out.println("Invalid value");
        }
    }

    public static void getDurationString(int seconds){
        if (seconds >= 0){
            int minutes = seconds/60;
            int remainSeconds = seconds%60;
            getDurationString(minutes, remainSeconds);
        }
    }

    public static void main(String[] args) {
        getDurationString(65, 0);
        getDurationString(125);
    }

}
