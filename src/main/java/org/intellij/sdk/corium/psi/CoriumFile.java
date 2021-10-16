package org.intellij.sdk.corium.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.psi.FileViewProvider;
import org.intellij.sdk.corium.CoriumFileType;
import org.intellij.sdk.corium.CoriumLanguage;
import org.jetbrains.annotations.NotNull;

public class CoriumFile extends PsiFileBase {

    public CoriumFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CoriumLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public CoriumFileType getFileType() {
        return CoriumFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

}