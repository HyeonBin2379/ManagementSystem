/**
 * 이 패키지는 애플리케이션에서 공통적으로 사용되는 유틸리티 클래스와 설정 파일을 포함합니다.
 * 특히 데이터베이스 연결을 관리하고, 접속 정보를 안전하게 설정 및 읽어오기 위한 기능을 제공합니다.
 * <p>
 * <strong>구성 요소:</strong>
 * <ul>
 *     <li>{@link util.DBUtil} - 데이터베이스 연결 관리 및 드라이버 로딩을 위한 유틸리티 클래스.</li>
 *     <li>dbinfo.properties - 데이터베이스 접속 정보 (드라이버, URL, 사용자 정보, 비밀번호)를 포함한 설정 파일.</li>
 * </ul>
 * </p>
 *
 * <p>
 * DB 설정 파일은 다음 형식을 따릅니다:
 * <pre>
 * driver=com.mysql.cj.jdbc.Driver
 * url=jdbc:mysql://localhost:3306/YOURDATA?serverTimezone=YOURDATA
 * user=YOURDATA
 * password=YOURDATA
 * </pre>
 * </p>
 *
 * <p>
 * 이 패키지의 목적은 애플리케이션 전반에서 공통적으로 사용될 수 있는 데이터베이스 유틸리티 및 설정 파일을 중앙화하여,
 * 데이터 연결 로직의 중복을 줄이고 유지 보수성을 높이는 데 있습니다.
 * </p>
 *
 * <p>
 * <strong>주요 기능:</strong>
 * <ul>
 *     <li>데이터베이스 드라이버 로딩 및 연결 관리.</li>
 *     <li>dbinfo.properties 파일에서 접속 정보를 안전하게 읽어와 DB 연결 객체 반환.</li>
 *     <li>데이터베이스 연결 실패 또는 드라이버 로딩 실패 시 예외 처리.</li>
 * </ul>
 * </p>
 *
 * <p>
 * <strong>관련 패키지:</strong>
 * <ul>
 *     <li>{@link model} - 데이터베이스 연산 수행 시 이 패키지의 DB 연결 객체를 사용.</li>
 *     <li>{@link controller} - 데이터베이스로부터 모델을 통해 가져온 데이터를 처리할 때 유틸리티 클래스 활용.</li>
 * </ul>
 * </p>
 *
 * @author 서유미
 * @version 1.0
 * @since 2025.9.9.
 */
package util;