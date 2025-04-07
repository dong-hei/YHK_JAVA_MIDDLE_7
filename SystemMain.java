package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간 (밀리초)
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간 (나노초)
        long currentTimeNanoTime = System.nanoTime();
        System.out.println("currentTimeNanoTime = " + currentTimeNanoTime);

        // 환경 변수 읽어오기
        System.out.println("get env = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java Version : " + System.getProperty("java.version"));

        // 배열을 for문 없이 빠르게 복사
        char[] arr = {'s', 'e', 'x', 'y'};
        char[] copiedArr = new char[4];
        System.arraycopy(arr, 0, copiedArr, 0, arr.length);

        //배열 출력
        System.out.println("Array.toString = " + Arrays.toString(copiedArr));

        // 프로그램 종료
        System.exit(0);
        System.out.println("hello"); //종료되서 안나옴
    }

}
