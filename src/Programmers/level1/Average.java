package Programmers.level1;

/*
 * 정수를 담고있는 배열 arr의 평균값을 리턴하는 함수를 만들기
 * */

public class Average {
	 public double solution(int[] arr) {
        //배열 값 모두 더하기
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        //평균 구하기
        double answer = (double) sum / arr.length;
        return answer;
    }
}
