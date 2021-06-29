/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dewbabyo
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Parser {
    // The lexer which will provide the tokens

    private final LexicalAnalyzer lexer;
    private final CodeGenerator codeGenerator = new CodeGenerator();

    /**
     * The constructor initializes the terminal literals in their vectors.
     *
     * @param lexer The Lexer Object
     */
    public Parser(LexicalAnalyzer lexer) {
        this.lexer = lexer;
    }

    /**
     * Begin analyzing...
     *
     * @throws MockCompiler.ParseException
     */
    public void analyze() {
        try {
            // Generate header for our output
            codeGenerator.writeHeader();

            // Start the actual parsing.   
            Sentence("PARSE TREE");     // "PARSE TREE" is just the root node.

            // generate footer for our output
            codeGenerator.writeFooter();

            // The footer for the compiled output
            // For graphically displaying the output.
            // CodeGenerator.openWebGraphViz();

        } catch (ParseException ex) {
            System.err.println("Syntax Error: " + ex);
        }
    }

    // <PROGRAM> ::= <stmt_list> <EOF>
    protected void Program(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<PROGRAM>");
        codeGenerator.addNonTerminalToTree(from, nodeName);

        stmt_list(nodeName);
        
    }

    // <STMT_LIST> ::= <STMT> <STMT_LIST> | <EOS>
    void STMT_LIST(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<STMT_LIST>");
        codeGenerator.addNonTerminalToTree(from, nodeName);

        if (isCurrentToken(TOKEN.STMT)) {
            STMT(nodeName);
            STMT_LIST(nodeName);
        } else {
            EOS(from);
        } 
    }

    // <STMT> ::= <EXPR> <READ> <WRITE>
    void STMT(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<STMT>");
        codeGenerator.addNonTerminalToTree(from, nodeName);

        EXPR(nodeName);
        READ(nodeName);
       WRITE(nodeName);
    }

    // <EXPR> ::= <TERM> <TERM_TAIL> | <<EMPTY>>
    void EXPR(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<EXPR>");

        if (isCurrentToken(TOKEN.TERM)) {
            codeGenerator.addNonTerminalToTree(from, nodeName);
            TERM(nodeName);
            TERM_TAIL(nodeName);
        }
    }

    // <TERM_TAIL> ::= <ADD_OP> <TERM> <TERM_TAIL> | <<EMPTY>>
    void TERM_TAIL(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<TERM_TAIL>");

        if (isCurrentToken(TOKEN.TERM_TAIL)) {
            codeGenerator.addNonTerminalToTree(from, nodeName);
            ADD_OP(nodeName);
            TERM(nodeName);
            TERM_TAIL(nodeName);
        }
    }

    // <TERM> ::= <FACTOR> <FACTOR_TAIL> | <<EMPTY>>
    void TERM(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<TERM>");
        codeGenerator.addNonTerminalToTree(from, nodeName);

        if (isCurrentToken(TOKEN.FACTOR)) { //CHANGE THIS
            FACTOR(nodeName);
        }

        FACTOR(nodeName);
    }

    void FACTOR_TAIL(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<FACTOR_TAIL>");

        if (isCurrentToken(TOKEN)) {
            MULT_OP(nodeName);
            FACTOR(nodeName);
            FACTOR_TAIL(nodeName);
        }


        
    }

    void FACTOR(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<FACTOR>");

        if (isCurrentToken(TOKEN.PREPOSITION)) {
            codeGenerator.addNonTerminalToTree(from, nodeName);
            PREP(nodeName);
            NP(nodeName);
        }
    }

    void ADD_OP(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<PP>");

        if (isCurrentToken(TOKEN.ADDITION)) {
            codeGenerator.addNonTerminalToTree(from, nodeName);
            ADD_OP(nodeName);
        }
        SUB_OP(nodeName);
    }

    void MULT_OP(String from) throws ParseException {
        final String nodeName = codeGenerator.buildNodeName("<PP>");

        if (isCurrentToken(TOKEN.MULTIPLICATIon)) {
            codeGenerator.addNonTerminalToTree(from, nodeName);
            MULT_OP(nodeName);
        }
        DIV_OP(nodeName);
    }

    /////////////////////////////////////////////////////////////////////////////////////
    // For the sake of completeness, each terminal-token has it's own method,
    // though they all do the same thing here.  In a "REAL" program, each terminal
    // would likely have unique code associated with it.
    /////////////////////////////////////////////////////////////////////////////////////
    // <EOS>
    void EOS(String from) throws ParseException {
        ProcessTerminal(TOKEN.EOS, from);
    }

    // <STMT_LIST>
    void STMT_LIST(String from) throws ParseException {
        ProcessTerminal(TOKEN.STATEMENT_LIST, from);
    }

    // <STMT> 
    void STMT(String from) throws ParseException {
        ProcessTerminal(TOKEN.STATEMENT, from);
    }

    // <EXPR> 
    void EXPR(String from) throws ParseException {
        ProcessTerminal(TOKEN.EXPRESSION, from);
    }

    // <READ> 
    void READ(String from) throws ParseException {
        ProcessTerminal(TOKEN.READ, from);
    }

    // <WRITE>
    void WRITE(String from) throws ParseException {
        ProcessTerminal(TOKEN.WRITE, from);
    }

    // <TERM>
    void TERM(String from) throws ParseException {
        ProcessTerminal(TOKEN.TERM, from);
    }

    // <TERM_TAIL>
    void TERM_TAIL(String from) throws ParseException {
        ProcessTerminal(TOKEN.TERM_TAIL, from);
    }

    // <FACTOR_TAIL>
    void FACTOR_TAIL(String from) throws ParseException {
        ProcessTerminal(TOKEN.FACTOR_TAIL, from);
    }

    // <FACTOR>
    void FACTOR(String from) throws ParseException {
        ProcessTerminal(TOKEN.FACTOR, from);
    }

    // <ADD_OP>
    void ADD_OP(String from) throws ParseException {
        ProcessTerminal(TOKEN.ADDITION, from);
        ProcessTerminal(TOKEN.SUBTRACTION, from);
    }

    // <MULT_OP>
    void MULT_OP(String from) throws ParseException {
        ProcessTerminal(TOKEN.MULTIPLICATION, from);
        ProcessTerminal(TOKEN.DIVISION,from);
    }

    ////////////////////////////////////////////////////////////////////////////
    // Terminal:
    // Test it's type and continute if we really have a terminal node, syntax error if fails.
    void ProcessTerminal(TOKEN terminal, String from) throws ParseException {
        final String terminalID = codeGenerator.buildNodeName("<" + terminal.name() + ">");

        if (!isCurrentToken(terminal)) {
            raiseException(terminal, from);
        } else {
            codeGenerator.addNonTerminalToTree(from, terminalID);
            codeGenerator.addTerminalToTree(terminalID, lexer.getLexeme());
            lexer.advanceToken();
        }
    }

    // The code below this point is just a bunch of "helper functions" to keep the
    // parser code (above) a bit cleaner.
    // Simple Wrapper around current token.
    private boolean isCurrentToken(TOKEN token) {
        return token == lexer.getToken();
    }

    // Handle all of the errors in one place for cleaner parser code.
    private void raiseException(TOKEN expected, String from) throws ParseException {
        final String template = "SYNTAX ERROR: '%s' was expected but '%s' was found.";
        String err = String.format(template, expected.toString(), lexer.getLexeme());

        System.out.printf("\t\"%s\" -> {\"%s\"};%n}%n", from, err);
        throw new ParseException(err);
    }

    static class ParseException extends Exception {

        public ParseException(String errMsg) {
            super(errMsg);
        }
    }
}


/** All Of the Tokens Used by the parser **/
enum TOKEN {
    ADD_OP(+, -);
    MULT_OP(*, /);
    START,
    EOF,
    OTHER;

    private final List<String> lexemeList;

    private TOKEN(String... tokenStrings) {
        lexemeList = new ArrayList<>(tokenStrings.length);
        lexemeList.addAll(Arrays.asList(tokenStrings));
    }

    public static TOKEN fromLexeme(final String string) {
        // Just to be safe...
        String lexeme = string.trim();

        // An empty string should mean no more tokens to process.
        if (lexeme.isEmpty()) {
            return EOF;
        }

        // Search through ALL lexemes looking for a match with early bailout.
        for (TOKEN t : TOKEN.values()) {
            if (t.lexemeList.contains(lexeme)) {
                // early bailout.
                return t;
            }
        }

        return OTHER;
    }
}
