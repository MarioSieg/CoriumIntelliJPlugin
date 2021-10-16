// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.corium.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class CoriumVisitor extends PsiElementVisitor {

  public void visitExpression(@NotNull CoriumExpression o) {
    visitPsiElement(o);
  }

  public void visitFunctionDecl(@NotNull CoriumFunctionDecl o) {
    visitPsiElement(o);
  }

  public void visitImmutableVariable(@NotNull CoriumImmutableVariable o) {
    visitPsiElement(o);
  }

  public void visitLiteral(@NotNull CoriumLiteral o) {
    visitPsiElement(o);
  }

  public void visitMutableVariable(@NotNull CoriumMutableVariable o) {
    visitPsiElement(o);
  }

  public void visitNativeFunctionDecl(@NotNull CoriumNativeFunctionDecl o) {
    visitPsiElement(o);
  }

  public void visitReturnStatement(@NotNull CoriumReturnStatement o) {
    visitPsiElement(o);
  }

  public void visitTypeName(@NotNull CoriumTypeName o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
