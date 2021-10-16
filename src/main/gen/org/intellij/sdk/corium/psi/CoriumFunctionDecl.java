// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.corium.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CoriumFunctionDecl extends PsiElement {

  @NotNull
  List<CoriumImmutableVariable> getImmutableVariableList();

  @NotNull
  List<CoriumMutableVariable> getMutableVariableList();

  @NotNull
  List<CoriumReturnStatement> getReturnStatementList();

  @Nullable
  CoriumTypeName getTypeName();

}
