package test2;

import java.time.LocalDateTime;

final public class ImmutableDemo {
    private String name;
    private LocalDateTime doj;

    ImmutableDemo(String name, LocalDateTime doj) {
        this.name = name;
        //this.doj = LocalDateTime.of(obj)
    }
}
