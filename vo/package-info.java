/**
 * 이 패키지는 데이터 전송 객체(Value Objects, VO)를 포함하며,
 * 시스템 내에서 데이터 이동 및 데이터 계층 간의 의존성을 최소화하는 역할을 합니다.
 * <p>
 * VO 클래스는 모델 데이터의 구조를 정의하고, 데이터베이스와의 상호작용에서 사용되며,
 * 주로 컨트롤러, 모델, 뷰 간의 데이터 전달에 활용됩니다.
 * </p>
 *
 * <p>
 * <strong>구성 요소:</strong>
 * <ul>
 *     <li>{@link vo.PersonVO} - 모든 사용자 및 직원 데이터의 기본 정보 (예: 이름)를 정의하는 추상 클래스.</li>
 *     <li>{@link vo.EmployeeVO} - 직원 데이터를 정의하는 클래스이며, {@link vo.PersonVO}를 상속받아 사번과 기본 정보를 포함.</li>
 *     <li>{@link vo.FulltimeVO} - 정규직 직원의 데이터를 정의하며, {@link vo.EmployeeVO}를 상속받아 실적, 월급 등의 추가 정보를 관리.</li>
 *     <li>{@link vo.ParttimeVO} - 시간제 근무 직원 데이터를 정의하며, {@link vo.EmployeeVO}를 상속받아 시급, 근무 시간 등을 관리.</li>
 *     <li>{@link vo.StudentVO} - 학생 데이터를 정의하며, {@link vo.PersonVO}를 상속받아 학번, 성적 등 학생 관련 추가 정보를 포함.</li>
 * </ul>
 * </p>
 *
 * <p>
 * 이 패키지의 VO 클래스는 불변(Immutable) 객체 패턴을 **기본 설계 원칙**으로 하며,
 * 데이터를 단순히 저장하고 전달하기 위해 사용됩니다.
 * 주요 필수 라이브러리인 Lombok을 사용하여 코드를 간소화하고, Getter/Setter 및 생성자 자동 생성을 통해 개발 생산성을 높였습니다.
 * </p>
 *
 * <p>
 * <strong>주요 기능:</strong>
 * <ul>
 *     <li>학생, 정규직 직원, 시간제 근무 직원 등의 데이터를 저장하고 전달.</li>
 *     <li>데이터 정렬 및 비교를 위한 {@code Comparable<T>}을 구현.</li>
 *     <li>데이터 필드의 유효성 및 동등성 검사.</li>
 *     <li>데이터를 간단히 출력할 수 있는 {@code toString()} 메서드 제공.</li>
 * </ul>
 * </p>
 *
 * <p>
 * <strong>관련 패키지:</strong>
 * <ul>
 *     <li>{@link model} - 이 패키지와 상호작용하여 VO 클래스 객체를 기반으로 데이터베이스 연산 수행.</li>
 *     <li>{@link controller} - 사용자 요청을 모델 데이터로 매핑할 때 VO 객체를 활용.</li>
 *     <li>{@link view} - 사용자 출력 화면에 VO 객체의 데이터를 표시.</li>
 * </ul>
 * </p>
 *
 * @author 서유미
 * @version 1.0
 * @since 2025.9.9.
 */
package vo;