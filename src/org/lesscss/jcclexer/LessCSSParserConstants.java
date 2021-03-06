/* Generated By:JavaCC: Do not edit this line. LessCSSParserConstants.java */
package org.lesscss.jcclexer;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface LessCSSParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int WHITESPACE = 1;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 3;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 5;
  /** RegularExpression Id. */
  int IMPORT = 6;
  /** RegularExpression Id. */
  int IMPORTANT = 7;
  /** RegularExpression Id. */
  int URL = 8;
  /** RegularExpression Id. */
  int URI = 9;
  /** RegularExpression Id. */
  int LPAREN = 10;
  /** RegularExpression Id. */
  int RPAREN = 11;
  /** RegularExpression Id. */
  int LBRACE = 12;
  /** RegularExpression Id. */
  int RBRACE = 13;
  /** RegularExpression Id. */
  int LBRACKET = 14;
  /** RegularExpression Id. */
  int RBRACKET = 15;
  /** RegularExpression Id. */
  int COLON = 16;
  /** RegularExpression Id. */
  int SEMICOLON = 17;
  /** RegularExpression Id. */
  int COMMA = 18;
  /** RegularExpression Id. */
  int AT = 19;
  /** RegularExpression Id. */
  int DOT = 20;
  /** RegularExpression Id. */
  int HASH = 21;
  /** RegularExpression Id. */
  int ASSIGN = 22;
  /** RegularExpression Id. */
  int LT = 23;
  /** RegularExpression Id. */
  int GT = 24;
  /** RegularExpression Id. */
  int PLUS = 25;
  /** RegularExpression Id. */
  int MINUS = 26;
  /** RegularExpression Id. */
  int STAR = 27;
  /** RegularExpression Id. */
  int SLASH = 28;
  /** RegularExpression Id. */
  int MEASUREMENT = 29;
  /** RegularExpression Id. */
  int EM = 30;
  /** RegularExpression Id. */
  int UNIT = 31;
  /** RegularExpression Id. */
  int PIXELS = 32;
  /** RegularExpression Id. */
  int PERCENT = 33;
  /** RegularExpression Id. */
  int INCHES = 34;
  /** RegularExpression Id. */
  int CENTIMETERS = 35;
  /** RegularExpression Id. */
  int MILIMETERS = 36;
  /** RegularExpression Id. */
  int EX = 37;
  /** RegularExpression Id. */
  int POINT = 38;
  /** RegularExpression Id. */
  int PICA = 39;
  /** RegularExpression Id. */
  int MS = 40;
  /** RegularExpression Id. */
  int S = 41;
  /** RegularExpression Id. */
  int DEGREE = 42;
  /** RegularExpression Id. */
  int NUMBER_LITERAL = 43;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 44;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 45;
  /** RegularExpression Id. */
  int HEX_LITERAL = 46;
  /** RegularExpression Id. */
  int STRING_LITERAL = 47;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 48;
  /** RegularExpression Id. */
  int QUOTE = 49;
  /** RegularExpression Id. */
  int URL_VALUE = 50;
  /** RegularExpression Id. */
  int URI_VALUE = 51;
  /** RegularExpression Id. */
  int SELECTOR_ATTRIBUTE = 52;
  /** RegularExpression Id. */
  int VARIABLE_SELECTOR = 53;
  /** RegularExpression Id. */
  int CLASS_SELECTOR = 54;
  /** RegularExpression Id. */
  int PSEUDO_SELECTOR = 55;
  /** RegularExpression Id. */
  int ID_SELECTOR = 56;
  /** RegularExpression Id. */
  int SELECTOR = 57;
  /** RegularExpression Id. */
  int START_CHARS = 58;
  /** RegularExpression Id. */
  int VALID_CHARS = 59;
  /** RegularExpression Id. */
  int WILDCARD = 60;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_MULTI_LINE_COMMENT = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<WHITESPACE>",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 4>",
    "<SINGLE_LINE_COMMENT>",
    "\"@import\"",
    "\"!important\"",
    "\"url\"",
    "\"uri\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\":\"",
    "\";\"",
    "\",\"",
    "\"@\"",
    "\".\"",
    "\"#\"",
    "\"=\"",
    "\"<\"",
    "\">\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "<MEASUREMENT>",
    "\"em\"",
    "<UNIT>",
    "\"px\"",
    "\"%\"",
    "\"in\"",
    "\"cm\"",
    "\"mm\"",
    "\"ex\"",
    "\"pt\"",
    "\"pc\"",
    "\"ms\"",
    "\"s\"",
    "\"deg\"",
    "<NUMBER_LITERAL>",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<STRING_LITERAL>",
    "<CHARACTER_LITERAL>",
    "<QUOTE>",
    "<URL_VALUE>",
    "<URI_VALUE>",
    "<SELECTOR_ATTRIBUTE>",
    "<VARIABLE_SELECTOR>",
    "<CLASS_SELECTOR>",
    "<PSEUDO_SELECTOR>",
    "<ID_SELECTOR>",
    "<SELECTOR>",
    "<START_CHARS>",
    "<VALID_CHARS>",
    "<WILDCARD>",
  };

}
