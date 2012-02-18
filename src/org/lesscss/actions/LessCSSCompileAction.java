package org.lesscss.actions;

import com.googlecode.lesscss4j.LessCompiler;
import com.googlecode.lesscss4j.LessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import org.lesscss.LessCSSDataObject;
import org.netbeans.modules.csl.api.UiUtils;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;

@ActionID(category = "Tools", id = "org.lesscss.actions.LessCSSCompileAction")
@ActionRegistration(displayName = "#CTL_LessCSSCompileAction")
@ActionReferences({
        @ActionReference(path = "Loaders/text/x-lesscss/Actions", position = 0)
})
//@Messages("CTL_LessCSSCompileAction= Compile LESS")

public final class LessCSSCompileAction implements ActionListener {

        private final LessCSSDataObject context;

        public LessCSSCompileAction(LessCSSDataObject context) {
                this.context = context;
        }

        @Override
        public void actionPerformed(ActionEvent ev) {
                FileObject fo = context.getPrimaryFile();
                String fileName = FileUtil.getFileDisplayName(fo);
                fileName = fileName.replace(".less", ".css"); // NOI18N
                LessCompiler lessCompiler = new LessCompiler();
                File css = new File(fileName);
                try {
                        lessCompiler.compile(FileUtil.toFile(fo), css);
                } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                } catch (LessException ex) {
                        NotifyDescriptor nd = new NotifyDescriptor.Message(ex.getMessage());
                        DialogDisplayer.getDefault().notify(nd);
                }
                FileObject cssfo = FileUtil.toFileObject(css);
                if(cssfo != null){
                        UiUtils.open(cssfo, 0);
                }
        }
}
