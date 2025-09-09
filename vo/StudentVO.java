package vo;


import java.util.Objects;

/**
 * {@code StudentVO} 클래스는 학생 데이터를 저장하기 위한 모델 클래스입니다.
 * 학생의 동등성을 비교합니다.
 */

public class StudentVO extends PersonVO implements Comparable<StudentVO> {
    //학번
    private String sno;

    //이름
    private String name;

    private int korean;
    private int english;
    private int math;
    private int science;


    private int total;
    private double average;
    private String grade;

    public StudentVO() {
    }

    public StudentVO(String sno, String name, int korean, int english, int math, int science) {
        this.sno = sno;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.science = science;
    }

    /**
     * 학생의 동등성을 비교한다.
     *
     * @param object 비교할 객체
     * @return 동일한 학번을 가진 경우 {@code true} 그렇지 않으면 {@code false}
     */
    @Override
    public boolean equals(Object obj) {
        StudentVO that = (StudentVO) obj;
        return Objects.equals(sno, that.sno);

    }

    /**
     * 학생의 학번을 기준으로 정렬합니다.
     *
     * @param object 비교할 객체 {@code StudentVO} 객체
     * @return 학번의 문자열 비교 결과
     */
    @Override
    public int compareTo(StudentVO o) {
        return this.sno.compareTo(o.sno);
    }


    /**
     * 학생 정보를 문자열로 변환합니다.
     *
     * @return 포맷팅된 학생 정보
     */
    @Override
    public String toString() {

        String str = "\t%-12s%-11s%-11d%-11d%-11d%-11d%-11d%-12.1f%-8s";
        return String.format(str, sno, name, korean, english, math, science, total, average, grade);
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;

    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
