package org.jabref.model.entry;

import java.util.Set;

import org.jabref.model.ChainNode;
import org.jabref.model.util.OptionalUtil;

/**
 * Represents a keyword in ...
 */
public class Keyword extends ChainNode<Keyword> {

    public static Character HIERARCHICAL_DELIMITER = '>';
    private final String keyword;

    public Keyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Connects all the given keywords into one
     */
    public static Keyword of(String... keywords) {
        if (keywords.length == 0) {
            return new Keyword("");
        }

        Keyword root = new Keyword(keywords[0]);
        for (int i = 1; i < keywords.length; i++) {
            root.addAtEnd(keywords[i]);
        }
        return root;
    }
    ...
