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

public class CoriumCallExpressionImpl extends CoriumExpressionImpl implements CoriumCallExpression {

  public CoriumCallExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull CoriumVisitor visitor) {
    visitor.visitCallExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CoriumVisitor) accept((CoriumVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CoriumExpressionList getExpressionList() {
    return findChildByClass(CoriumExpressionList.class);
  }

}
