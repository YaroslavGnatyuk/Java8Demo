package ua.in.gnatyuk.util;

import lombok.*;

import java.util.List;

/**
 * Created by yroslav on 9/21/16.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Album {
    @Getter@Setter
    String name;
    @Getter@Setter
    List<Composition> tracks;
    @Getter@Setter
    List<Band> musicians;
}
