// This is a generated file. Not intended for manual editing.
package de.pinsrq.sdk.corium.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CoriumFunctionDecl extends PsiElement {

  @NotNull
  List<CoriumExpression> getExpressionList();

  @NotNull
  List<CoriumImmutableVariable> getImmutableVariableList();

  @NotNull
  List<CoriumMutableVariable> getMutableVariableList();

  @Nullable
  CoriumParameterList getParameterList();

  @NotNull
  List<CoriumReturnStatement> getReturnStatementList();

  @Nullable
  CoriumTypeName getTypeName();

}
