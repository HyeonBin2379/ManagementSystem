package vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@code PersonVO} 클래스는 모든 사람 데이터를 저장하기 위한 기본 모델 클래스입니다.
 * 이름 필드를 포함하며, 상속을 통해 다른 VO 클래스에서 재사용할 수 있습니다.
 */
@Data
@NoArgsConstructor
public abstract class PersonVO {
    /** 사람의 이름 */
    private String name;

    /**
     * 이름을 설정하는 생성자입니다.
     *
     * @param name 사람의 이름
     */
    public PersonVO(String name){
        this.name = name;
    }
}
