package SpecialCodeProblems.HashTable;

import java.util.HashMap;

/**
 * I wrote a crawler that visits web pages, stores a few keywords in a database, and follows links to other web pages.
 * <p>
 * I noticed that my crawler was wasting a lot of time visiting the same pages over and over, so I made a hash set,
 * visited, where I'm storing URLs I've already visited. Now the crawler only visits a URL if it hasn't already been visited.
 * <p>
 * Thing is, the crawler is running on my old desktop computer in my parents' basement
 * (where I totally don't live anymore), and it keeps running out of memory because visited is getting so huge.
 * <p>
 * How can I trim down the amount of space taken up by visited?
 */
public class MillionGazillion {

    /**
     *
     */
    class TrieNode {
        private HashMap<Character, TrieNode> nodeChildren;

        public TrieNode() {
            this.nodeChildren = new HashMap<>();
        }

        public boolean hasChildNode(char character) {
            return nodeChildren.containsKey(character);
        }

        public void makeChildNode(char character){
            this.nodeChildren.put(character,new TrieNode());
        }

        public TrieNode getChildNode(char character){
            return this.nodeChildren.get(character);
        }
    }

    public class Trie{

        private TrieNode rootNode;
        private final char endOfWorkMarker = '\0';

        public Trie(TrieNode rootNode) {
            this.rootNode = rootNode;
        }


    }
}
