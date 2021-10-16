// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.corium.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.sdk.corium.psi.CoriumTypes.*;
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
    b = adapt_builder_(t, b, this, null);
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
  // literal |
  //     IDENTIFIER
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = literal(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FUNCTION
  //     SEPARATOR
  //     IDENTIFIER
  //     LPAREN
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
    r = consumeTokens(b, 0, FUNCTION, SEPARATOR, IDENTIFIER, LPAREN, RPAREN, SEPARATOR);
    r = r && functionDecl_6(b, l + 1);
    r = r && consumeTokens(b, 0, LBRACE, SEPARATOR);
    r = r && block_(b, l + 1);
    r = r && consumeTokens(b, 0, RBRACE, SEPARATOR);
    exit_section_(b, m, FUNCTION_DECL, r);
    return r;
  }

  // (typeName SEPARATOR)?
  private static boolean functionDecl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDecl_6")) return false;
    functionDecl_6_0(b, l + 1);
    return true;
  }

  // typeName SEPARATOR
  private static boolean functionDecl_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDecl_6_0")) return false;
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
  //     COMMENT |
  //     SEPARATOR
  static boolean globalStatement_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "globalStatement_")) return false;
    boolean r;
    r = functionDecl(b, l + 1);
    if (!r) r = nativeFunctionDecl(b, l + 1);
    if (!r) r = mutableVariable(b, l + 1);
    if (!r) r = immutableVariable(b, l + 1);
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
    r = r && expression(b, l + 1);
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
  //     SEPARATOR
  static boolean localStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localStatement")) return false;
    boolean r;
    r = mutableVariable(b, l + 1);
    if (!r) r = immutableVariable(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
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
    r = r && expression(b, l + 1);
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
  //     LPAREN
  //     RPAREN
  //     SEPARATOR
  public static boolean nativeFunctionDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nativeFunctionDecl")) return false;
    if (!nextTokenIs(b, NATIVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NATIVE, SEPARATOR, FUNCTION, SEPARATOR, IDENTIFIER, LPAREN, RPAREN, SEPARATOR);
    exit_section_(b, m, NATIVE_FUNCTION_DECL, r);
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
    expression(b, l + 1);
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

}
