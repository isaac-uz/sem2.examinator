import java.lang.annotation.*;

// Declare a repeatable annotation Author
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Authors.class)
@interface Author {
    String name();
    String email();
}

// Declare a container annotation Authors for the repeatable Author annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Authors {
    Author[] value();
}

// Annotate the TestClass with the Authors annotation, containing multiple Author annotations
@Authors({
        @Author(name = "John Doe", email = "john.doe@example.com"),
        @Author(name = "Jane Smith", email = "jane.smith@example.com")
})
class TestClass {

}