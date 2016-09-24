package ua.in.gnatyuk.util;

import lombok.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: asutp
 * Date: 24.09.16
 * Time: 8:04
 * To change this template use File | Settings | File Templates.
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Band {
    @Getter@Setter
    List<Artist> artists;
}
