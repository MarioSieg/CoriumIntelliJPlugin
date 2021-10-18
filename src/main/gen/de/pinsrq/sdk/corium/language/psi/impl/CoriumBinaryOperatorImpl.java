// This is a generated file. Not intended for manual editing.
package de.pinsrq.sdk.corium.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.pinsrq.sdk.corium.language.psi.CoriumTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.pinsrq.sdk.corium.language.psi.*;

public class CoriumBinaryOperatorImpl extends ASTWrapperPsiElement implements CoriumBinaryOperator {

  public CoriumBinaryOperatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CoriumVisitor visitor) {
    visitor.visitBinaryOperator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CoriumVisitor) accept((CoriumVisitor)visitor);
    else super.accept(visitor);
  }

}
