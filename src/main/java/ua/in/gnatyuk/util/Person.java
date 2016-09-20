package ua.in.gnatyuk.util;

import lombok.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Getter @Setter
    Integer id;
    @Getter @Setter
    String firstName;
    @Getter @Setter
    String lastName;
}
