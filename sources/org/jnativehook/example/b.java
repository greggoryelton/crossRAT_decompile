package org.jnativehook.example;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/* loaded from: hmar6.jar:org/jnativehook/example/b.class */
final class b extends Formatter {
    private b(NativeHookDemo nativeHookDemo) {
    }

    @Override // java.util.logging.Formatter
    public final String format(LogRecord logRecord) {
        StringBuilder sb = new StringBuilder();
        sb.append(new Date(logRecord.getMillis())).append(" ").append(logRecord.getLevel().getLocalizedName()).append(":\t").append(formatMessage(logRecord));
        if (logRecord.getThrown() != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                logRecord.getThrown().printStackTrace(printWriter);
                printWriter.close();
                sb.append(stringWriter.toString());
                stringWriter.close();
            } catch (Exception unused) {
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ b(NativeHookDemo nativeHookDemo, byte b2) {
        this(nativeHookDemo);
    }
}
