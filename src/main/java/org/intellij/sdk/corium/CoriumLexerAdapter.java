package org.intellij.sdk.corium;

import com.intellij.lexer.FlexAdapter;

public class CoriumLexerAdapter extends FlexAdapter {

    public CoriumLexerAdapter() {
        super(new CoriumLexer(null));
    }

}