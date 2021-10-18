// This is a generated file. Not intended for manual editing.
package de.pinsrq.sdk.corium.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.pinsrq.sdk.corium.language.psi.CoriumTypes.*;
import de.pinsrq.sdk.corium.language.psi.*;

public class CoriumBinaryExpressionImpl extends CoriumExpressionImpl implements CoriumBinaryExpression {

  public CoriumBinaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CoriumVisitor visitor) {
    visitor.visitBinaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CoriumVisitor) accept((CoriumVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CoriumBinaryOperator getBinaryOperator() {
    return findNotNullChildByClass(CoriumBinaryOperator.class);
  }

  @Override
  @NotNull
  public List<CoriumExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CoriumExpression.class);
  }

}
