package ua.in.gnatyuk.util;

import lombok.*;

import java.util.List;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    @Getter @Setter
    String name;
    @Getter @Setter
    List<String> members;
    @Getter @Setter
    String origin;
}
