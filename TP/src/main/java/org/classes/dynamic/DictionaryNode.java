package org.classes.dynamic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DictionaryNode {

    private int key;
    private int value;
    private DictionaryNode next;

}
