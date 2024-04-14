import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // Change the target to METHOD
@interface ToDo {
    public String description() default "";
}

class TestClass {
    public static void main(String[] args) {};

    @ToDo(description = "Implement the placeholder method functionality")
    public void placeholder() {
        throw new UnsupportedOperationException("Placeholder method not implemented!");
    }
}