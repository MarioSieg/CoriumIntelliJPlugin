// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.corium.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.corium.psi.CoriumTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.corium.psi.*;

public class CoriumFunctionDeclImpl extends ASTWrapperPsiElement implements CoriumFunctionDecl {

  public CoriumFunctionDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CoriumVisitor visitor) {
    visitor.visitFunctionDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CoriumVisitor) accept((CoriumVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CoriumImmutableVariable> getImmutableVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CoriumImmutableVariable.class);
  }

  @Override
  @NotNull
  public List<CoriumMutableVariable> getMutableVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CoriumMutableVariable.class);
  }

  @Override
  @NotNull
  public List<CoriumReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CoriumReturnStatement.class);
  }

  @Override
  @Nullable
  public CoriumTypeName getTypeName() {
    return findChildByClass(CoriumTypeName.class);
  }

}
