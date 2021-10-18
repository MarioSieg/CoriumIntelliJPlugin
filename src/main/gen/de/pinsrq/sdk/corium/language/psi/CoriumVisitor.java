// This is a generated file. Not intended for manual editing.
package de.pinsrq.sdk.corium.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class CoriumVisitor extends PsiElementVisitor {

  public void visitBinaryExpression(@NotNull CoriumBinaryExpression o) {
    visitExpression(o);
  }

  public void visitBinaryOperator(@NotNull CoriumBinaryOperator o) {
    visitPsiElement(o);
  }

  public void visitCallExpression(@NotNull CoriumCallExpression o) {
    visitExpression(o);
  }

  public void visitExpression(@NotNull CoriumExpression o) {
    visitPsiElement(o);
  }

  public void visitExpressionList(@NotNull CoriumExpressionList o) {
    visitPsiElement(o);
  }

  public void visitFunctionDecl(@NotNull CoriumFunctionDecl o) {
    visitPsiElement(o);
  }

  public void visitIdentifierExpression(@NotNull CoriumIdentifierExpression o) {
    visitExpression(o);
  }

  public void visitImmutableVariable(@NotNull CoriumImmutableVariable o) {
    visitPsiElement(o);
  }

  public void visitLiteral(@NotNull CoriumLiteral o) {
    visitPsiElement(o);
  }

  public void visitLiteralExpression(@NotNull CoriumLiteralExpression o) {
    visitExpression(o);
  }

  public void visitMutableVariable(@NotNull CoriumMutableVariable o) {
    visitPsiElement(o);
  }

  public void visitNativeFunctionDecl(@NotNull CoriumNativeFunctionDecl o) {
    visitPsiElement(o);
  }

  public void visitParameter(@NotNull CoriumParameter o) {
    visitPsiElement(o);
  }

  public void visitParameterList(@NotNull CoriumParameterList o) {
    visitPsiElement(o);
  }

  public void visitParenthesisExpression(@NotNull CoriumParenthesisExpression o) {
    visitExpression(o);
  }

  public void visitReturnStatement(@NotNull CoriumReturnStatement o) {
    visitPsiElement(o);
  }

  public void visitTypeName(@NotNull CoriumTypeName o) {
    visitPsiElement(o);
  }

  public void visitUnaryExpression(@NotNull CoriumUnaryExpression o) {
    visitExpression(o);
  }

  public void visitUnaryOperator(@NotNull CoriumUnaryOperator o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
