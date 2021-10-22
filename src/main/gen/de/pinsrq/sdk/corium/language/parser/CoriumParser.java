// This is a generated file. Not intended for manual editing.
package de.pinsrq.sdk.corium.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static de.pinsrq.sdk.corium.language.psi.CoriumTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CoriumParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return compilationUnit(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(BINARY_EXPRESSION, CALL_EXPRESSION, EXPRESSION, IDENTIFIER_EXPRESSION,
      LITERAL_EXPRESSION, PARENTHESIS_EXPRESSION, UNARY_EXPRESSION),
  };

  /* ********************************************************** */
  // ADD |
  //     SUB |
  //     MUL |
  //     DIV |
  //     MOD |
  //     AND |
  //     OR |
  //     XOR
  public static boolean binaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OPERATOR, "<binary operator>");
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, XOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // localStatement*
  static boolean block_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_")) return false;
    while (true) {
      int c = current_position_(b);
      if (!localStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // globalStatement_*
  static boolean compilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit")) return false;
    while (true) {
      int c = current_position_(b);
      if (!globalStatement_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expression (COMMA SEPARATOR expression)*
  public static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = expression(b, l + 1, -1);
    r = r && expressionList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA SEPARATOR expression)*
  private static boolean expressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_1", c)) break;
    }
    return true;
  }

  // COMMA SEPARATOR expression
  private static boolean expressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, SEPARATOR);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FUNCTION
  //     SEPARATOR
  //     IDENTIFIER
  //     SEPARATOR
  //     LPAREN
  //     parameterList?
  //     RPAREN
  //     SEPARATOR
  //     (typeName SEPARATOR)?
  //     LBRACE
  //     SEPARATOR
  //     block_
  //     RBRACE
  //     SEPARATOR
  public static boolean functionDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDecl")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, SEPARATOR, IDENTIFIER, SEPARATOR, LPAREN);
    r = r && functionDecl_5(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, SEPARATOR);
    r = r && functionDecl_8(b, l + 1);
    r = r && consumeTokens(b, 0, LBRACE, SEPARATOR);
    r = r && block_(b, l + 1);
    r = r && consumeTokens(b, 0, RBRACE, SEPARATOR);
    exit_section_(b, m, FUNCTION_DECL, r);
    return r;
  }

  // parameterList?
  private static boolean functionDecl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDecl_5")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // (typeName SEPARATOR)?
  private static boolean functionDecl_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDecl_8")) return false;
    functionDecl_8_0(b, l + 1);
    return true;
  }

  // typeName SEPARATOR
  private static boolean functionDecl_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDecl_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeName(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // functionDecl |
  //     nativeFunctionDecl |
  //     mutableVariable |
  //     immutableVariable |
  //     expression |
  //     COMMENT |
  //     SEPARATOR
  static boolean globalStatement_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "globalStatement_")) return false;
    boolean r;
    r = functionDecl(b, l + 1);
    if (!r) r = nativeFunctionDecl(b, l + 1);
    if (!r) r = mutableVariable(b, l + 1);
    if (!r) r = immutableVariable(b, l + 1);
    if (!r) r = expression(b, l + 1, -1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, SEPARATOR);
    return r;
  }

  /* ********************************************************** */
  // CONST
  //     SEPARATOR
  //     IDENTIFIER
  //     SEPARATOR
  //     (typeName SEPARATOR)?
  //     EQUALS
  //     SEPARATOR
  //     expression
  //     SEPARATOR
  public static boolean immutableVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "immutableVariable")) return false;
    if (!nextTokenIs(b, CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONST, SEPARATOR, IDENTIFIER, SEPARATOR);
    r = r && immutableVariable_4(b, l + 1);
    r = r && consumeTokens(b, 0, EQUALS, SEPARATOR);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, SEPARATOR);
    exit_section_(b, m, IMMUTABLE_VARIABLE, r);
    return r;
  }

  // (typeName SEPARATOR)?
  private static boolean immutableVariable_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "immutableVariable_4")) return false;
    immutableVariable_4_0(b, l + 1);
    return true;
  }

  // typeName SEPARATOR
  private static boolean immutableVariable_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "immutableVariable_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeName(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INT_LITERAL |
  //     FLOAT_LITERAL |
  //     TRUE |
  //     FALSE |
  //     CHAR_LITERAL |
  //     STRING_LITERAL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, INT_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, CHAR_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // mutableVariable |
  //     immutableVariable |
  //     returnStatement |
  //     expression |
  //     SEPARATOR
  static boolean localStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localStatement")) return false;
    boolean r;
    r = mutableVariable(b, l + 1);
    if (!r) r = immutableVariable(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = expression(b, l + 1, -1);
    if (!r) r = consumeToken(b, SEPARATOR);
    return r;
  }

  /* ********************************************************** */
  // LET
  //     SEPARATOR
  //     IDENTIFIER
  //     SEPARATOR
  //     (typeName SEPARATOR)?
  //     EQUALS
  //     SEPARATOR
  //     expression
  //     SEPARATOR
  public static boolean mutableVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mutableVariable")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LET, SEPARATOR, IDENTIFIER, SEPARATOR);
    r = r && mutableVariable_4(b, l + 1);
    r = r && consumeTokens(b, 0, EQUALS, SEPARATOR);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, SEPARATOR);
    exit_section_(b, m, MUTABLE_VARIABLE, r);
    return r;
  }

  // (typeName SEPARATOR)?
  private static boolean mutableVariable_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mutableVariable_4")) return false;
    mutableVariable_4_0(b, l + 1);
    return true;
  }

  // typeName SEPARATOR
  private static boolean mutableVariable_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mutableVariable_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeName(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NATIVE
  //     SEPARATOR
  //     FUNCTION
  //     SEPARATOR
  //     IDENTIFIER
  //     SEPARATOR
  //     LPAREN
  //     parameterList?
  //     RPAREN
  //     SEPARATOR
  //     typeName?
  public static boolean nativeFunctionDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nativeFunctionDecl")) return false;
    if (!nextTokenIs(b, NATIVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NATIVE, SEPARATOR, FUNCTION, SEPARATOR, IDENTIFIER, SEPARATOR, LPAREN);
    r = r && nativeFunctionDecl_7(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, SEPARATOR);
    r = r && nativeFunctionDecl_10(b, l + 1);
    exit_section_(b, m, NATIVE_FUNCTION_DECL, r);
    return r;
  }

  // parameterList?
  private static boolean nativeFunctionDecl_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nativeFunctionDecl_7")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // typeName?
  private static boolean nativeFunctionDecl_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nativeFunctionDecl_10")) return false;
    typeName(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //     SEPARATOR
  //     typeName
  //     (SEPARATOR EQUALS SEPARATOR expression)?
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, SEPARATOR);
    r = r && typeName(b, l + 1);
    r = r && parameter_3(b, l + 1);
    exit_section_(b, m, PARAMETER, r);
    return r;
  }

  // (SEPARATOR EQUALS SEPARATOR expression)?
  private static boolean parameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_3")) return false;
    parameter_3_0(b, l + 1);
    return true;
  }

  // SEPARATOR EQUALS SEPARATOR expression
  private static boolean parameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SEPARATOR, EQUALS, SEPARATOR);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parameter (COMMA SEPARATOR parameter)*
  public static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter(b, l + 1);
    r = r && parameterList_1(b, l + 1);
    exit_section_(b, m, PARAMETER_LIST, r);
    return r;
  }

  // (COMMA SEPARATOR parameter)*
  private static boolean parameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterList_1", c)) break;
    }
    return true;
  }

  // COMMA SEPARATOR parameter
  private static boolean parameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, SEPARATOR);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RETURN
  //     SEPARATOR
  //     expression?
  //     SEPARATOR
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RETURN, SEPARATOR);
    r = r && returnStatement_2(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expression?
  private static boolean returnStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_2")) return false;
    expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // QUALIFIED_NAME |
  //     INT |
  //     FLOAT |
  //     CHAR |
  //     BOOL |
  //     STRING
  public static boolean typeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAME, "<type name>");
    r = consumeToken(b, QUALIFIED_NAME);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ADD |
  //     SUB |
  //     NOT |
  //     COM
  public static boolean unaryOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATOR, "<unary operator>");
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, COM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expression
  // Operator priority table:
  // 0: ATOM(callExpression)
  // 1: PREFIX(parenthesisExpression)
  // 2: ATOM(literalExpression)
  // 3: ATOM(identifierExpression)
  // 4: BINARY(binaryExpression)
  // 5: PREFIX(unaryExpression)
  public static boolean expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = callExpression(b, l + 1);
    if (!r) r = parenthesisExpression(b, l + 1);
    if (!r) r = literalExpression(b, l + 1);
    if (!r) r = identifierExpression(b, l + 1);
    if (!r) r = unaryExpression(b, l + 1);
    p = r;
    r = r && expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 4 && binaryExpression_0(b, l + 1)) {
        r = expression(b, l, 4);
        exit_section_(b, l, m, BINARY_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // IDENTIFIER SEPARATOR LPAREN expressionList? RPAREN
  public static boolean callExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callExpression")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, IDENTIFIER, SEPARATOR, LPAREN);
    r = r && callExpression_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, CALL_EXPRESSION, r);
    return r;
  }

  // expressionList?
  private static boolean callExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callExpression_3")) return false;
    expressionList(b, l + 1);
    return true;
  }

  public static boolean parenthesisExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesisExpression")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r;
    r = p && expression(b, l, 1);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, PARENTHESIS_EXPRESSION, r, p, null);
    return r || p;
  }

  // literal
  public static boolean literalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPRESSION, "<literal expression>");
    r = literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER
  public static boolean identifierExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierExpression")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    exit_section_(b, m, IDENTIFIER_EXPRESSION, r);
    return r;
  }

  // SEPARATOR binaryOperator SEPARATOR
  private static boolean binaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SEPARATOR);
    r = r && binaryOperator(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean unaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unaryOperator(b, l + 1);
    p = r;
    r = p && expression(b, l, -1);
    exit_section_(b, l, m, UNARY_EXPRESSION, r, p, null);
    return r || p;
  }

}
