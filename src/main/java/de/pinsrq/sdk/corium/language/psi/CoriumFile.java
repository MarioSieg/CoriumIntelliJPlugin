package de.pinsrq.sdk.corium.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.psi.FileViewProvider;
import de.pinsrq.sdk.corium.language.CoriumLanguage;
import de.pinsrq.sdk.corium.language.CoriumFileType;
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