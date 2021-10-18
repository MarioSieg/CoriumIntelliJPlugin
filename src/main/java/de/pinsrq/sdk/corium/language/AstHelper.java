package de.pinsrq.sdk.corium.language;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import de.pinsrq.sdk.corium.language.psi.CoriumFunctionDecl;
import de.pinsrq.sdk.corium.language.psi.CoriumFile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AstHelper {

    private AstHelper() { }

    public static List<CoriumFunctionDecl> findFunctions(Project project) {
        List<CoriumFunctionDecl> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(CoriumFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            var file = (CoriumFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (file != null) {
                CoriumFunctionDecl[] properties = PsiTreeUtil.getChildrenOfType(file, CoriumFunctionDecl.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}
