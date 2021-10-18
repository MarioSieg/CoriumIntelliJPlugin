package de.pinsrq.sdk.corium.execution;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CoriumRunConfigurationEditor extends SettingsEditor {

    private JPanel head;
    private JCheckBox enableCache;
    private JTextField coriumFlags;
    private JTextField nominaxFlags;
    private JCheckBox debugMode;
    private JComboBox optLevel;
    private JCheckBox verboseLogging;
    private JTextField appFlags;
    private JComboBox strackTrace;
    private JTextField workingDir;
    private JCheckBox productionBuild;

    @Override
    protected void resetEditorFrom(@NotNull Object s) {

    }

    @Override
    protected void applyEditorTo(@NotNull Object s) throws ConfigurationException {

    }

    @Override
    protected @NotNull JComponent createEditor() {
        return head;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
