package model;

import vo.PersonVO;

/**
 * {@code DBCommon} 인터페이스는 데이터베이스와 관련된 공통 작업을 정의합니다.
 * 정보 입력, 삭제, 수정, 검색, 정렬 등의 기능을 포함합니다.
 */
public interface DBCommon {
    /**
     * 새로운 데이터를 입력하는 메서드입니다.
     *
     * @param personVO 입력할 데이터의 정보
     */
    void input(PersonVO personVO);

    /**
     * 데이터를 삭제하는 메서드입니다.
     *
     * @param deleteNum 삭제할 객체를 식별하는 번호
     */
    void delete(String deleteNum);

    /**
     * 데이터 정보를 수정하는 메서드입니다.
     *
     * @param personVO 수정할 데이터의 정보
     */
    void update(PersonVO personVO);

    /**
     * 데이터를 정렬하며 전체 검색을 수행하는 메서드입니다.
     *
     * @param sortNum 정렬 기준 번호
     */
    void totalSearch(int sortNum);

    /**
     * 특정 데이터를 검색하는 메서드입니다.
     *
     * @param searchNum 검색할 번호
     */
    void search(String searchNum);

    /**
     * 데이터를 정렬하는 메서드입니다.
     *
     * @param sortNum 정렬 기준 번호
     */
    void sort(int sortNum);
}
