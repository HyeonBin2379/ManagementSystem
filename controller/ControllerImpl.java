package controller;

import model.StudentDAO;
import vo.PersonVO;


/**
 * {@code ControllerImpl} 클래스는 {@link Controller} 인터페이스를 구현하는 클래스입니다.
 * 이 클래스는 학생, 정규직 직원, 시간제 직원 관리를 위한 다양한 기능을 제공합니다.
 */
public class ControllerImpl implements Controller {

    /**
     * 학생 정보를 관리하는 DAO 객체
     */
    private StudentDAO student;



    /**
     * 현재 선택된 모델 (1: 학생, 2: 정규직 직원, 3: 시간제 직원)
     */
    private int selectModel = 0;

    /**
     * Singleton 패턴을 위한 ControllerImpl 객체
     */
    private static ControllerImpl service;

    /**
     * ControllerImpl의 생성자.
     * Singleton 패턴을 위해 private으로 선언되었습니다.
     */
    private ControllerImpl(){ }

    /**
     * Singleton 패턴으로 인스턴스를 반환하는 메서드.
     *
     * @return {@code ControllerImpl}의 Singleton 인스턴스
     */
    public static ControllerImpl getInstance(){
        if(service==null) service = new ControllerImpl();

        return service;
    }

    /**
     * 사용자가 선택한 메뉴 번호에 따라 어떤 모델을 관리할지 {@code selectModel}변수를 설정하는 메서드입니다.
     *
     * @param choiceNum 선택된 메뉴 번호 (1: 학생, 2: 정규직 직원, 3: 시간제 직원, 4: 종료)
     */
    @Override
    public void choice(int choiceNum) {
        //System.out.println("choice선택");
        switch (choiceNum){
            case 1:
                this.selectModel = 1;
                student = StudentDAO.getInstance();
                break;
            case 2:
                this.selectModel = 2;

                break;
            case 3:
                this.selectModel = 3;

                break;
            case 4:
                System.exit(0);
                break;
        }
    }


    /**
     * 지정된 데이터를 추가합니다.
     *
     * @param personVO 추가할 데이터 객체
     */
    @Override
    public void input(PersonVO personVO) {
        if (this.selectModel == 1) {
            student.input(personVO);
        }
    }

    /**
     * 현재 선택된 모델에 대해 특정 데이터를 삭제합니다.
     *
     * @param deleteNum 삭제할 데이터의 식별 번호
     */
    @Override
    public void delete(String deleteNum) {
        if (this.selectModel == 1) {
            student.delete(deleteNum);
        }
    }

    /**
     * 기존 데이터를 수정합니다.
     *
     * @param personVO 수정할 데이터 객체
     */
    @Override
    public void update(PersonVO personVO) {
        if (this.selectModel == 1) {
            student.update(personVO);
        }
    }

    /**
     * 현재 선택된 모델에 대해 지정된 정렬 조건에 따라 데이터를 검색하고 정렬합니다.
     * 정규직 데이터를 검색할 경우, 월급 인상 여부에 대한 추가 입력을 받을 수 있습니다.
     *
     * @param sortNum 정렬 조건 번호 (1: 이름순, 2: 학번/사번순, 3: 성적/실적순 등)
     */
    @Override
    public void totalSearch(int sortNum) {
        if (this.selectModel == 1) {
            student.totalSearch(sortNum);
        }
    }

    /**
     * 현재 선택된 모델의 데이터를 특정 조건에 따라 검색합니다.
     *
     * @param searchNum 검색할 데이터의 식별 번호
     */
    @Override
    public void search(String searchNum) {
        if (this.selectModel == 1) {
            student.search(searchNum);
        }
    }
}
