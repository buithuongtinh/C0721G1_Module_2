package _04_lop_va_doi_tuong_trong_java.bai_tap.class_stop_watch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Thời gian hiện tại: " + stopWatch.getStartTime());

        for (int i = 1; i <= 1000000; i++)

            stopWatch.stop();
        System.out.println("Thời gian kết thúc: " + stopWatch.getEndTime());
        System.out.println("Số mili giây đếm đc: " +stopWatch.getElapsedTime());
    }
}
