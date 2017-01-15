package regex;

/**
 * Created by George Fouche on 1/9/17.
 */
public enum RegexDefinedCharacter {
    ADIGIT {
        public String toString() {
            return "\\d";
        }

    },
    ANONDIGIT {
        public String toString() {
            return "\\D";
        }
    },

    AWHITESPACE {
        public String toString() {
            return "\\s";
        }
    },

    ANONWHITESACE {
        public String toString() {
            return "\\S";
        }
    },

    AWORD {
        public String toString() {
            return "\\w+";
        }
    },

    ANONWORD {
        public String toString() {
            return "\\W";
        }
    }
}
