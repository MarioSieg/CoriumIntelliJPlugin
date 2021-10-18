package de.pinsrq.sdk.corium.language;

import com.intellij.lexer.FlexAdapter;

public class CoriumLexerAdapter extends FlexAdapter {

    public CoriumLexerAdapter() {
        super(new CoriumLexer(null));
    }

}