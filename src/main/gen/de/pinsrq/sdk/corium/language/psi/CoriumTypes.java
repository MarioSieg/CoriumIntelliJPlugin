// This is a generated file. Not intended for manual editing.
package de.pinsrq.sdk.corium.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.pinsrq.sdk.corium.language.psi.impl.*;

public interface CoriumTypes {

  IElementType BINARY_EXPRESSION = new CoriumElementType("BINARY_EXPRESSION");
  IElementType BINARY_OPERATOR = new CoriumElementType("BINARY_OPERATOR");
  IElementType CALL_EXPRESSION = new CoriumElementType("CALL_EXPRESSION");
  IElementType EXPRESSION = new CoriumElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new CoriumElementType("EXPRESSION_LIST");
  IElementType FUNCTION_DECL = new CoriumElementType("FUNCTION_DECL");
  IElementType IDENTIFIER_EXPRESSION = new CoriumElementType("IDENTIFIER_EXPRESSION");
  IElementType IMMUTABLE_VARIABLE = new CoriumElementType("IMMUTABLE_VARIABLE");
  IElementType LITERAL = new CoriumElementType("LITERAL");
  IElementType LITERAL_EXPRESSION = new CoriumElementType("LITERAL_EXPRESSION");
  IElementType MUTABLE_VARIABLE = new CoriumElementType("MUTABLE_VARIABLE");
  IElementType NATIVE_FUNCTION_DECL = new CoriumElementType("NATIVE_FUNCTION_DECL");
  IElementType PARAMETER = new CoriumElementType("PARAMETER");
  IElementType PARAMETER_LIST = new CoriumElementType("PARAMETER_LIST");
  IElementType PARENTHESIS_EXPRESSION = new CoriumElementType("PARENTHESIS_EXPRESSION");
  IElementType RETURN_STATEMENT = new CoriumElementType("RETURN_STATEMENT");
  IElementType TYPE_NAME = new CoriumElementType("TYPE_NAME");
  IElementType UNARY_EXPRESSION = new CoriumElementType("UNARY_EXPRESSION");
  IElementType UNARY_OPERATOR = new CoriumElementType("UNARY_OPERATOR");

  IElementType ADD = new CoriumTokenType("+");
  IElementType AND = new CoriumTokenType("&");
  IElementType BOOL = new CoriumTokenType("bool");
  IElementType CHAR = new CoriumTokenType("char");
  IElementType CHAR_LITERAL = new CoriumTokenType("CHAR_LITERAL");
  IElementType CLASS = new CoriumTokenType("class");
  IElementType COM = new CoriumTokenType("~");
  IElementType COMMA = new CoriumTokenType(",");
  IElementType COMMENT = new CoriumTokenType("COMMENT");
  IElementType CONST = new CoriumTokenType("const");
  IElementType DIV = new CoriumTokenType("/");
  IElementType EQUALS = new CoriumTokenType("=");
  IElementType FALSE = new CoriumTokenType("false");
  IElementType FLOAT = new CoriumTokenType("float");
  IElementType FLOAT_LITERAL = new CoriumTokenType("FLOAT_LITERAL");
  IElementType FUNCTION = new CoriumTokenType("function");
  IElementType IDENTIFIER = new CoriumTokenType("IDENTIFIER");
  IElementType INT = new CoriumTokenType("int");
  IElementType INT_LITERAL = new CoriumTokenType("INT_LITERAL");
  IElementType LBRACE = new CoriumTokenType("LBRACE");
  IElementType LET = new CoriumTokenType("let");
  IElementType LPAREN = new CoriumTokenType("LPAREN");
  IElementType LROT = new CoriumTokenType("<<<");
  IElementType LSHI = new CoriumTokenType("<<");
  IElementType MOD = new CoriumTokenType("%");
  IElementType MUL = new CoriumTokenType("*");
  IElementType NATIVE = new CoriumTokenType("native");
  IElementType NOT = new CoriumTokenType("!");
  IElementType OR = new CoriumTokenType("|");
  IElementType QUALIFIED_NAME = new CoriumTokenType("QUALIFIED_NAME");
  IElementType RBRACE = new CoriumTokenType("RBRACE");
  IElementType RETURN = new CoriumTokenType("return");
  IElementType RPAREN = new CoriumTokenType("RPAREN");
  IElementType RROT = new CoriumTokenType(">>>");
  IElementType RSHI = new CoriumTokenType(">>");
  IElementType SELF = new CoriumTokenType("self");
  IElementType SEPARATOR = new CoriumTokenType("SEPARATOR");
  IElementType STRING = new CoriumTokenType("string");
  IElementType STRING_LITERAL = new CoriumTokenType("STRING_LITERAL");
  IElementType SUB = new CoriumTokenType("-");
  IElementType TRUE = new CoriumTokenType("true");
  IElementType URSHI = new CoriumTokenType(">>>>");
  IElementType XOR = new CoriumTokenType("^");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BINARY_EXPRESSION) {
        return new CoriumBinaryExpressionImpl(node);
      }
      else if (type == BINARY_OPERATOR) {
        return new CoriumBinaryOperatorImpl(node);
      }
      else if (type == CALL_EXPRESSION) {
        return new CoriumCallExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new CoriumExpressionListImpl(node);
      }
      else if (type == FUNCTION_DECL) {
        return new CoriumFunctionDeclImpl(node);
      }
      else if (type == IDENTIFIER_EXPRESSION) {
        return new CoriumIdentifierExpressionImpl(node);
      }
      else if (type == IMMUTABLE_VARIABLE) {
        return new CoriumImmutableVariableImpl(node);
      }
      else if (type == LITERAL) {
        return new CoriumLiteralImpl(node);
      }
      else if (type == LITERAL_EXPRESSION) {
        return new CoriumLiteralExpressionImpl(node);
      }
      else if (type == MUTABLE_VARIABLE) {
        return new CoriumMutableVariableImpl(node);
      }
      else if (type == NATIVE_FUNCTION_DECL) {
        return new CoriumNativeFunctionDeclImpl(node);
      }
      else if (type == PARAMETER) {
        return new CoriumParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new CoriumParameterListImpl(node);
      }
      else if (type == PARENTHESIS_EXPRESSION) {
        return new CoriumParenthesisExpressionImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new CoriumReturnStatementImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new CoriumTypeNameImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new CoriumUnaryExpressionImpl(node);
      }
      else if (type == UNARY_OPERATOR) {
        return new CoriumUnaryOperatorImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
