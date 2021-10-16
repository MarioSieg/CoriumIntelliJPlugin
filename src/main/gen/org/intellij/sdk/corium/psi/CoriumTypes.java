// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.corium.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.corium.psi.impl.*;

public interface CoriumTypes {

  IElementType EXPRESSION = new CoriumElementType("EXPRESSION");
  IElementType FUNCTION_DECL = new CoriumElementType("FUNCTION_DECL");
  IElementType IMMUTABLE_VARIABLE = new CoriumElementType("IMMUTABLE_VARIABLE");
  IElementType LITERAL = new CoriumElementType("LITERAL");
  IElementType MUTABLE_VARIABLE = new CoriumElementType("MUTABLE_VARIABLE");
  IElementType NATIVE_FUNCTION_DECL = new CoriumElementType("NATIVE_FUNCTION_DECL");
  IElementType RETURN_STATEMENT = new CoriumElementType("RETURN_STATEMENT");
  IElementType TYPE_NAME = new CoriumElementType("TYPE_NAME");

  IElementType BOOL = new CoriumTokenType("bool");
  IElementType CHAR = new CoriumTokenType("char");
  IElementType CHAR_LITERAL = new CoriumTokenType("CHAR_LITERAL");
  IElementType COMMENT = new CoriumTokenType("COMMENT");
  IElementType CONST = new CoriumTokenType("const");
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
  IElementType NATIVE = new CoriumTokenType("native");
  IElementType QUALIFIED_NAME = new CoriumTokenType("QUALIFIED_NAME");
  IElementType RBRACE = new CoriumTokenType("RBRACE");
  IElementType RETURN = new CoriumTokenType("return");
  IElementType RPAREN = new CoriumTokenType("RPAREN");
  IElementType SEPARATOR = new CoriumTokenType("SEPARATOR");
  IElementType STRING = new CoriumTokenType("string");
  IElementType STRING_LITERAL = new CoriumTokenType("STRING_LITERAL");
  IElementType TRUE = new CoriumTokenType("true");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == EXPRESSION) {
        return new CoriumExpressionImpl(node);
      }
      else if (type == FUNCTION_DECL) {
        return new CoriumFunctionDeclImpl(node);
      }
      else if (type == IMMUTABLE_VARIABLE) {
        return new CoriumImmutableVariableImpl(node);
      }
      else if (type == LITERAL) {
        return new CoriumLiteralImpl(node);
      }
      else if (type == MUTABLE_VARIABLE) {
        return new CoriumMutableVariableImpl(node);
      }
      else if (type == NATIVE_FUNCTION_DECL) {
        return new CoriumNativeFunctionDeclImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new CoriumReturnStatementImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new CoriumTypeNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
