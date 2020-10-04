package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

//lombok을 통해 getter, setter 메서드 ,equals 등 유용한 메서드를 대신 작성해준다.
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
