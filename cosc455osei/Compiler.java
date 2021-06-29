/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dewbabyo
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;


public class Compiler {

    // NOTE: THESE ARE ONLY FOR TESTING!!! 
    private static final String DEFAULT_TEST_SENTENCE = "the dog chases the slow , lazy cat up a tall tree and the rat loves the dog .";
     // private static final String DEFAULT_TEST_SENTENCE = "the lazy dog quickly chases the fast , sneaky , furry cat up a tall tree and the rat loves the dog .";
    //private static final String DEFAULT_TEST_SENTENCE = "the dog chases the cat .";

    public static void main(String[] args) throws Parser.ParseException {
        Parser syntaxAnalyzer;

        // If passed a file, process the file, else use the default TESTING string.
        if (args.length < 1) {
            String[] newArgs = new String[]{DEFAULT_TEST_SENTENCE};
            syntaxAnalyzer = new Parser(new LexicalAnalyzer(newArgs[0]));

            System.out.printf("No Filename Provided!  Using default test string instead...%n\t\"%s\"%n%n", DEFAULT_TEST_SENTENCE);
        } else {
            syntaxAnalyzer = new Parser(new LexicalAnalyzer(new File(args[0])));
        }

        // Start processing the input.
        syntaxAnalyzer.analyze();
    }
}

/**
 * Fake Lexical Analyzer... NOTE: This DOES NOT "lex" the input in the traditional manner! Instead
 * of using "state transitions", it is merely a quick hack to create a something that BEHAVES like a
 * traditional lexer in it's USAGE, but it only knows how to separate (tokenize) words delimited by
 * spaces. A Real Lexer would tokenize based upon far more sophisticated lexical rules.
 * <p>
 * AGAIN: ALL TOKENS MUST BE WHITESPACE DELIMITED.
 */
class LexicalAnalyzer {

    // TOKENIZED input.
    Queue<TokenString> tokenList;

    // Just a "Pair Tuple/Struct" for the token type and original string.
    class TokenString {

        private final String lexeme;
        private final TOKEN token;

        public TokenString(String lexeme) {
            this.lexeme = lexeme;
            this.token = TOKEN.fromLexeme(lexeme);
        }
    }

    public LexicalAnalyzer(String inputString) {
        tokenize(inputString);
    }

    public LexicalAnalyzer(File inputFile) {
        try {
            final Stream<String> allLines = Files.lines(inputFile.toPath());
            final String line = allLines.collect(Collectors.joining(" "));

            tokenize(line);
        } catch (IOException ex) {
            Logger.getAnonymousLogger().log(Level.SEVERE, "Error Reading File: {0}", ex);
        }
    }

    private void tokenize(final String line) {
        tokenList = Arrays
                .stream(line.split(" "))
                .map(TokenString::new)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public String getLexeme() {
        return tokenList.isEmpty() ? "" : tokenList.peek().lexeme;
    }

    public TOKEN getToken() {
        return tokenList.isEmpty() ? TOKEN.EOF : tokenList.peek().token;
    }

    public void advanceToken() {
        if (!tokenList.isEmpty()) {
            tokenList.remove();
        }
    }

    @Override
    public String toString() {
        if (!tokenList.isEmpty()) {
            return tokenList.peek().lexeme;
        } else {
            return "!EMPTY!";
        }
    }
}

/**
 * This is a SIMULATION of a "code generator" that simply generates GraphViz output. Technically,
 * this would represent be the "Intermediate Code Generation" step.
 *
 * @author aconover
 */
class CodeGenerator {
    // Keep track of the number of nodes so we can give each node a unique id.
    // (This is mainly for GraphViz, since each unique node must have a unique name.)

    private int nodeCount;

    // Just a pattern for separating the node's name from it's "number"
    final static private Pattern NODE_MATCH_PATTERN = Pattern.compile("([^0-9]*):[0-9]+");

    // Show our progress as we go...
    public void addNonTerminalToTree(String from, String to) {
        final Matcher matcher = NODE_MATCH_PATTERN.matcher(to);
        String toLabel = matcher.matches() ? matcher.group(1) : to;

        System.out.printf("\t\"%s\" -> {\"%s\" [label=\"%s\", shape=rect]};%n", from, to, toLabel);
        nodeCount++;
    }

    // Show the terminals as ovals...
    public void addTerminalToTree(String from, String lexeme) {
        System.out.printf("\t\"%s\" -> {\"%s-%s\" [label=\"%s\", shape=oval]};%n", from, lexeme, nodeCount, lexeme);
        nodeCount++;
    }

    // Build a node name so it can be later "deconstructed" for the output.
    public String buildNodeName(String name) {
        return name + ':' + nodeCount;
    }

    public void writeHeader() {
        // The header for the "compiled" output
        System.out.println("digraph ParseTree {");
        System.out.println("\t{\"PARSE TREE\" [shape=diamond]};");
    }

    public void writeFooter() {
        System.out.println("}");
    }

    /**
     * To open a browser window...
     * <p>
     * FEEL FREE TO IGNORE THIS!!! It's just for opening the default browser, if desired.
     */
    static void openWebGraphViz() {
        final String msg = "To visualize the output, Copy/Paste the \n"
                + "parser output into: http://www.webgraphviz.com\n";

        // Open the default browser with the url:
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                System.out.println(msg);
                int response = JOptionPane.showConfirmDialog(null, msg + "\nOpen Web Graphviz Page?", "Open Web Graphviz Page", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    Desktop.getDesktop().browse(new URI("http://www.webgraphviz.com/"));
                }
            }
        } catch (IOException | URISyntaxException ex) {
            java.util.logging.Logger.getAnonymousLogger().log(java.util.logging.Level.WARNING, "Could not open browser", ex);
        }
    }
}
