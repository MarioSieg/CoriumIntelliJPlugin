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

public class CoriumLiteralImpl extends ASTWrapperPsiElement implements CoriumLiteral {

  public CoriumLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CoriumVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CoriumVisitor) accept((CoriumVisitor)visitor);
    else super.accept(visitor);
  }

}
