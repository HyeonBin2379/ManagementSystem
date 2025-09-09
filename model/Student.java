package model;

import vo.StudentVO;

/**
 * {@code Student} 인터페이스는 학생 관리 기능을 정의하는 인터페이스입니다.
 * 총점 계산, 평균 계산, 학점 계산 등 학생 관련 기능을 제공합니다.
 */
public interface Student extends DBCommon {
    /**
     * 학생의 총점을 계산합니다.
     *
     * 국어, 영어, 수학, 과학 점수를 합산하여 총점을 계산합니다.
     *
     * @param studentVO 총점을 계산할 학생 객체
     */
    void total(StudentVO studentVO);

    /**
     * 학생의 평균 점수를 계산합니다.
     *
     * 총점을 과목 수로 나누어 평균값을 계산합니다.
     *
     * @param studentVO 평균 점수를 계산할 학생 객체
     */
    void average(StudentVO studentVO);

    /**
     * 학생의 등급을 결정합니다.
     *
     * 평균 점수에 따라 등급을 다음과 같이 지정합니다:
     * - 90점 이상: A
     * - 80점 이상: B
     * - 70점 이상: C
     * - 60점 이상: D
     * - 60점 미만: F
     *
     * @param studentVO 등급을 계산할 학생 객체
     */
    void grade(StudentVO studentVO);
}
