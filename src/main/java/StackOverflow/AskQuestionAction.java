package StackOverflow;

import com.intellij.ide.BrowserUtil;
import com.intellij.lang.Language;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AskQuestionAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        BrowserUtil.browse("https://stackoverflow.com/questions/ask");
    }
}
