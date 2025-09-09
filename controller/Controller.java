package controller;

import vo.PersonVO;

/**
 * {@code Controller} 인터페이스는 특정 관리 모듈에서 사용되는 기본 동작을 정의합니다.
 * 주어진 엔터티 데이터를 관리하기 위한 입력, 수정, 삭제, 검색 등의 기능을 제공합니다.
 */
public interface Controller {
    /**
     * 사용자가 선택한 메뉴 번호에 따라 관리 대상을 설정합니다.
     *
     * @param choiceNum 선택된 메뉴 번호 (1: 학생, 2: 정규직 직원, 3: 시간제 직원 등)
     */
    void choice(int choiceNum);

    /**
     * 새로운 데이터를 추가합니다.
     *
     * @param personVO 추가할 데이터 객체
     */
    void input(PersonVO personVO);

    /**
     * 특정 데이터를 삭제합니다.
     *
     * @param deleteNum 삭제할 데이터의 식별 번호
     */
    void delete(String deleteNum);

    /**
     * 기존 데이터를 수정합니다.
     *
     * @param newPerson 수정할 데이터 객체
     */
    void update(PersonVO newPerson);

    /**
     * 주어진 정렬 조건에 따라 데이터를 검색하고 정렬합니다.
     *
     * @param sortNum 정렬 조건 번호 (예: 1: 이름순, 2: 학번/사번순, 3: 성적/실적순 등)
     */
    void totalSearch(int sortNum);

    /**
     * 지정된 조건에 맞는 데이터를 검색합니다.
     *
     * @param searchNum 검색할 데이터의 식별 번호
     */
    void search(String searchNum);
}
